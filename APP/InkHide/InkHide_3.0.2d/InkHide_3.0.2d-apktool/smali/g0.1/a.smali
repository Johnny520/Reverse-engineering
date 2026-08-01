.class public abstract Lg0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LT/l;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LT/m;

    .line 2
    .line 3
    invoke-direct {v0}, LT/m;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    iput-boolean v1, v0, LT/m;->g:Z

    .line 8
    .line 9
    invoke-virtual {v0}, LT/m;->a()LT/l;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sput-object v0, Lg0/a;->a:LT/l;

    .line 14
    .line 15
    new-instance v0, LT/m;

    .line 16
    .line 17
    invoke-direct {v0}, LT/m;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, LT/m;->a()LT/l;

    .line 21
    .line 22
    .line 23
    new-instance v0, LT/m;

    .line 24
    .line 25
    invoke-direct {v0}, LT/m;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-boolean v1, v0, LT/m;->k:Z

    .line 29
    .line 30
    invoke-virtual {v0}, LT/m;->a()LT/l;

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public static a(LT/o;)Ljava/lang/Object;
    .locals 6

    .line 1
    sget-object v0, Lg0/a;->a:LT/l;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v1, La0/a;

    .line 7
    .line 8
    const-class v2, Lcom/lu/wxmask/bean/MaskItemBean$TipData;

    .line 9
    .line 10
    invoke-direct {v1, v2}, La0/a;-><init>(Ljava/lang/reflect/Type;)V

    .line 11
    .line 12
    .line 13
    if-nez p0, :cond_0

    .line 14
    .line 15
    const/4 p0, 0x0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    new-instance v3, LW/h;

    .line 18
    .line 19
    sget-object v4, LW/h;->t:LW/g;

    .line 20
    .line 21
    invoke-direct {v3, v4}, Lb0/b;-><init>(Ljava/io/Reader;)V

    .line 22
    .line 23
    .line 24
    const/16 v4, 0x20

    .line 25
    .line 26
    new-array v5, v4, [Ljava/lang/Object;

    .line 27
    .line 28
    iput-object v5, v3, LW/h;->p:[Ljava/lang/Object;

    .line 29
    .line 30
    const/4 v5, 0x0

    .line 31
    iput v5, v3, LW/h;->q:I

    .line 32
    .line 33
    new-array v5, v4, [Ljava/lang/String;

    .line 34
    .line 35
    iput-object v5, v3, LW/h;->r:[Ljava/lang/String;

    .line 36
    .line 37
    new-array v4, v4, [I

    .line 38
    .line 39
    iput-object v4, v3, LW/h;->s:[I

    .line 40
    .line 41
    invoke-virtual {v3, p0}, LW/h;->L(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v3, v1}, LT/l;->b(Lb0/b;La0/a;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    :goto_0
    invoke-static {v2}, LV/d;->k(Ljava/lang/Class;)Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v0, p0}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0
.end method
