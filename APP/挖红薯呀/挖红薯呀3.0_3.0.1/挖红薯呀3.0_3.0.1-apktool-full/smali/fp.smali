.class public final synthetic Lfp;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic d:Z

.field public final synthetic e:Landroid/content/Context;

.field public final synthetic f:Ljava/lang/String;

.field public final synthetic g:Ljava/lang/String;

.field public final synthetic h:I

.field public final synthetic i:I


# direct methods
.method public synthetic constructor <init>(ZLandroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lfp;->d:Z

    .line 5
    .line 6
    iput-object p2, p0, Lfp;->e:Landroid/content/Context;

    .line 7
    .line 8
    iput-object p3, p0, Lfp;->f:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Lfp;->g:Ljava/lang/String;

    .line 11
    .line 12
    iput p5, p0, Lfp;->h:I

    .line 13
    .line 14
    iput p6, p0, Lfp;->i:I

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget v4, p0, Lfp;->h:I

    .line 2
    .line 3
    iget v5, p0, Lfp;->i:I

    .line 4
    .line 5
    iget-boolean v0, p0, Lfp;->d:Z

    .line 6
    .line 7
    iget-object v1, p0, Lfp;->e:Landroid/content/Context;

    .line 8
    .line 9
    iget-object v2, p0, Lfp;->f:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v3, p0, Lfp;->g:Ljava/lang/String;

    .line 12
    .line 13
    invoke-static/range {v0 .. v5}, Lhp;->i(ZLandroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
