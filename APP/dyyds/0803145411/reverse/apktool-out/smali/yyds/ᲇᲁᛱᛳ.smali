.class public final synthetic Lyyds/ᲇᲁᛱᛳ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lio/github/libxposed/api/XposedInterface$Hooker;


# instance fields
.field public final synthetic ᛲᲈᲁ:Lyyds/ᛱᛳᛶᲈ;


# direct methods
.method public synthetic constructor <init>(Lyyds/ᛱᛶᛶᲇ;Lyyds/ᛱᛳᛶᲈ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lyyds/ᲇᲁᛱᛳ;->ᛲᲈᲁ:Lyyds/ᛱᛳᛶᲈ;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final intercept(Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;
    .locals 4

    .line 1
    const-wide v0, -0x388cbe68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    const-wide v0, -0x380d3e68a836eL

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    const-wide v0, -0x380dce68a836eL

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const-wide v1, -0x380e2e68a836eL

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    new-instance v1, Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 43
    .line 44
    .line 45
    new-instance v2, Lyyds/ᛸᛷᲇᛲ;

    .line 46
    .line 47
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-direct {v2, v3, v1, v0, p1}, Lyyds/ᛸᛷᲇᛲ;-><init>(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/List;Lio/github/libxposed/api/XposedInterface$Chain;)V

    .line 52
    .line 53
    .line 54
    iget-object p0, p0, Lyyds/ᲇᲁᛱᛳ;->ᛲᲈᲁ:Lyyds/ᛱᛳᛶᲈ;

    .line 55
    .line 56
    invoke-interface {p0, v2}, Lyyds/ᛱᛳᛶᲈ;->ᛲᛴᛳᛲ(Lyyds/ᛸᛷᲇᛲ;)V

    .line 57
    .line 58
    .line 59
    iget-boolean v0, v2, Lyyds/ᛸᛷᲇᛲ;->ᛲᛴᛳᛲ:Z

    .line 60
    .line 61
    if-eqz v0, :cond_0

    .line 62
    .line 63
    iget-object p0, v2, Lyyds/ᛸᛷᲇᛲ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 64
    .line 65
    return-object p0

    .line 66
    :cond_0
    const/4 v0, 0x0

    .line 67
    new-array v0, v0, [Ljava/lang/Object;

    .line 68
    .line 69
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-interface {p1, v0}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed([Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    new-instance v2, Lyyds/ᛲᲈᛷᛳ;

    .line 78
    .line 79
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-direct {v2, p1, v1, v0}, Lyyds/ᛲᲈᛷᛳ;-><init>(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    invoke-interface {p0, v2}, Lyyds/ᛱᛳᛶᲈ;->ᛷᛵᲇᲀ(Lyyds/ᛲᲈᛷᛳ;)V

    .line 87
    .line 88
    .line 89
    iget-object p0, v2, Lyyds/ᛲᲈᛷᛳ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 90
    .line 91
    return-object p0
.end method
