.class public final Llp;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llp$a;
    }
.end annotation


# static fields
.field public static final a:Llp;

.field private static volatile b:Llp$a;

.field private static volatile c:Z

.field private static d:Lsw;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lsw;"
        }
    .end annotation
.end field

.field private static volatile e:Landroid/content/SharedPreferences;

.field public static final f:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Llp;

    .line 2
    .line 3
    invoke-direct {v0}, Llp;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Llp;->a:Llp;

    .line 7
    .line 8
    const/16 v0, 0x8

    .line 9
    .line 10
    sput v0, Llp;->f:I

    .line 11
    .line 12
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    sput-boolean p0, Llp;->c:Z

    .line 3
    .line 4
    return-void
.end method

.method public final b()Llp$a;
    .locals 0

    .line 1
    sget-object p0, Llp;->b:Llp$a;

    .line 2
    .line 3
    return-object p0
.end method

.method public final c(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p0, Lm00;->S:Lm00$a;

    .line 5
    .line 6
    invoke-virtual {p0}, Lm00$a;->Y()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-virtual {p1, p0, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    sput-object p0, Llp;->e:Landroid/content/SharedPreferences;

    .line 16
    .line 17
    return-void
.end method

.method public final d()Z
    .locals 0

    .line 1
    sget-boolean p0, Llp;->c:Z

    .line 2
    .line 3
    return p0
.end method

.method public final e()Z
    .locals 2

    .line 1
    sget-object p0, Llp;->e:Landroid/content/SharedPreferences;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-nez p0, :cond_0

    .line 5
    .line 6
    return v0

    .line 7
    :cond_0
    sget-object v1, Lm00;->S:Lm00$a;

    .line 8
    .line 9
    invoke-virtual {v1}, Lm00$a;->j()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-interface {p0, v1, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0
.end method

.method public final f(Landroid/content/Context;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Llp;->e()Z

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    sget-object v0, Llp;->e:Landroid/content/SharedPreferences;

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    sget-object p0, Lm00;->S:Lm00$a;

    .line 13
    .line 14
    invoke-virtual {p0}, Lm00$a;->Y()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p0}, Lm00$a;->j()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-interface {p1, p0, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    :cond_0
    return p0
.end method

.method public final g(Lsw;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsw;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sput-object p1, Llp;->d:Lsw;

    .line 5
    .line 6
    sget-object p0, Llp;->b:Llp$a;

    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    invoke-interface {p1, p0}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public final h()V
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    sput-boolean p0, Llp;->c:Z

    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    sput-object p0, Llp;->b:Llp$a;

    .line 6
    .line 7
    sput-object p0, Llp;->d:Lsw;

    .line 8
    .line 9
    return-void
.end method

.method public final i()V
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    sput-object p0, Llp;->b:Llp$a;

    .line 3
    .line 4
    sput-object p0, Llp;->d:Lsw;

    .line 5
    .line 6
    return-void
.end method

.method public final j(Llp$a;)V
    .locals 0

    .line 1
    sput-object p1, Llp;->b:Llp$a;

    .line 2
    .line 3
    sget-object p0, Llp;->d:Lsw;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-interface {p0, p1}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method
