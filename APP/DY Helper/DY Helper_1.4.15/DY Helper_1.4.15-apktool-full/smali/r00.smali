.class public final enum Lr00;
.super Ljava/lang/Enum;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final synthetic θ:[Lr00;

.field public static final synthetic ι:Lrz;


# instance fields
.field public final ε:Lkx;

.field public final ζ:Ljava/util/Set;

.field public final η:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lr00;

    .line 2
    .line 3
    const-string v1, "isTextMode"

    .line 4
    .line 5
    const-string v2, "textMode"

    .line 6
    .line 7
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-static {v1}, Lg7;->о([Ljava/lang/Object;)Ljava/util/Set;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    const-string v1, "is_text_mode"

    .line 16
    .line 17
    const-string v2, "text_mode"

    .line 18
    .line 19
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-static {v1}, Lg7;->о([Ljava/lang/Object;)Ljava/util/Set;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    const-string v1, "TEXT_MODE"

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    sget-object v3, Lkx;->У:Lkx;

    .line 31
    .line 32
    invoke-direct/range {v0 .. v5}, Lr00;-><init>(Ljava/lang/String;ILkx;Ljava/util/Set;Ljava/util/Set;)V

    .line 33
    .line 34
    .line 35
    new-instance v1, Lr00;

    .line 36
    .line 37
    const-string v2, "isNewTextMode"

    .line 38
    .line 39
    const-string v3, "newTextMode"

    .line 40
    .line 41
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-static {v2}, Lg7;->о([Ljava/lang/Object;)Ljava/util/Set;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    const-string v2, "is_new_text_mode"

    .line 50
    .line 51
    const-string v3, "new_text_mode"

    .line 52
    .line 53
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-static {v2}, Lg7;->о([Ljava/lang/Object;)Ljava/util/Set;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    const-string v2, "NEW_TEXT_MODE"

    .line 62
    .line 63
    const/4 v3, 0x1

    .line 64
    sget-object v4, Lkx;->Ф:Lkx;

    .line 65
    .line 66
    invoke-direct/range {v1 .. v6}, Lr00;-><init>(Ljava/lang/String;ILkx;Ljava/util/Set;Ljava/util/Set;)V

    .line 67
    .line 68
    .line 69
    filled-new-array {v0, v1}, [Lr00;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    sput-object v0, Lr00;->θ:[Lr00;

    .line 74
    .line 75
    new-instance v1, Lrz;

    .line 76
    .line 77
    invoke-direct {v1, v0}, Lrz;-><init>([Ljava/lang/Enum;)V

    .line 78
    .line 79
    .line 80
    sput-object v1, Lr00;->ι:Lrz;

    .line 81
    .line 82
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILkx;Ljava/util/Set;Ljava/util/Set;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lr00;->ε:Lkx;

    .line 5
    .line 6
    iput-object p4, p0, Lr00;->ζ:Ljava/util/Set;

    .line 7
    .line 8
    iput-object p5, p0, Lr00;->η:Ljava/util/Set;

    .line 9
    .line 10
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lr00;
    .locals 1

    .line 1
    const-class v0, Lr00;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lr00;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lr00;
    .locals 1

    .line 1
    sget-object v0, Lr00;->θ:[Lr00;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lr00;

    .line 8
    .line 9
    return-object v0
.end method
