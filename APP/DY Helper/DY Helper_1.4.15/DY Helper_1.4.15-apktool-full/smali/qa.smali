.class public final synthetic Lqa;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Landroid/widget/ImageView;

.field public final synthetic η:Ljava/lang/String;

.field public final synthetic θ:Landroid/app/Activity;

.field public final synthetic ι:Landroid/graphics/Bitmap;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/ImageView;Ljava/lang/String;Landroid/app/Activity;Landroid/graphics/Bitmap;I)V
    .locals 0

    .line 1
    iput p5, p0, Lqa;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lqa;->ζ:Landroid/widget/ImageView;

    .line 4
    .line 5
    iput-object p2, p0, Lqa;->η:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p3, p0, Lqa;->θ:Landroid/app/Activity;

    .line 8
    .line 9
    iput-object p4, p0, Lqa;->ι:Landroid/graphics/Bitmap;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget v0, p0, Lqa;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lqa;->ζ:Landroid/widget/ImageView;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    iget-object v2, p0, Lqa;->η:Ljava/lang/String;

    .line 13
    .line 14
    invoke-static {v1, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 22
    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-virtual {v0, v1, v1, v1, v1}, Landroid/view/View;->setPadding(IIII)V

    .line 26
    .line 27
    .line 28
    new-instance v1, Landroid/graphics/drawable/BitmapDrawable;

    .line 29
    .line 30
    iget-object v2, p0, Lqa;->θ:Landroid/app/Activity;

    .line 31
    .line 32
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    iget-object p0, p0, Lqa;->ι:Landroid/graphics/Bitmap;

    .line 37
    .line 38
    invoke-direct {v1, v2, p0}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 42
    .line 43
    .line 44
    :cond_0
    return-void

    .line 45
    :pswitch_0
    iget-object v0, p0, Lqa;->θ:Landroid/app/Activity;

    .line 46
    .line 47
    iget-object v1, p0, Lqa;->ι:Landroid/graphics/Bitmap;

    .line 48
    .line 49
    iget-object v2, p0, Lqa;->ζ:Landroid/widget/ImageView;

    .line 50
    .line 51
    iget-object p0, p0, Lqa;->η:Ljava/lang/String;

    .line 52
    .line 53
    invoke-static {v2, p0, v0, v1}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->ζ(Landroid/widget/ImageView;Ljava/lang/String;Landroid/app/Activity;Landroid/graphics/Bitmap;)V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
