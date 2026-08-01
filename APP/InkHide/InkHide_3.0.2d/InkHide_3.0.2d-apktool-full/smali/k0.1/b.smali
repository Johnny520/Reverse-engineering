.class public abstract Lk0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:I

.field public static final b:I

.field public static final c:Lj/b;

.field public static final d:LC/j;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Runtime;->availableProcessors()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    add-int/lit8 v1, v0, -0x1

    .line 10
    .line 11
    const/4 v2, 0x4

    .line 12
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/4 v2, 0x2

    .line 17
    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    sput v1, Lk0/b;->a:I

    .line 22
    .line 23
    mul-int/2addr v0, v2

    .line 24
    add-int/lit8 v0, v0, 0x1

    .line 25
    .line 26
    sput v0, Lk0/b;->b:I

    .line 27
    .line 28
    new-instance v0, Lj/b;

    .line 29
    .line 30
    const/4 v1, 0x1

    .line 31
    invoke-direct {v0, v1}, Lj/b;-><init>(I)V

    .line 32
    .line 33
    .line 34
    sput-object v0, Lk0/b;->c:Lj/b;

    .line 35
    .line 36
    new-instance v0, LC/j;

    .line 37
    .line 38
    invoke-direct {v0}, LC/j;-><init>()V

    .line 39
    .line 40
    .line 41
    sput-object v0, Lk0/b;->d:LC/j;

    .line 42
    .line 43
    return-void
.end method
