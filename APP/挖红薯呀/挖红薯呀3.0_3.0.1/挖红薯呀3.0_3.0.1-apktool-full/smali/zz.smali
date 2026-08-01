.class public final synthetic Lzz;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic d:Z

.field public final synthetic e:Lm00;

.field public final synthetic f:I

.field public final synthetic g:I

.field public final synthetic h:I

.field public final synthetic i:Lkp;


# direct methods
.method public synthetic constructor <init>(ZLm00;IIILkp;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lzz;->d:Z

    .line 5
    .line 6
    iput-object p2, p0, Lzz;->e:Lm00;

    .line 7
    .line 8
    iput p3, p0, Lzz;->f:I

    .line 9
    .line 10
    iput p4, p0, Lzz;->g:I

    .line 11
    .line 12
    iput p5, p0, Lzz;->h:I

    .line 13
    .line 14
    iput-object p6, p0, Lzz;->i:Lkp;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget v4, p0, Lzz;->h:I

    .line 2
    .line 3
    iget-object v5, p0, Lzz;->i:Lkp;

    .line 4
    .line 5
    iget-boolean v0, p0, Lzz;->d:Z

    .line 6
    .line 7
    iget-object v1, p0, Lzz;->e:Lm00;

    .line 8
    .line 9
    iget v2, p0, Lzz;->f:I

    .line 10
    .line 11
    iget v3, p0, Lzz;->g:I

    .line 12
    .line 13
    invoke-static/range {v0 .. v5}, Lm00;->v0(ZLm00;IIILkp;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
