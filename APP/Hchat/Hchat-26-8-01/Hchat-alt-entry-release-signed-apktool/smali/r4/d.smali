.class public abstract Lr4/d;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Lv4/d0;

.field public static final b:Lv4/d0;

.field public static final c:Lv4/d0;

.field public static final d:Lv4/d0;

.field public static final e:Lv4/d0;

.field public static final f:Lv4/d0;

.field public static final g:Lv4/d0;

.field public static final h:Lv4/d0;

.field public static final i:Lv4/c0;

.field public static final j:Lv4/c0;

.field public static final k:Lv4/c0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "Ldalvik/annotation/AnnotationDefault;"

    .line 2
    .line 3
    invoke-static {v0}, Lw4/c;->m(Ljava/lang/String;)Lw4/c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lv4/d0;->l(Lw4/c;)Lv4/d0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lr4/d;->a:Lv4/d0;

    .line 12
    .line 13
    const-string v0, "Ldalvik/annotation/EnclosingClass;"

    .line 14
    .line 15
    invoke-static {v0}, Lw4/c;->m(Ljava/lang/String;)Lw4/c;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v0}, Lv4/d0;->l(Lw4/c;)Lv4/d0;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, Lr4/d;->b:Lv4/d0;

    .line 24
    .line 25
    const-string v0, "Ldalvik/annotation/EnclosingMethod;"

    .line 26
    .line 27
    invoke-static {v0}, Lw4/c;->m(Ljava/lang/String;)Lw4/c;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-static {v0}, Lv4/d0;->l(Lw4/c;)Lv4/d0;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, Lr4/d;->c:Lv4/d0;

    .line 36
    .line 37
    const-string v0, "Ldalvik/annotation/InnerClass;"

    .line 38
    .line 39
    invoke-static {v0}, Lw4/c;->m(Ljava/lang/String;)Lw4/c;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-static {v0}, Lv4/d0;->l(Lw4/c;)Lv4/d0;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    sput-object v0, Lr4/d;->d:Lv4/d0;

    .line 48
    .line 49
    const-string v0, "Ldalvik/annotation/MemberClasses;"

    .line 50
    .line 51
    invoke-static {v0}, Lw4/c;->m(Ljava/lang/String;)Lw4/c;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-static {v0}, Lv4/d0;->l(Lw4/c;)Lv4/d0;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    sput-object v0, Lr4/d;->e:Lv4/d0;

    .line 60
    .line 61
    const-string v0, "Ldalvik/annotation/Signature;"

    .line 62
    .line 63
    invoke-static {v0}, Lw4/c;->m(Ljava/lang/String;)Lw4/c;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-static {v0}, Lv4/d0;->l(Lw4/c;)Lv4/d0;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    sput-object v0, Lr4/d;->f:Lv4/d0;

    .line 72
    .line 73
    const-string v0, "Ldalvik/annotation/SourceDebugExtension;"

    .line 74
    .line 75
    invoke-static {v0}, Lw4/c;->m(Ljava/lang/String;)Lw4/c;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-static {v0}, Lv4/d0;->l(Lw4/c;)Lv4/d0;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    sput-object v0, Lr4/d;->g:Lv4/d0;

    .line 84
    .line 85
    const-string v0, "Ldalvik/annotation/Throws;"

    .line 86
    .line 87
    invoke-static {v0}, Lw4/c;->m(Ljava/lang/String;)Lw4/c;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-static {v0}, Lv4/d0;->l(Lw4/c;)Lv4/d0;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    sput-object v0, Lr4/d;->h:Lv4/d0;

    .line 96
    .line 97
    new-instance v0, Lv4/c0;

    .line 98
    .line 99
    const-string v1, "accessFlags"

    .line 100
    .line 101
    invoke-direct {v0, v1}, Lv4/c0;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    sput-object v0, Lr4/d;->i:Lv4/c0;

    .line 105
    .line 106
    new-instance v0, Lv4/c0;

    .line 107
    .line 108
    const-string v1, "name"

    .line 109
    .line 110
    invoke-direct {v0, v1}, Lv4/c0;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    sput-object v0, Lr4/d;->j:Lv4/c0;

    .line 114
    .line 115
    new-instance v0, Lv4/c0;

    .line 116
    .line 117
    const-string v1, "value"

    .line 118
    .line 119
    invoke-direct {v0, v1}, Lv4/c0;-><init>(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    sput-object v0, Lr4/d;->k:Lv4/c0;

    .line 123
    .line 124
    return-void
.end method

.method public static a(Lw4/e;)Lv4/d;
    .locals 5

    .line 1
    invoke-interface {p0}, Lw4/e;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    new-instance v1, Lv4/c;

    .line 6
    .line 7
    invoke-direct {v1, v0}, Lz4/e;-><init>(I)V

    .line 8
    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    move v3, v2

    .line 12
    :goto_0
    if-ge v3, v0, :cond_0

    .line 13
    .line 14
    invoke-interface {p0, v3}, Lw4/e;->getType(I)Lw4/c;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    invoke-static {v4}, Lv4/d0;->l(Lw4/c;)Lv4/d0;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    invoke-virtual {v1, v3, v4}, Lz4/e;->m(ILjava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    add-int/lit8 v3, v3, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    iput-boolean v2, v1, Lz4/j;->g:Z

    .line 29
    .line 30
    new-instance p0, Lv4/d;

    .line 31
    .line 32
    invoke-direct {p0, v1}, Lv4/d;-><init>(Lv4/c;)V

    .line 33
    .line 34
    .line 35
    return-object p0
.end method
