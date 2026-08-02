.class public final enum Lx51;
.super Ljava/lang/Enum;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final j:Li51;

.field public static final enum k:Lx51;

.field public static final synthetic l:[Lx51;

.field public static final synthetic m:Lyf0;


# instance fields
.field public final h:I

.field public final i:I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lx51;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const v2, 0x790b013e

    .line 5
    .line 6
    .line 7
    const-string v3, "SYSTEM_DEFAULT"

    .line 8
    .line 9
    invoke-direct {v0, v3, v1, v1, v2}, Lx51;-><init>(Ljava/lang/String;III)V

    .line 10
    .line 11
    .line 12
    sput-object v0, Lx51;->k:Lx51;

    .line 13
    .line 14
    new-instance v1, Lx51;

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    const v3, 0x790b013c

    .line 18
    .line 19
    .line 20
    const-string v4, "SIMPLIFIED_CHINESE"

    .line 21
    .line 22
    invoke-direct {v1, v4, v2, v2, v3}, Lx51;-><init>(Ljava/lang/String;III)V

    .line 23
    .line 24
    .line 25
    new-instance v2, Lx51;

    .line 26
    .line 27
    const/4 v3, 0x2

    .line 28
    const v4, 0x790b013f

    .line 29
    .line 30
    .line 31
    const-string v5, "TRADITIONAL_CHINESE"

    .line 32
    .line 33
    invoke-direct {v2, v5, v3, v3, v4}, Lx51;-><init>(Ljava/lang/String;III)V

    .line 34
    .line 35
    .line 36
    new-instance v3, Lx51;

    .line 37
    .line 38
    const/4 v4, 0x3

    .line 39
    const v5, 0x790b013b

    .line 40
    .line 41
    .line 42
    const-string v6, "ENGLISH"

    .line 43
    .line 44
    invoke-direct {v3, v6, v4, v4, v5}, Lx51;-><init>(Ljava/lang/String;III)V

    .line 45
    .line 46
    .line 47
    filled-new-array {v0, v1, v2, v3}, [Lx51;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    sput-object v0, Lx51;->l:[Lx51;

    .line 52
    .line 53
    new-instance v1, Lyf0;

    .line 54
    .line 55
    invoke-direct {v1, v0}, Lyf0;-><init>([Ljava/lang/Enum;)V

    .line 56
    .line 57
    .line 58
    sput-object v1, Lx51;->m:Lyf0;

    .line 59
    .line 60
    new-instance v0, Li51;

    .line 61
    .line 62
    const/4 v1, 0x1

    .line 63
    invoke-direct {v0, v1}, Li51;-><init>(I)V

    .line 64
    .line 65
    .line 66
    sput-object v0, Lx51;->j:Li51;

    .line 67
    .line 68
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;III)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lx51;->h:I

    .line 5
    .line 6
    iput p4, p0, Lx51;->i:I

    .line 7
    .line 8
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lx51;
    .locals 1

    .line 1
    const-class v0, Lx51;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lx51;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lx51;
    .locals 1

    .line 1
    sget-object v0, Lx51;->l:[Lx51;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lx51;

    .line 8
    .line 9
    return-object v0
.end method
