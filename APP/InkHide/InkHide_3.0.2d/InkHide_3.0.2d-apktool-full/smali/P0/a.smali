.class public abstract LP0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LP0/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, LJ0/a;->a:Ljava/lang/Integer;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/16 v1, 0x22

    .line 10
    .line 11
    if-lt v0, v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    new-instance v0, LP0/c;

    .line 15
    .line 16
    invoke-direct {v0}, LP0/c;-><init>()V

    .line 17
    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_1
    :goto_0
    new-instance v0, LQ0/a;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    :goto_1
    sput-object v0, LP0/a;->a:LP0/a;

    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public abstract a()Ljava/util/Random;
.end method

.method public final b()I
    .locals 1

    .line 1
    invoke-virtual {p0}, LP0/a;->a()Ljava/util/Random;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/util/Random;->nextInt()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public c()I
    .locals 3

    .line 1
    :cond_0
    invoke-virtual {p0}, LP0/a;->b()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    ushr-int/lit8 v0, v0, 0x1

    .line 6
    .line 7
    const v1, 0xf3e57

    .line 8
    .line 9
    .line 10
    rem-int v1, v0, v1

    .line 11
    .line 12
    sub-int/2addr v0, v1

    .line 13
    const v2, 0xf3e56

    .line 14
    .line 15
    .line 16
    add-int/2addr v0, v2

    .line 17
    if-ltz v0, :cond_0

    .line 18
    .line 19
    const/16 v0, 0x3e8

    .line 20
    .line 21
    add-int/2addr v0, v1

    .line 22
    return v0
.end method
