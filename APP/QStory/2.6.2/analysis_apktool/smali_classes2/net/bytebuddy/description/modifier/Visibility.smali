.class public final enum Lnet/bytebuddy/description/modifier/Visibility;
.super Ljava/lang/Enum;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/description/modifier/ModifierContributor$ForType;
.implements Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;
.implements Lnet/bytebuddy/description/modifier/ModifierContributor$ForField;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/description/modifier/Visibility;",
        ">;",
        "Lnet/bytebuddy/description/modifier/ModifierContributor$ForType;",
        "Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;",
        "Lnet/bytebuddy/description/modifier/ModifierContributor$ForField;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/description/modifier/Visibility;

.field public static final enum PACKAGE_PRIVATE:Lnet/bytebuddy/description/modifier/Visibility;

.field public static final enum PRIVATE:Lnet/bytebuddy/description/modifier/Visibility;

.field public static final enum PROTECTED:Lnet/bytebuddy/description/modifier/Visibility;

.field public static final enum PUBLIC:Lnet/bytebuddy/description/modifier/Visibility;


# instance fields
.field private final mask:I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lnet/bytebuddy/description/modifier/Visibility;

    .line 2
    .line 3
    const-string v1, "PUBLIC"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    invoke-direct {v0, v1, v2, v3}, Lnet/bytebuddy/description/modifier/Visibility;-><init>(Ljava/lang/String;II)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lnet/bytebuddy/description/modifier/Visibility;->PUBLIC:Lnet/bytebuddy/description/modifier/Visibility;

    .line 11
    .line 12
    new-instance v1, Lnet/bytebuddy/description/modifier/Visibility;

    .line 13
    .line 14
    const-string v4, "PACKAGE_PRIVATE"

    .line 15
    .line 16
    invoke-direct {v1, v4, v3, v2}, Lnet/bytebuddy/description/modifier/Visibility;-><init>(Ljava/lang/String;II)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lnet/bytebuddy/description/modifier/Visibility;->PACKAGE_PRIVATE:Lnet/bytebuddy/description/modifier/Visibility;

    .line 20
    .line 21
    new-instance v2, Lnet/bytebuddy/description/modifier/Visibility;

    .line 22
    .line 23
    const/4 v3, 0x4

    .line 24
    const-string v4, "PROTECTED"

    .line 25
    .line 26
    const/4 v5, 0x2

    .line 27
    invoke-direct {v2, v4, v5, v3}, Lnet/bytebuddy/description/modifier/Visibility;-><init>(Ljava/lang/String;II)V

    .line 28
    .line 29
    .line 30
    sput-object v2, Lnet/bytebuddy/description/modifier/Visibility;->PROTECTED:Lnet/bytebuddy/description/modifier/Visibility;

    .line 31
    .line 32
    new-instance v3, Lnet/bytebuddy/description/modifier/Visibility;

    .line 33
    .line 34
    const-string v4, "PRIVATE"

    .line 35
    .line 36
    const/4 v6, 0x3

    .line 37
    invoke-direct {v3, v4, v6, v5}, Lnet/bytebuddy/description/modifier/Visibility;-><init>(Ljava/lang/String;II)V

    .line 38
    .line 39
    .line 40
    sput-object v3, Lnet/bytebuddy/description/modifier/Visibility;->PRIVATE:Lnet/bytebuddy/description/modifier/Visibility;

    .line 41
    .line 42
    filled-new-array {v0, v1, v2, v3}, [Lnet/bytebuddy/description/modifier/Visibility;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    sput-object v0, Lnet/bytebuddy/description/modifier/Visibility;->$VALUES:[Lnet/bytebuddy/description/modifier/Visibility;

    .line 47
    .line 48
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lnet/bytebuddy/description/modifier/Visibility;->mask:I

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/description/modifier/Visibility;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/description/modifier/Visibility;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/description/modifier/Visibility;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/description/modifier/Visibility;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/description/modifier/Visibility;->$VALUES:[Lnet/bytebuddy/description/modifier/Visibility;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/description/modifier/Visibility;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/description/modifier/Visibility;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public expandTo(Lnet/bytebuddy/description/modifier/Visibility;)Lnet/bytebuddy/description/modifier/Visibility;
    .locals 2

    .line 1
    sget-object v0, Lnet/bytebuddy/description/modifier/Visibility$1;->$SwitchMap$net$bytebuddy$description$modifier$Visibility:[I

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    aget v0, v0, v1

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    if-eq v0, v1, :cond_5

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    if-eq v0, v1, :cond_3

    .line 14
    .line 15
    const/4 v1, 0x3

    .line 16
    if-eq v0, v1, :cond_1

    .line 17
    .line 18
    const/4 v1, 0x4

    .line 19
    if-ne v0, v1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const-string p0, "Unexpected visibility: "

    .line 23
    .line 24
    invoke-static {p1, p0}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰哲世(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const/4 p0, 0x0

    .line 28
    return-object p0

    .line 29
    :cond_1
    sget-object p1, Lnet/bytebuddy/description/modifier/Visibility;->PRIVATE:Lnet/bytebuddy/description/modifier/Visibility;

    .line 30
    .line 31
    if-ne p0, p1, :cond_2

    .line 32
    .line 33
    sget-object p0, Lnet/bytebuddy/description/modifier/Visibility;->PACKAGE_PRIVATE:Lnet/bytebuddy/description/modifier/Visibility;

    .line 34
    .line 35
    :cond_2
    :goto_0
    return-object p0

    .line 36
    :cond_3
    sget-object v0, Lnet/bytebuddy/description/modifier/Visibility;->PUBLIC:Lnet/bytebuddy/description/modifier/Visibility;

    .line 37
    .line 38
    if-ne p0, v0, :cond_4

    .line 39
    .line 40
    return-object v0

    .line 41
    :cond_4
    return-object p1

    .line 42
    :cond_5
    sget-object p0, Lnet/bytebuddy/description/modifier/Visibility;->PUBLIC:Lnet/bytebuddy/description/modifier/Visibility;

    .line 43
    .line 44
    return-object p0
.end method

.method public getMask()I
    .locals 0

    .line 1
    iget p0, p0, Lnet/bytebuddy/description/modifier/Visibility;->mask:I

    .line 2
    .line 3
    return p0
.end method

.method public getRange()I
    .locals 0

    .line 1
    const/4 p0, 0x7

    .line 2
    return p0
.end method

.method public isDefault()Z
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/description/modifier/Visibility;->PACKAGE_PRIVATE:Lnet/bytebuddy/description/modifier/Visibility;

    .line 2
    .line 3
    if-ne p0, v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public isPackagePrivate()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/description/modifier/Visibility;->isPublic()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lnet/bytebuddy/description/modifier/Visibility;->isPrivate()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Lnet/bytebuddy/description/modifier/Visibility;->isProtected()Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-nez p0, :cond_0

    .line 18
    .line 19
    const/4 p0, 0x1

    .line 20
    return p0

    .line 21
    :cond_0
    const/4 p0, 0x0

    .line 22
    return p0
.end method

.method public isPrivate()Z
    .locals 0

    .line 1
    iget p0, p0, Lnet/bytebuddy/description/modifier/Visibility;->mask:I

    .line 2
    .line 3
    and-int/lit8 p0, p0, 0x2

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public isProtected()Z
    .locals 0

    .line 1
    iget p0, p0, Lnet/bytebuddy/description/modifier/Visibility;->mask:I

    .line 2
    .line 3
    and-int/lit8 p0, p0, 0x4

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public isPublic()Z
    .locals 1

    .line 1
    iget p0, p0, Lnet/bytebuddy/description/modifier/Visibility;->mask:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    and-int/2addr p0, v0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    return v0

    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    return p0
.end method
