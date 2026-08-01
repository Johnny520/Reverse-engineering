.class public final synthetic Lra;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/lang/String;

.field public final synthetic η:Landroid/app/Activity;

.field public final synthetic θ:Landroid/widget/ImageView;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Landroid/app/Activity;Landroid/widget/ImageView;I)V
    .locals 0

    .line 1
    iput p4, p0, Lra;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lra;->ζ:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p2, p0, Lra;->η:Landroid/app/Activity;

    .line 6
    .line 7
    iput-object p3, p0, Lra;->θ:Landroid/widget/ImageView;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget v0, p0, Lra;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v3, p0, Lra;->ζ:Ljava/lang/String;

    .line 7
    .line 8
    const/16 v0, 0x1e

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    :try_start_0
    invoke-static {v3, v1, v1, v0}, Lwx;->ζ(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;I)Lvx;

    .line 12
    .line 13
    .line 14
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    :try_start_1
    iget-object v0, v2, Lvx;->δ:Ljava/io/BufferedInputStream;

    .line 16
    .line 17
    invoke-static {v0}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    .line 18
    .line 19
    .line 20
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 21
    :try_start_2
    invoke-virtual {v2}, Lvx;->α()V

    .line 22
    .line 23
    .line 24
    move-object v5, v0

    .line 25
    goto :goto_1

    .line 26
    :catchall_0
    move-exception v0

    .line 27
    goto :goto_0

    .line 28
    :catchall_1
    move-exception v0

    .line 29
    invoke-virtual {v2}, Lvx;->α()V

    .line 30
    .line 31
    .line 32
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 33
    :goto_0
    const-string v2, "DYHelper"

    .line 34
    .line 35
    const-string v4, "\u64cd\u4f5c\u83dc\u5355\u7f29\u7565\u56fe\u52a0\u8f7d\u5931\u8d25"

    .line 36
    .line 37
    invoke-static {v2, v4, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 38
    .line 39
    .line 40
    move-object v5, v1

    .line 41
    :goto_1
    if-eqz v5, :cond_0

    .line 42
    .line 43
    new-instance v1, Lqa;

    .line 44
    .line 45
    const/4 v6, 0x1

    .line 46
    iget-object v2, p0, Lra;->θ:Landroid/widget/ImageView;

    .line 47
    .line 48
    iget-object v4, p0, Lra;->η:Landroid/app/Activity;

    .line 49
    .line 50
    invoke-direct/range {v1 .. v6}, Lqa;-><init>(Landroid/widget/ImageView;Ljava/lang/String;Landroid/app/Activity;Landroid/graphics/Bitmap;I)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v4, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 54
    .line 55
    .line 56
    :cond_0
    return-void

    .line 57
    :pswitch_0
    iget-object v0, p0, Lra;->η:Landroid/app/Activity;

    .line 58
    .line 59
    iget-object v1, p0, Lra;->θ:Landroid/widget/ImageView;

    .line 60
    .line 61
    iget-object p0, p0, Lra;->ζ:Ljava/lang/String;

    .line 62
    .line 63
    invoke-static {p0, v0, v1}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->χ(Ljava/lang/String;Landroid/app/Activity;Landroid/widget/ImageView;)V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
