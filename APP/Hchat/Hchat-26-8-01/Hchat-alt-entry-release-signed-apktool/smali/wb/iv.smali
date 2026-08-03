.class public final enum Lwb/iv;
.super Ljava/lang/Enum;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final enum i:Lwb/iv;

.field public static final enum j:Lwb/iv;

.field public static final enum k:Lwb/iv;

.field public static final enum l:Lwb/iv;

.field public static final enum m:Lwb/iv;

.field public static final synthetic n:[Lwb/iv;


# instance fields
.field public final g:Ljava/lang/String;

.field public final h:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Lwb/iv;

    .line 2
    .line 3
    const-string v1, "\u5168\u90e8"

    .line 4
    .line 5
    const-string v2, "\u5168\u90e8\u8054\u7cfb\u4eba"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const-string v4, "ALL"

    .line 9
    .line 10
    invoke-direct {v0, v3, v4, v1, v2}, Lwb/iv;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lwb/iv;->i:Lwb/iv;

    .line 14
    .line 15
    new-instance v1, Lwb/iv;

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    const-string v3, "\u597d\u53cb"

    .line 19
    .line 20
    const-string v4, "FRIENDS"

    .line 21
    .line 22
    invoke-direct {v1, v2, v4, v3, v3}, Lwb/iv;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    sput-object v1, Lwb/iv;->j:Lwb/iv;

    .line 26
    .line 27
    new-instance v2, Lwb/iv;

    .line 28
    .line 29
    const/4 v3, 0x2

    .line 30
    const-string v4, "\u7fa4\u804a"

    .line 31
    .line 32
    const-string v5, "GROUPS"

    .line 33
    .line 34
    invoke-direct {v2, v3, v5, v4, v4}, Lwb/iv;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    sput-object v2, Lwb/iv;->k:Lwb/iv;

    .line 38
    .line 39
    new-instance v3, Lwb/iv;

    .line 40
    .line 41
    const/4 v4, 0x3

    .line 42
    const-string v5, "\u516c\u4f17\u53f7"

    .line 43
    .line 44
    const-string v6, "OFFICIALS"

    .line 45
    .line 46
    invoke-direct {v3, v4, v6, v5, v5}, Lwb/iv;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    sput-object v3, Lwb/iv;->l:Lwb/iv;

    .line 50
    .line 51
    new-instance v4, Lwb/iv;

    .line 52
    .line 53
    const-string v5, "\u6807\u7b7e"

    .line 54
    .line 55
    const-string v6, "\u6807\u7b7e\u597d\u53cb"

    .line 56
    .line 57
    const/4 v7, 0x4

    .line 58
    const-string v8, "LABELS"

    .line 59
    .line 60
    invoke-direct {v4, v7, v8, v5, v6}, Lwb/iv;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    sput-object v4, Lwb/iv;->m:Lwb/iv;

    .line 64
    .line 65
    filled-new-array {v0, v1, v2, v3, v4}, [Lwb/iv;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    sput-object v0, Lwb/iv;->n:[Lwb/iv;

    .line 70
    .line 71
    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2, p1}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lwb/iv;->g:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p4, p0, Lwb/iv;->h:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lwb/iv;
    .locals 1

    .line 1
    const-class v0, Lwb/iv;

    .line 2
    .line 3
    invoke-static {v0, p0}, Lj8/b;->g(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lwb/iv;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lwb/iv;
    .locals 1

    .line 1
    sget-object v0, Lwb/iv;->n:[Lwb/iv;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lwb/iv;

    .line 8
    .line 9
    return-object v0
.end method
