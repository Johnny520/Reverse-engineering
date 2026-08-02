.class public final enum Lyy2;
.super Ljava/lang/Enum;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final synthetic i:[Lyy2;


# instance fields
.field public final h:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    new-instance v0, Lyy2;

    .line 2
    .line 3
    sget-object v3, Ltp0;->m:Ljava/lang/Object;

    .line 4
    .line 5
    const v4, 0x1040003

    .line 6
    .line 7
    .line 8
    const v5, 0x1010311

    .line 9
    .line 10
    .line 11
    const-string v1, "Cut"

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-direct/range {v0 .. v5}, Lyy2;-><init>(Ljava/lang/String;ILjava/lang/Object;II)V

    .line 15
    .line 16
    .line 17
    new-instance v1, Lyy2;

    .line 18
    .line 19
    sget-object v4, Ltp0;->n:Ljava/lang/Object;

    .line 20
    .line 21
    const v5, 0x1040001

    .line 22
    .line 23
    .line 24
    const v6, 0x1010312

    .line 25
    .line 26
    .line 27
    const-string v2, "Copy"

    .line 28
    .line 29
    const/4 v3, 0x1

    .line 30
    invoke-direct/range {v1 .. v6}, Lyy2;-><init>(Ljava/lang/String;ILjava/lang/Object;II)V

    .line 31
    .line 32
    .line 33
    new-instance v2, Lyy2;

    .line 34
    .line 35
    sget-object v5, Ltp0;->o:Ljava/lang/Object;

    .line 36
    .line 37
    const v6, 0x104000b

    .line 38
    .line 39
    .line 40
    const v7, 0x1010313

    .line 41
    .line 42
    .line 43
    const-string v3, "Paste"

    .line 44
    .line 45
    const/4 v4, 0x2

    .line 46
    invoke-direct/range {v2 .. v7}, Lyy2;-><init>(Ljava/lang/String;ILjava/lang/Object;II)V

    .line 47
    .line 48
    .line 49
    new-instance v3, Lyy2;

    .line 50
    .line 51
    sget-object v6, Ltp0;->p:Ljava/lang/Object;

    .line 52
    .line 53
    const v7, 0x104000d

    .line 54
    .line 55
    .line 56
    const v8, 0x101037e

    .line 57
    .line 58
    .line 59
    const-string v4, "SelectAll"

    .line 60
    .line 61
    const/4 v5, 0x3

    .line 62
    invoke-direct/range {v3 .. v8}, Lyy2;-><init>(Ljava/lang/String;ILjava/lang/Object;II)V

    .line 63
    .line 64
    .line 65
    new-instance v4, Lyy2;

    .line 66
    .line 67
    sget-object v7, Ltp0;->q:Ljava/lang/Object;

    .line 68
    .line 69
    const v8, 0x104001a

    .line 70
    .line 71
    .line 72
    const/4 v9, 0x0

    .line 73
    const-string v5, "Autofill"

    .line 74
    .line 75
    const/4 v6, 0x4

    .line 76
    invoke-direct/range {v4 .. v9}, Lyy2;-><init>(Ljava/lang/String;ILjava/lang/Object;II)V

    .line 77
    .line 78
    .line 79
    filled-new-array {v0, v1, v2, v3, v4}, [Lyy2;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    sput-object v0, Lyy2;->i:[Lyy2;

    .line 84
    .line 85
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/Object;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lyy2;->h:Ljava/lang/Object;

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lyy2;
    .locals 1

    .line 1
    const-class v0, Lyy2;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lyy2;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lyy2;
    .locals 1

    .line 1
    sget-object v0, Lyy2;->i:[Lyy2;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lyy2;

    .line 8
    .line 9
    return-object v0
.end method
