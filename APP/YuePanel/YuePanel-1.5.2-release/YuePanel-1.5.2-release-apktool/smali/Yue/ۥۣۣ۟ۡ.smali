.class public final LYue/ۥۣۣ۟ۡ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۣۣ۟ۡ$ۥ;,
        LYue/ۥۣۣ۟ۡ$ۥ۟;
    }
.end annotation


# static fields
.field public static final ۥ:LYue/ۥۣۣ۟ۡ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟:I
    .annotation build LYue/ۥ۟ۤۥۥ;
        extension = 0x1e
    .end annotation

    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation
.end field

.field public static final ۥ۟۟:I
    .annotation build LYue/ۥ۟ۤۥۥ;
        extension = 0x1f
    .end annotation

    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation
.end field

.field public static final ۥ۟۟۟:I
    .annotation build LYue/ۥ۟ۤۥۥ;
        extension = 0x21
    .end annotation

    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation
.end field

.field public static final ۥ۟۟۟۟:I
    .annotation build LYue/ۥ۟ۤۥۥ;
        extension = 0xf4240
    .end annotation

    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, LYue/ۥۣۣ۟ۡ;

    invoke-direct {v0}, LYue/ۥۣۣ۟ۡ;-><init>()V

    sput-object v0, LYue/ۥۣۣ۟ۡ;->ۥ:LYue/ۥۣۣ۟ۡ;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x0

    const/16 v2, 0x1e

    if-lt v0, v2, :cond_0

    sget-object v3, LYue/ۥۣۣ۟ۡ$ۥ;->ۥ:LYue/ۥۣۣ۟ۡ$ۥ;

    invoke-virtual {v3, v2}, LYue/ۥۣۣ۟ۡ$ۥ;->ۥ(I)I

    move-result v3

    goto :goto_0

    :cond_0
    move v3, v1

    :goto_0
    sput v3, LYue/ۥۣۣ۟ۡ;->ۥ۟:I

    if-lt v0, v2, :cond_1

    sget-object v3, LYue/ۥۣۣ۟ۡ$ۥ;->ۥ:LYue/ۥۣۣ۟ۡ$ۥ;

    const/16 v4, 0x1f

    invoke-virtual {v3, v4}, LYue/ۥۣۣ۟ۡ$ۥ;->ۥ(I)I

    move-result v3

    goto :goto_1

    :cond_1
    move v3, v1

    :goto_1
    sput v3, LYue/ۥۣۣ۟ۡ;->ۥ۟۟:I

    if-lt v0, v2, :cond_2

    sget-object v3, LYue/ۥۣۣ۟ۡ$ۥ;->ۥ:LYue/ۥۣۣ۟ۡ$ۥ;

    const/16 v4, 0x21

    invoke-virtual {v3, v4}, LYue/ۥۣۣ۟ۡ$ۥ;->ۥ(I)I

    move-result v3

    goto :goto_2

    :cond_2
    move v3, v1

    :goto_2
    sput v3, LYue/ۥۣۣ۟ۡ;->ۥ۟۟۟:I

    if-lt v0, v2, :cond_3

    sget-object v0, LYue/ۥۣۣ۟ۡ$ۥ;->ۥ:LYue/ۥۣۣ۟ۡ$ۥ;

    const v1, 0xf4240

    invoke-virtual {v0, v1}, LYue/ۥۣۣ۟ۡ$ۥ;->ۥ(I)I

    move-result v1

    :cond_3
    sput v1, LYue/ۥۣۣ۟ۡ;->ۥ۟۟۟۟:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final ۥ()Z
    .locals 1
    .annotation build LYue/ۥ۟ۤۥۥ;
        api = 0x18
    .end annotation

    .annotation runtime LYue/ۥ۟ۨۨۦ;
        message = "Android N is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 24`."
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "android.os.Build.VERSION.SDK_INT >= 24"
            imports = {}
        .end subannotation
    .end annotation

    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    const/4 v0, 0x1

    return v0
.end method

.method public static final ۥ۟()Z
    .locals 1
    .annotation build LYue/ۥ۟ۤۥۥ;
        api = 0x19
    .end annotation

    .annotation runtime LYue/ۥ۟ۨۨۦ;
        message = "Android N MR1 is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 25`."
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "android.os.Build.VERSION.SDK_INT >= 25"
            imports = {}
        .end subannotation
    .end annotation

    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    const/4 v0, 0x1

    return v0
.end method

.method public static final ۥ۟۟()Z
    .locals 1
    .annotation build LYue/ۥ۟ۤۥۥ;
        api = 0x1a
    .end annotation

    .annotation runtime LYue/ۥ۟ۨۨۦ;
        message = "Android O is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead use `Build.VERSION.SDK_INT >= 26`."
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "android.os.Build.VERSION.SDK_INT >= 26"
            imports = {}
        .end subannotation
    .end annotation

    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    const/4 v0, 0x1

    return v0
.end method

.method public static final ۥ۟۟۟()Z
    .locals 2
    .annotation build LYue/ۥ۟ۤۥۥ;
        api = 0x1b
    .end annotation

    .annotation runtime LYue/ۥ۟ۨۨۦ;
        message = "Android O MR1 is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 27`."
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "android.os.Build.VERSION.SDK_INT >= 27"
            imports = {}
        .end subannotation
    .end annotation

    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1b

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static final ۥ۟۟۟۟()Z
    .locals 2
    .annotation build LYue/ۥ۟ۤۥۥ;
        api = 0x1c
    .end annotation

    .annotation runtime LYue/ۥ۟ۨۨۦ;
        message = "Android P is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 28`."
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "android.os.Build.VERSION.SDK_INT >= 28"
            imports = {}
        .end subannotation
    .end annotation

    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static final ۥ۟۟۟۠(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 3
    .param p0    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    .annotation build LYue/ۥۢۥ۟ۥ;
    .end annotation

    const-string v0, "codename"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "buildCodename"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "REL"

    invoke-static {v0, p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    const-string v2, "this as java.lang.String).toUpperCase(Locale.ROOT)"

    invoke-static {p1, v2}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v2}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p0

    if-ltz p0, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public static final ۥ۟۟۟ۡ()Z
    .locals 2
    .annotation build LYue/ۥ۟ۤۥۥ;
        api = 0x1d
    .end annotation

    .annotation runtime LYue/ۥ۟ۨۨۦ;
        message = "Android Q is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 29`."
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "android.os.Build.VERSION.SDK_INT >= 29"
            imports = {}
        .end subannotation
    .end annotation

    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static final ۥ۟۟۟ۢ()Z
    .locals 2
    .annotation build LYue/ۥ۟ۤۥۥ;
        api = 0x1e
    .end annotation

    .annotation runtime LYue/ۥ۟ۨۨۦ;
        message = "Android R is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 30`."
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "android.os.Build.VERSION.SDK_INT >= 30"
            imports = {}
        .end subannotation
    .end annotation

    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static final ۥۣ۟۟۟()Z
    .locals 2
    .annotation build LYue/ۥ۟ۤۥۥ;
        api = 0x1f
        codename = "S"
    .end annotation

    .annotation runtime LYue/ۥ۟ۨۨۦ;
        message = "Android S is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 31`."
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "android.os.Build.VERSION.SDK_INT >= 31"
            imports = {}
        .end subannotation
    .end annotation

    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-ge v0, v1, :cond_1

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    sget-object v0, Landroid/os/Build$VERSION;->CODENAME:Ljava/lang/String;

    const-string v1, "CODENAME"

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "S"

    invoke-static {v1, v0}, LYue/ۥۣۣ۟ۡ;->ۥ۟۟۟۠(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public static final ۥ۟۟۟ۤ()Z
    .locals 2
    .annotation build LYue/ۥ۟ۤۥۥ;
        api = 0x20
        codename = "Sv2"
    .end annotation

    .annotation runtime LYue/ۥ۟ۨۨۦ;
        message = "Android Sv2 is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 32`."
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "android.os.Build.VERSION.SDK_INT >= 32"
            imports = {}
        .end subannotation
    .end annotation

    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x20

    if-ge v0, v1, :cond_1

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    sget-object v0, Landroid/os/Build$VERSION;->CODENAME:Ljava/lang/String;

    const-string v1, "CODENAME"

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "Sv2"

    invoke-static {v1, v0}, LYue/ۥۣۣ۟ۡ;->ۥ۟۟۟۠(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public static final ۥ۟۟۟ۥ()Z
    .locals 2
    .annotation build LYue/ۥ۟ۤۥۥ;
        api = 0x21
        codename = "Tiramisu"
    .end annotation

    .annotation runtime LYue/ۥ۟ۨۨۦ;
        message = "Android Tiramisu is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 33`."
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "android.os.Build.VERSION.SDK_INT >= 33"
            imports = {}
        .end subannotation
    .end annotation

    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-ge v0, v1, :cond_1

    const/16 v1, 0x20

    if-lt v0, v1, :cond_0

    sget-object v0, Landroid/os/Build$VERSION;->CODENAME:Ljava/lang/String;

    const-string v1, "CODENAME"

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "Tiramisu"

    invoke-static {v1, v0}, LYue/ۥۣۣ۟ۡ;->ۥ۟۟۟۠(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public static final ۥ۟۟۟ۦ()Z
    .locals 2
    .annotation build LYue/ۥ۟ۤۥۥ;
        api = 0x22
        codename = "UpsideDownCake"
    .end annotation

    .annotation runtime LYue/ۥ۟ۨۨۦ;
        message = "Android UpsideDownCase is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 34`."
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "android.os.Build.VERSION.SDK_INT >= 34"
            imports = {}
        .end subannotation
    .end annotation

    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-ge v0, v1, :cond_1

    const/16 v1, 0x21

    if-lt v0, v1, :cond_0

    sget-object v0, Landroid/os/Build$VERSION;->CODENAME:Ljava/lang/String;

    const-string v1, "CODENAME"

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "UpsideDownCake"

    invoke-static {v1, v0}, LYue/ۥۣۣ۟ۡ;->ۥ۟۟۟۠(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public static final ۥ۟۟۟ۧ()Z
    .locals 2
    .annotation build LYue/ۥۣۣ۟ۡ$ۥ۟;
    .end annotation

    .annotation build LYue/ۥ۟ۤۥۥ;
        codename = "VanillaIceCream"
    .end annotation

    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_0

    sget-object v0, Landroid/os/Build$VERSION;->CODENAME:Ljava/lang/String;

    const-string v1, "CODENAME"

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "VanillaIceCream"

    invoke-static {v1, v0}, LYue/ۥۣۣ۟ۡ;->ۥ۟۟۟۠(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
