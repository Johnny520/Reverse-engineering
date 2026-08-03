.class public final synthetic Lwb/hv;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Landroid/media/MediaPlayer$OnErrorListener;


# instance fields
.field public final synthetic a:Li0/a1;

.field public final synthetic b:Li0/a1;

.field public final synthetic c:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Li0/a1;Li0/a1;Li0/a1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwb/hv;->a:Li0/a1;

    .line 5
    .line 6
    iput-object p2, p0, Lwb/hv;->b:Li0/a1;

    .line 7
    .line 8
    iput-object p3, p0, Lwb/hv;->c:Li0/a1;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onError(Landroid/media/MediaPlayer;II)Z
    .locals 0

    .line 1
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 2
    .line 3
    iget-object p2, p0, Lwb/hv;->a:Li0/a1;

    .line 4
    .line 5
    invoke-interface {p2, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    iget-object p2, p0, Lwb/hv;->b:Li0/a1;

    .line 9
    .line 10
    invoke-interface {p2, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    const-string p1, "\u9884\u89c8\u64ad\u653e\u5931\u8d25"

    .line 14
    .line 15
    iget-object p2, p0, Lwb/hv;->c:Li0/a1;

    .line 16
    .line 17
    invoke-interface {p2, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    const/4 p1, 0x1

    .line 21
    return p1
.end method
