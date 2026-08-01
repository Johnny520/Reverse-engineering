.class public final synthetic Lf00;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic d:Z

.field public final synthetic e:Lm00;

.field public final synthetic f:I

.field public final synthetic g:I

.field public final synthetic h:Lkp;


# direct methods
.method public synthetic constructor <init>(ZLm00;IILkp;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lf00;->d:Z

    .line 5
    .line 6
    iput-object p2, p0, Lf00;->e:Lm00;

    .line 7
    .line 8
    iput p3, p0, Lf00;->f:I

    .line 9
    .line 10
    iput p4, p0, Lf00;->g:I

    .line 11
    .line 12
    iput-object p5, p0, Lf00;->h:Lkp;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, Lf00;->g:I

    .line 2
    .line 3
    iget-object v1, p0, Lf00;->h:Lkp;

    .line 4
    .line 5
    iget-boolean v2, p0, Lf00;->d:Z

    .line 6
    .line 7
    iget-object v3, p0, Lf00;->e:Lm00;

    .line 8
    .line 9
    iget p0, p0, Lf00;->f:I

    .line 10
    .line 11
    invoke-static {v2, v3, p0, v0, v1}, Lm00;->s0(ZLm00;IILkp;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
