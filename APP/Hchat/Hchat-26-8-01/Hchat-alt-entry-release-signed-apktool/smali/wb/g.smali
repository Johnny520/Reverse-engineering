.class public final enum Lwb/g;
.super Ljava/lang/Enum;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final enum g:Lwb/g;

.field public static final enum h:Lwb/g;

.field public static final enum i:Lwb/g;

.field public static final enum j:Lwb/g;

.field public static final enum k:Lwb/g;

.field public static final enum l:Lwb/g;

.field public static final synthetic m:[Lwb/g;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Lwb/g;

    .line 2
    .line 3
    const-string v1, "MAIN"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lwb/g;->g:Lwb/g;

    .line 10
    .line 11
    new-instance v1, Lwb/g;

    .line 12
    .line 13
    const-string v2, "RULES"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lwb/g;->h:Lwb/g;

    .line 20
    .line 21
    new-instance v2, Lwb/g;

    .line 22
    .line 23
    const-string v3, "EDITOR"

    .line 24
    .line 25
    const/4 v4, 0x2

    .line 26
    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v2, Lwb/g;->i:Lwb/g;

    .line 30
    .line 31
    new-instance v3, Lwb/g;

    .line 32
    .line 33
    const-string v4, "CONTACTS"

    .line 34
    .line 35
    const/4 v5, 0x3

    .line 36
    invoke-direct {v3, v4, v5}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v3, Lwb/g;->j:Lwb/g;

    .line 40
    .line 41
    new-instance v4, Lwb/g;

    .line 42
    .line 43
    const-string v5, "MEMBERS"

    .line 44
    .line 45
    const/4 v6, 0x4

    .line 46
    invoke-direct {v4, v5, v6}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    sput-object v4, Lwb/g;->k:Lwb/g;

    .line 50
    .line 51
    new-instance v5, Lwb/g;

    .line 52
    .line 53
    const-string v6, "TYPES"

    .line 54
    .line 55
    const/4 v7, 0x5

    .line 56
    invoke-direct {v5, v6, v7}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 57
    .line 58
    .line 59
    sput-object v5, Lwb/g;->l:Lwb/g;

    .line 60
    .line 61
    filled-new-array/range {v0 .. v5}, [Lwb/g;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    sput-object v0, Lwb/g;->m:[Lwb/g;

    .line 66
    .line 67
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lwb/g;
    .locals 1

    .line 1
    const-class v0, Lwb/g;

    .line 2
    .line 3
    invoke-static {v0, p0}, Lj8/b;->g(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lwb/g;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lwb/g;
    .locals 1

    .line 1
    sget-object v0, Lwb/g;->m:[Lwb/g;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lwb/g;

    .line 8
    .line 9
    return-object v0
.end method
