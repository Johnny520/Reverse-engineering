.class public final LZz;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Z

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:Lvx;

.field public final g:Z


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lvx;I)V
    .locals 10

    and-int/lit8 v0, p7, 0x4

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move v5, v1

    goto :goto_0

    :cond_0
    move v5, p3

    :goto_0
    and-int/lit8 p3, p7, 0x8

    if-eqz p3, :cond_1

    const-wide p3, -0x2bccfffff835L

    .line 9
    invoke-static {p3, p4}, LGu;->r(J)Ljava/lang/String;

    move-result-object p4

    :cond_1
    move-object v6, p4

    and-int/lit8 p3, p7, 0x10

    const/4 p4, 0x0

    if-eqz p3, :cond_2

    move-object v7, p4

    goto :goto_1

    :cond_2
    move-object v7, p5

    :goto_1
    and-int/lit8 p3, p7, 0x20

    if-eqz p3, :cond_3

    move-object v8, p4

    goto :goto_2

    :cond_3
    move-object/from16 v8, p6

    :goto_2
    and-int/lit8 p3, p7, 0x40

    if-eqz p3, :cond_4

    :goto_3
    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move v9, v1

    goto :goto_4

    :cond_4
    const/4 v1, 0x1

    goto :goto_3

    .line 10
    :goto_4
    invoke-direct/range {v2 .. v9}, LZz;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lvx;Z)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lvx;Z)V
    .locals 2

    const-wide v0, -0x2b3dfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x2bc2fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x2bc6fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LZz;->a:Ljava/lang/String;

    .line 3
    iput-object p2, p0, LZz;->b:Ljava/lang/String;

    .line 4
    iput-boolean p3, p0, LZz;->c:Z

    .line 5
    iput-object p4, p0, LZz;->d:Ljava/lang/String;

    .line 6
    iput-object p5, p0, LZz;->e:Ljava/lang/String;

    .line 7
    iput-object p6, p0, LZz;->f:Lvx;

    .line 8
    iput-boolean p7, p0, LZz;->g:Z

    return-void
.end method
