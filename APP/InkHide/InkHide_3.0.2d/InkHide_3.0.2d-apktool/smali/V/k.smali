.class public final LV/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LV/k;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 1
    iget v0, p0, LV/k;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p2, Ljava/io/File;

    .line 7
    .line 8
    invoke-virtual {p2}, Ljava/io/File;->lastModified()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    check-cast p1, Ljava/io/File;

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/io/File;->lastModified()J

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-static {p2, p1}, LD/h;->h(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    return p1

    .line 31
    :pswitch_0
    check-cast p2, Lz0/p;

    .line 32
    .line 33
    iget-wide v0, p2, Lz0/p;->d:J

    .line 34
    .line 35
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    check-cast p1, Lz0/p;

    .line 40
    .line 41
    iget-wide v0, p1, Lz0/p;->d:J

    .line 42
    .line 43
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-static {p2, p1}, LD/h;->h(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    return p1

    .line 52
    :pswitch_1
    check-cast p1, Lb1/j;

    .line 53
    .line 54
    iget-object p1, p1, Lb1/j;->c:Ljava/lang/String;

    .line 55
    .line 56
    check-cast p2, Lb1/j;

    .line 57
    .line 58
    iget-object p2, p2, Lb1/j;->c:Ljava/lang/String;

    .line 59
    .line 60
    invoke-static {p1, p2}, LD/h;->h(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    return p1

    .line 65
    :pswitch_2
    check-cast p1, Lb1/d;

    .line 66
    .line 67
    iget-object p1, p1, Lb1/d;->c:Ljava/lang/String;

    .line 68
    .line 69
    check-cast p2, Lb1/d;

    .line 70
    .line 71
    iget-object p2, p2, Lb1/d;->c:Ljava/lang/String;

    .line 72
    .line 73
    invoke-static {p1, p2}, LD/h;->h(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    return p1

    .line 78
    :pswitch_3
    check-cast p1, Ljava/lang/Comparable;

    .line 79
    .line 80
    check-cast p2, Ljava/lang/Comparable;

    .line 81
    .line 82
    invoke-interface {p1, p2}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    return p1

    .line 87
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
