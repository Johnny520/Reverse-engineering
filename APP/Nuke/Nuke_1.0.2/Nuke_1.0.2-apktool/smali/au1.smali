.class public final Lau1;
.super Lgw;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final d:Lau1;

.field public static final e:I

.field public static final f:I

.field public static final g:Lwm0;

.field public static final h:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lau1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lvj;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lau1;->d:Lau1;

    .line 8
    .line 9
    const v0, 0x790b01db

    .line 10
    .line 11
    .line 12
    sput v0, Lau1;->e:I

    .line 13
    .line 14
    const v0, 0x790b01dc

    .line 15
    .line 16
    .line 17
    sput v0, Lau1;->f:I

    .line 18
    .line 19
    sget-object v0, Lwm0;->j:Lwm0;

    .line 20
    .line 21
    sput-object v0, Lau1;->g:Lwm0;

    .line 22
    .line 23
    const-string v0, "OpenUserCard"

    .line 24
    .line 25
    sput-object v0, Lau1;->h:Ljava/lang/String;

    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public final d()Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Lau1;->h:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final k()Ljava/lang/Integer;
    .locals 0

    .line 1
    sget p0, Lau1;->f:I

    .line 2
    .line 3
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final m()I
    .locals 0

    .line 1
    sget p0, Lau1;->e:I

    .line 2
    .line 3
    return p0
.end method

.method public final n()Lwm0;
    .locals 0

    .line 1
    sget-object p0, Lau1;->g:Lwm0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final o(Landroid/view/View;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    :goto_0
    instance-of p1, p0, Landroid/content/ContextWrapper;

    .line 12
    .line 13
    if-eqz p1, :cond_1

    .line 14
    .line 15
    instance-of p1, p0, Landroid/app/Activity;

    .line 16
    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    check-cast p0, Landroid/app/Activity;

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    check-cast p0, Landroid/content/ContextWrapper;

    .line 23
    .line 24
    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    const/4 p0, 0x0

    .line 33
    :goto_1
    if-nez p0, :cond_2

    .line 34
    .line 35
    return-void

    .line 36
    :cond_2
    new-instance p1, Lwt0;

    .line 37
    .line 38
    const/4 v0, 0x6

    .line 39
    invoke-direct {p1, v0, p0}, Lwt0;-><init>(ILjava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    new-instance v0, Lkw;

    .line 43
    .line 44
    const v1, -0x884ef4

    .line 45
    .line 46
    .line 47
    const/4 v2, 0x1

    .line 48
    invoke-direct {v0, v1, v2, p1}, Lkw;-><init>(IZLun0;)V

    .line 49
    .line 50
    .line 51
    new-instance p1, Lt7;

    .line 52
    .line 53
    const/4 v1, 0x4

    .line 54
    invoke-direct {p1, v1, p0, v0}, Lt7;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, p1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 58
    .line 59
    .line 60
    return-void
.end method
