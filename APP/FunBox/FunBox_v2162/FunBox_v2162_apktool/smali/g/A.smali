.class final Lg/A;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lg/C;

    check-cast p2, Lg/C;

    invoke-virtual {p1}, Lg/s;->b()Lg/t;

    move-result-object p1

    invoke-virtual {p2}, Lg/s;->b()Lg/t;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result p1

    return p1
.end method
