# coalesce work on sorting

To understand sorting, it helps to study and program a few
different algorithms. 

Assignments so far have asked for two implementations: 
* selection sort, in hw62<sub>16</sub>
* insertion sort, in hw69<sub>16</sub>

The structure here combines this work,
in preparation for advancing it.
The structure provides an abstract class, `Sorter`,
that holds methods (like `isSorted`) needed for all
implementations of sorting.
Subclasses like `InsertionSorter` will implement
a particular sort algorithm.

## choices in design
Sorter should not be concrete, because I know of no sensible meaning
for `sort()` that is independent of a sort algorithm.

The other choice, making `Sorter` an interface, seems unappealing because
interfaces aim to specify the behavior of a class, as `Comparable` does,
rather than a partial implementation of a class. 
Versions of Java starting with v9 allow class and default
methods in interfaces, making this distinction less clear.
But CoBo plans to de-emphasize abstract classes and interfaces
in future years, so I should limit our use of them.

The current design is limited to `String` data.
That seems needlessly restrictive, since
the sorts will work equally well
on any type that can be compared to itself.
But implementing that  flexibility using Java's generic classes
should remain beyond
the scope of this course, as optional extra education.

