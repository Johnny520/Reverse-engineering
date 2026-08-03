.class public final enum Leu;
.super Ljava/lang/Enum;
.source ""


# static fields
.field public static final enum a:Leu;

.field public static final synthetic b:[Leu;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Leu;

    const-string v1, "SRGB"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    new-instance v1, Leu;

    const-string v2, "DISPLAY_P3"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Leu;->a:Leu;

    filled-new-array {v0, v1}, [Leu;

    move-result-object v0

    sput-object v0, Leu;->b:[Leu;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Leu;
    .locals 1

    const-class v0, Leu;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Leu;

    return-object p0
.end method

.method public static values()[Leu;
    .locals 1

    sget-object v0, Leu;->b:[Leu;

    invoke-virtual {v0}, [Leu;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Leu;

    return-object v0
.end method
