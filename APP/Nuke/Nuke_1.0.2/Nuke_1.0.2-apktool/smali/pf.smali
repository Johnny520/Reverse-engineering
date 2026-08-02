.class public final enum Lpf;
.super Ljava/lang/Enum;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final j:Lz8;

.field public static final enum k:Lpf;

.field public static final synthetic l:[Lpf;

.field public static final synthetic m:Lyf0;


# instance fields
.field public final h:I

.field public final i:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lpf;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const v2, 0x790b015b

    .line 5
    .line 6
    .line 7
    const-string v3, "SYSTEM_DEFAULT"

    .line 8
    .line 9
    invoke-direct {v0, v3, v1, v1, v2}, Lpf;-><init>(Ljava/lang/String;III)V

    .line 10
    .line 11
    .line 12
    sput-object v0, Lpf;->k:Lpf;

    .line 13
    .line 14
    new-instance v1, Lpf;

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    const v3, 0x790b0159

    .line 18
    .line 19
    .line 20
    const-string v4, "LIGHT"

    .line 21
    .line 22
    invoke-direct {v1, v4, v2, v2, v3}, Lpf;-><init>(Ljava/lang/String;III)V

    .line 23
    .line 24
    .line 25
    new-instance v2, Lpf;

    .line 26
    .line 27
    const/4 v3, 0x2

    .line 28
    const v4, 0x790b0158

    .line 29
    .line 30
    .line 31
    const-string v5, "DARK"

    .line 32
    .line 33
    invoke-direct {v2, v5, v3, v3, v4}, Lpf;-><init>(Ljava/lang/String;III)V

    .line 34
    .line 35
    .line 36
    filled-new-array {v0, v1, v2}, [Lpf;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    sput-object v0, Lpf;->l:[Lpf;

    .line 41
    .line 42
    new-instance v1, Lyf0;

    .line 43
    .line 44
    invoke-direct {v1, v0}, Lyf0;-><init>([Ljava/lang/Enum;)V

    .line 45
    .line 46
    .line 47
    sput-object v1, Lpf;->m:Lyf0;

    .line 48
    .line 49
    new-instance v0, Lz8;

    .line 50
    .line 51
    const/4 v1, 0x2

    .line 52
    invoke-direct {v0, v1}, Lz8;-><init>(I)V

    .line 53
    .line 54
    .line 55
    sput-object v0, Lpf;->j:Lz8;

    .line 56
    .line 57
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;III)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lpf;->h:I

    .line 5
    .line 6
    iput p4, p0, Lpf;->i:I

    .line 7
    .line 8
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lpf;
    .locals 1

    .line 1
    const-class v0, Lpf;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lpf;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lpf;
    .locals 1

    .line 1
    sget-object v0, Lpf;->l:[Lpf;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lpf;

    .line 8
    .line 9
    return-object v0
.end method
