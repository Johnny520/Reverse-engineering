.class public LYue/ۥۡۥۣۨ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۠ۥۣ۟;


# static fields
.field public static final ۥ۟:Ljava/util/regex/Pattern;

.field public static final ۥ۟۟:Ljava/util/regex/Pattern;


# instance fields
.field public final ۥ:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, " "

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, LYue/ۥۡۥۣۨ;->ۥ۟:Ljava/util/regex/Pattern;

    const-string v0, ","

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, LYue/ۥۡۥۣۨ;->ۥ۟۟:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    iput-object p1, p0, LYue/ۥۡۥۣۨ;->ۥ:Ljava/lang/String;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-eqz p1, :cond_2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, LYue/ۥۡۥۣۨ;

    iget-object v0, p0, LYue/ۥۡۥۣۨ;->ۥ:Ljava/lang/String;

    iget-object p1, p1, LYue/ۥۡۥۣۨ;->ۥ:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, LYue/ۥۡۥۣۨ;->ۥ:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, LYue/ۥۡۥۣۨ;->ۥ۟()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ()LYue/ۥ۠ۥۣ۟;
    .locals 2

    new-instance v0, LYue/ۥۡۥۣۨ;

    invoke-virtual {p0}, LYue/ۥۡۥۣۨ;->ۥ۟()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, LYue/ۥۡۥۣۨ;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public ۥ۟()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LYue/ۥۡۥۣۨ;->ۥ:Ljava/lang/String;

    return-object v0
.end method

.method public ۥ۟۟(Ljava/lang/String;)Z
    .locals 6

    iget-object v0, p0, LYue/ۥۡۥۣۨ;->ۥ:Ljava/lang/String;

    const-string v1, ""

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    return v2

    :cond_0
    sget-object v0, LYue/ۥۡۥۣۨ;->ۥ۟:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    invoke-virtual {p1, v1}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    sget-object v0, LYue/ۥۡۥۣۨ;->ۥ۟۟:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->split(Ljava/lang/CharSequence;)[Ljava/lang/String;

    move-result-object p1

    array-length v0, p1

    const/4 v1, 0x0

    move v3, v1

    :goto_0
    if-ge v3, v0, :cond_2

    aget-object v4, p1, v3

    iget-object v5, p0, LYue/ۥۡۥۣۨ;->ۥ:Ljava/lang/String;

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    return v2

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    return v1
.end method
