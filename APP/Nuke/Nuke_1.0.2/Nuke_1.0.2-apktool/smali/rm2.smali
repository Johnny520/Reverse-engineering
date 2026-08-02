.class public final enum Lrm2;
.super Ljava/lang/Enum;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final enum h:Lrm2;

.field public static final synthetic i:[Lrm2;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lrm2;

    .line 2
    .line 3
    const-string v1, "EditableText"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lrm2;->h:Lrm2;

    .line 10
    .line 11
    new-instance v1, Lrm2;

    .line 12
    .line 13
    const-string v2, "StaticText"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    filled-new-array {v0, v1}, [Lrm2;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, Lrm2;->i:[Lrm2;

    .line 24
    .line 25
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lrm2;
    .locals 1

    .line 1
    const-class v0, Lrm2;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lrm2;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lrm2;
    .locals 1

    .line 1
    sget-object v0, Lrm2;->i:[Lrm2;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lrm2;

    .line 8
    .line 9
    return-object v0
.end method
