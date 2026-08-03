.class public final enum Lwb/lv;
.super Ljava/lang/Enum;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final g:Lwb/y2;

.field public static final enum h:Lwb/lv;

.field public static final enum i:Lwb/lv;

.field public static final enum j:Lwb/lv;

.field public static final synthetic k:[Lwb/lv;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lwb/lv;

    .line 2
    .line 3
    const-string v1, "TOP"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lwb/lv;->h:Lwb/lv;

    .line 10
    .line 11
    new-instance v1, Lwb/lv;

    .line 12
    .line 13
    const-string v2, "CENTER"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lwb/lv;->i:Lwb/lv;

    .line 20
    .line 21
    new-instance v2, Lwb/lv;

    .line 22
    .line 23
    const-string v3, "BOTTOM"

    .line 24
    .line 25
    const/4 v4, 0x2

    .line 26
    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v2, Lwb/lv;->j:Lwb/lv;

    .line 30
    .line 31
    filled-new-array {v0, v1, v2}, [Lwb/lv;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, Lwb/lv;->k:[Lwb/lv;

    .line 36
    .line 37
    new-instance v0, Lwb/y2;

    .line 38
    .line 39
    const/16 v1, 0x9

    .line 40
    .line 41
    invoke-direct {v0, v1}, Lwb/y2;-><init>(I)V

    .line 42
    .line 43
    .line 44
    sput-object v0, Lwb/lv;->g:Lwb/y2;

    .line 45
    .line 46
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lwb/lv;
    .locals 1

    .line 1
    const-class v0, Lwb/lv;

    .line 2
    .line 3
    invoke-static {v0, p0}, Lj8/b;->g(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lwb/lv;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lwb/lv;
    .locals 1

    .line 1
    sget-object v0, Lwb/lv;->k:[Lwb/lv;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lwb/lv;

    .line 8
    .line 9
    return-object v0
.end method
