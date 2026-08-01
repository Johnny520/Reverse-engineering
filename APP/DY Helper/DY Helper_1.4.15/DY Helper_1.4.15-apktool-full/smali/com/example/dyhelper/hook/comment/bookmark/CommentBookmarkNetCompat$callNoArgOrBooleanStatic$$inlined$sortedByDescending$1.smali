.class public final Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat$callNoArgOrBooleanStatic$$inlined$sortedByDescending$1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->callNoArgOrBooleanStatic(Ljava/lang/Class;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/Comparator;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;)I"
        }
    .end annotation

    .line 1
    check-cast p2, Ljava/lang/reflect/Method;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const-string v0, "Retrofit"

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    const/16 v2, 0x64

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    if-eqz p0, :cond_0

    .line 22
    .line 23
    move p0, v2

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move p0, v3

    .line 26
    :goto_0
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    array-length p2, p2

    .line 34
    if-nez p2, :cond_1

    .line 35
    .line 36
    add-int/lit8 p0, p0, 0x14

    .line 37
    .line 38
    :cond_1
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    check-cast p1, Ljava/lang/reflect/Method;

    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    invoke-static {p2, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 53
    .line 54
    .line 55
    move-result p2

    .line 56
    if-eqz p2, :cond_2

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_2
    move v2, v3

    .line 60
    :goto_1
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    array-length p1, p1

    .line 68
    if-nez p1, :cond_3

    .line 69
    .line 70
    add-int/lit8 v2, v2, 0x14

    .line 71
    .line 72
    :cond_3
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-static {p0, p1}, Lbd;->κ(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 77
    .line 78
    .line 79
    move-result p0

    .line 80
    return p0
.end method
