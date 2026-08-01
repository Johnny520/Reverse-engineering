.class public final synthetic Lw1;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Le2;

.field public final synthetic b:Ll1;

.field public final synthetic c:I

.field public final synthetic d:Landroid/app/Dialog;

.field public final synthetic e:Landroid/widget/TextView;

.field public final synthetic f:Landroid/widget/ImageView;


# direct methods
.method public synthetic constructor <init>(Le2;Ll1;ILandroid/app/Dialog;Landroid/widget/TextView;Landroid/widget/ImageView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lw1;->a:Le2;

    .line 5
    .line 6
    iput-object p2, p0, Lw1;->b:Ll1;

    .line 7
    .line 8
    iput p3, p0, Lw1;->c:I

    .line 9
    .line 10
    iput-object p4, p0, Lw1;->d:Landroid/app/Dialog;

    .line 11
    .line 12
    iput-object p5, p0, Lw1;->e:Landroid/widget/TextView;

    .line 13
    .line 14
    iput-object p6, p0, Lw1;->f:Landroid/widget/ImageView;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget-object v0, p0, Lw1;->a:Le2;

    .line 2
    .line 3
    iget-object v1, p0, Lw1;->b:Ll1;

    .line 4
    .line 5
    iget v2, p0, Lw1;->c:I

    .line 6
    .line 7
    iget-object v3, p0, Lw1;->d:Landroid/app/Dialog;

    .line 8
    .line 9
    iget-object v4, p0, Lw1;->e:Landroid/widget/TextView;

    .line 10
    .line 11
    iget-object p0, p0, Lw1;->f:Landroid/widget/ImageView;

    .line 12
    .line 13
    sget-object v5, Lg2;->d:Landroid/os/Handler;

    .line 14
    .line 15
    :try_start_0
    iget-object v0, v0, Le2;->b:Landroid/app/Activity;

    .line 16
    .line 17
    invoke-static {v0, v1}, Li5;->X(Landroid/content/Context;Ll1;)Ljava/io/File;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {v0}, Landroid/graphics/ImageDecoder;->createSource(Ljava/io/File;)Landroid/graphics/ImageDecoder$Source;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    new-instance v1, Lx1;

    .line 26
    .line 27
    invoke-direct {v1, v2}, Lx1;-><init>(I)V

    .line 28
    .line 29
    .line 30
    invoke-static {v0, v1}, Landroid/graphics/ImageDecoder;->decodeDrawable(Landroid/graphics/ImageDecoder$Source;Landroid/graphics/ImageDecoder$OnHeaderDecodedListener;)Landroid/graphics/drawable/Drawable;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    new-instance v1, Lo1;

    .line 35
    .line 36
    invoke-direct {v1, v3, v4, p0, v0}, Lo1;-><init>(Landroid/app/Dialog;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v5, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :catchall_0
    move-exception p0

    .line 44
    new-instance v0, Lp1;

    .line 45
    .line 46
    invoke-direct {v0, v3, v4, p0}, Lp1;-><init>(Landroid/app/Dialog;Landroid/widget/TextView;Ljava/lang/Throwable;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v5, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 50
    .line 51
    .line 52
    return-void
.end method
