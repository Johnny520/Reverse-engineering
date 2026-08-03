.class public final enum Lwb/t0;
.super Ljava/lang/Enum;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final enum i:Lwb/t0;

.field public static final enum j:Lwb/t0;

.field public static final enum k:Lwb/t0;

.field public static final enum l:Lwb/t0;

.field public static final enum m:Lwb/t0;

.field public static final synthetic n:[Lwb/t0;


# instance fields
.field public final g:Ljava/lang/String;

.field public final h:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Lwb/t0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "\u597d\u53cb"

    .line 5
    .line 6
    const-string v3, "FRIENDS"

    .line 7
    .line 8
    invoke-direct {v0, v1, v3, v2, v2}, Lwb/t0;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lwb/t0;->i:Lwb/t0;

    .line 12
    .line 13
    new-instance v1, Lwb/t0;

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    const-string v3, "\u7fa4\u804a"

    .line 17
    .line 18
    const-string v4, "GROUPS"

    .line 19
    .line 20
    invoke-direct {v1, v2, v4, v3, v3}, Lwb/t0;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v1, Lwb/t0;->j:Lwb/t0;

    .line 24
    .line 25
    new-instance v2, Lwb/t0;

    .line 26
    .line 27
    const/4 v3, 0x2

    .line 28
    const-string v4, "\u516c\u4f17\u53f7"

    .line 29
    .line 30
    const-string v5, "OFFICIALS"

    .line 31
    .line 32
    invoke-direct {v2, v3, v5, v4, v4}, Lwb/t0;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v2, Lwb/t0;->k:Lwb/t0;

    .line 36
    .line 37
    new-instance v3, Lwb/t0;

    .line 38
    .line 39
    const-string v4, "\u6807\u7b7e"

    .line 40
    .line 41
    const-string v5, "\u6807\u7b7e\u597d\u53cb"

    .line 42
    .line 43
    const/4 v6, 0x3

    .line 44
    const-string v7, "LABELS"

    .line 45
    .line 46
    invoke-direct {v3, v6, v7, v4, v5}, Lwb/t0;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    sput-object v3, Lwb/t0;->l:Lwb/t0;

    .line 50
    .line 51
    new-instance v4, Lwb/t0;

    .line 52
    .line 53
    const/4 v5, 0x4

    .line 54
    const-string v6, "\u5168\u90e8"

    .line 55
    .line 56
    const-string v7, "ALL"

    .line 57
    .line 58
    invoke-direct {v4, v5, v7, v6, v6}, Lwb/t0;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    sput-object v4, Lwb/t0;->m:Lwb/t0;

    .line 62
    .line 63
    filled-new-array {v0, v1, v2, v3, v4}, [Lwb/t0;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    sput-object v0, Lwb/t0;->n:[Lwb/t0;

    .line 68
    .line 69
    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2, p1}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lwb/t0;->g:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p4, p0, Lwb/t0;->h:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lwb/t0;
    .locals 1

    .line 1
    const-class v0, Lwb/t0;

    .line 2
    .line 3
    invoke-static {v0, p0}, Lj8/b;->g(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lwb/t0;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lwb/t0;
    .locals 1

    .line 1
    sget-object v0, Lwb/t0;->n:[Lwb/t0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lwb/t0;

    .line 8
    .line 9
    return-object v0
.end method
