.class public final LYue/ۥ۠ۧۧۦ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۦۥۣ;
    value = 0x15
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۠ۧۧۦ$ۥ۟۟۟۟;,
        LYue/ۥ۠ۧۧۦ$ۥ۟۟۟ۡ;,
        LYue/ۥ۠ۧۧۦ$ۥ۟۟۟;,
        LYue/ۥ۠ۧۧۦ$ۥ۟۟۟۠;,
        LYue/ۥ۠ۧۧۦ$ۥ۟;,
        LYue/ۥ۠ۧۧۦ$ۥ۟۟;
    }
.end annotation


# static fields
.field public static final ۥ:Ljava/lang/String; = "\u06e5\u06e0\u06e7\u06e7\u06e6"

.field public static final ۥ۟:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    const-string v4, "PW"

    const-string v5, "US"

    const-string v0, "BS"

    const-string v1, "BZ"

    const-string v2, "KY"

    const-string v3, "PR"

    filled-new-array/range {v0 .. v5}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, LYue/ۥ۠ۧۧۦ;->ۥ۟:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ(Ljava/util/Locale;)Ljava/lang/String;
    .locals 0
    .param p0    # Ljava/util/Locale;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-static {p0}, Ljava/util/Calendar;->getInstance(Ljava/util/Locale;)Ljava/util/Calendar;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/Calendar;->getFirstDayOfWeek()I

    move-result p0

    invoke-static {p0}, LYue/ۥ۠ۧۧۦ;->ۥ۟۟۠۟(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟(Ljava/util/Locale;)Ljava/lang/String;
    .locals 1
    .param p0    # Ljava/util/Locale;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    const-string v0, "jm"

    invoke-static {p0, v0}, Landroid/text/format/DateFormat;->getBestDateTimePattern(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "H"

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_0

    const-string p0, "h23"

    goto :goto_0

    :cond_0
    const-string p0, "h12"

    :goto_0
    return-object p0
.end method

.method public static ۥ۟۟()Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    const/4 v0, 0x1

    invoke-static {v0}, LYue/ۥ۠ۧۧۦ;->ۥ۟۟۟۠(Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static ۥ۟۟۟(Ljava/util/Locale;)Ljava/lang/String;
    .locals 1
    .param p0    # Ljava/util/Locale;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    const/4 v0, 0x1

    invoke-static {p0, v0}, LYue/ۥ۠ۧۧۦ;->ۥ۟۟۟۟(Ljava/util/Locale;Z)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟۟۟(Ljava/util/Locale;Z)Ljava/lang/String;
    .locals 2
    .param p0    # Ljava/util/Locale;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    const-string v0, "ca"

    const-string v1, ""

    invoke-static {v0, v1, p0, p1}, LYue/ۥ۠ۧۧۦ;->ۥ۟۟۠ۥ(Ljava/lang/String;Ljava/lang/String;Ljava/util/Locale;Z)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    invoke-static {p0}, LYue/ۥ۠ۧۧۦ$ۥ۟;->ۥ(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟۟۠(Z)Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    invoke-static {}, LYue/ۥ۠ۧۧۦ$ۥ۟;->ۥ۟()Ljava/util/Locale;

    move-result-object v0

    invoke-static {v0, p0}, LYue/ۥ۠ۧۧۦ;->ۥ۟۟۟۟(Ljava/util/Locale;Z)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟۟ۡ()Ljava/util/Locale;
    .locals 1

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    return-object v0
.end method

.method public static ۥ۟۟۟ۢ()Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    const/4 v0, 0x1

    invoke-static {v0}, LYue/ۥ۠ۧۧۦ;->ۥ۟۟۟ۥ(Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static ۥۣ۟۟۟(Ljava/util/Locale;)Ljava/lang/String;
    .locals 1
    .param p0    # Ljava/util/Locale;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    const/4 v0, 0x1

    invoke-static {p0, v0}, LYue/ۥ۠ۧۧۦ;->ۥ۟۟۟ۤ(Ljava/util/Locale;Z)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟۟ۤ(Ljava/util/Locale;Z)Ljava/lang/String;
    .locals 2
    .param p0    # Ljava/util/Locale;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    const-string v0, "fw"

    const-string v1, ""

    invoke-static {v0, v1, p0, p1}, LYue/ۥ۠ۧۧۦ;->ۥ۟۟۠ۥ(Ljava/lang/String;Ljava/lang/String;Ljava/util/Locale;Z)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p0}, LYue/ۥ۠ۧۧۦ;->ۥ(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public static ۥ۟۟۟ۥ(Z)Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    invoke-static {}, LYue/ۥ۠ۧۧۦ$ۥ۟;->ۥ۟()Ljava/util/Locale;

    move-result-object v0

    invoke-static {v0, p0}, LYue/ۥ۠ۧۧۦ;->ۥ۟۟۟ۤ(Ljava/util/Locale;Z)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟۟ۦ()Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    const/4 v0, 0x1

    invoke-static {v0}, LYue/ۥ۠ۧۧۦ;->ۥ۟۟۠(Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static ۥ۟۟۟ۧ(Ljava/util/Locale;)Ljava/lang/String;
    .locals 1
    .param p0    # Ljava/util/Locale;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    const/4 v0, 0x1

    invoke-static {p0, v0}, LYue/ۥ۠ۧۧۦ;->ۥ۟۟۟ۨ(Ljava/util/Locale;Z)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟۟ۨ(Ljava/util/Locale;Z)Ljava/lang/String;
    .locals 2
    .param p0    # Ljava/util/Locale;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    const-string v0, "hc"

    const-string v1, ""

    invoke-static {v0, v1, p0, p1}, LYue/ۥ۠ۧۧۦ;->ۥ۟۟۠ۥ(Ljava/lang/String;Ljava/lang/String;Ljava/util/Locale;Z)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x21

    if-lt p1, v0, :cond_1

    invoke-static {p0}, LYue/ۥ۠ۧۧۦ$ۥ۟۟;->ۥ(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-static {p0}, LYue/ۥ۠ۧۧۦ;->ۥ۟(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟۠(Z)Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    invoke-static {}, LYue/ۥ۠ۧۧۦ$ۥ۟;->ۥ۟()Ljava/util/Locale;

    move-result-object v0

    invoke-static {v0, p0}, LYue/ۥ۠ۧۧۦ;->ۥ۟۟۟ۨ(Ljava/util/Locale;Z)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟۠۟(I)Ljava/lang/String;
    .locals 7

    const-string v5, "fri"

    const-string v6, "sat"

    const-string v0, "sun"

    const-string v1, "mon"

    const-string v2, "tue"

    const-string v3, "wed"

    const-string v4, "thu"

    filled-new-array/range {v0 .. v6}, [Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    if-lt p0, v1, :cond_0

    const/4 v2, 0x7

    if-gt p0, v2, :cond_0

    sub-int/2addr p0, v1

    aget-object p0, v0, p0

    goto :goto_0

    :cond_0
    const-string p0, ""

    :goto_0
    return-object p0
.end method

.method public static ۥ۟۟۠۠(Ljava/util/Locale;)Ljava/lang/String;
    .locals 1

    sget-object v0, LYue/ۥ۠ۧۧۦ;->ۥ۟:[Ljava/lang/String;

    invoke-virtual {p0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Ljava/util/Arrays;->binarySearch([Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p0

    if-ltz p0, :cond_0

    const-string p0, "fahrenhe"

    goto :goto_0

    :cond_0
    const-string p0, "celsius"

    :goto_0
    return-object p0
.end method

.method public static ۥ۟۟۠ۡ()Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    const/4 v0, 0x1

    invoke-static {v0}, LYue/ۥ۠ۧۧۦ;->ۥ۟۟۠ۤ(Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static ۥ۟۟۠ۢ(Ljava/util/Locale;)Ljava/lang/String;
    .locals 1
    .param p0    # Ljava/util/Locale;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    const/4 v0, 0x1

    invoke-static {p0, v0}, LYue/ۥ۠ۧۧۦ;->ۥۣ۟۟۠(Ljava/util/Locale;Z)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۥۣ۟۟۠(Ljava/util/Locale;Z)Ljava/lang/String;
    .locals 2
    .param p0    # Ljava/util/Locale;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    const-string v0, "mu"

    const-string v1, ""

    invoke-static {v0, v1, p0, p1}, LYue/ۥ۠ۧۧۦ;->ۥ۟۟۠ۥ(Ljava/lang/String;Ljava/lang/String;Ljava/util/Locale;Z)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x21

    if-lt p1, v0, :cond_1

    invoke-static {p0}, LYue/ۥ۠ۧۧۦ$ۥ۟۟;->ۥ۟۟(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-static {p0}, LYue/ۥ۠ۧۧۦ;->ۥ۟۟۠۠(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟۠ۤ(Z)Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    invoke-static {}, LYue/ۥ۠ۧۧۦ$ۥ۟;->ۥ۟()Ljava/util/Locale;

    move-result-object v0

    invoke-static {v0, p0}, LYue/ۥ۠ۧۧۦ;->ۥۣ۟۟۠(Ljava/util/Locale;Z)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟۠ۥ(Ljava/lang/String;Ljava/lang/String;Ljava/util/Locale;Z)Ljava/lang/String;
    .locals 0

    invoke-virtual {p2, p0}, Ljava/util/Locale;->getUnicodeLocaleType(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    if-nez p3, :cond_1

    return-object p1

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method
