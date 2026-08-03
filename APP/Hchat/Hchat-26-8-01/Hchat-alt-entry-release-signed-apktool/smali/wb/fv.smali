.class public final synthetic Lwb/fv;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Landroid/media/MediaPlayer$OnPreparedListener;


# instance fields
.field public final synthetic a:Li0/a1;

.field public final synthetic b:Li0/a1;

.field public final synthetic c:Li0/a1;

.field public final synthetic d:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Li0/a1;Li0/a1;Li0/a1;Li0/a1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwb/fv;->a:Li0/a1;

    .line 5
    .line 6
    iput-object p2, p0, Lwb/fv;->b:Li0/a1;

    .line 7
    .line 8
    iput-object p3, p0, Lwb/fv;->c:Li0/a1;

    .line 9
    .line 10
    iput-object p4, p0, Lwb/fv;->d:Li0/a1;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final onPrepared(Landroid/media/MediaPlayer;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/media/MediaPlayer;->getDuration()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 v0, 0x0

    .line 6
    if-gez p1, :cond_0

    .line 7
    .line 8
    move p1, v0

    .line 9
    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iget-object v1, p0, Lwb/fv;->a:Li0/a1;

    .line 14
    .line 15
    invoke-interface {v1, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 19
    .line 20
    iget-object v1, p0, Lwb/fv;->b:Li0/a1;

    .line 21
    .line 22
    invoke-interface {v1, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 26
    .line 27
    iget-object v1, p0, Lwb/fv;->c:Li0/a1;

    .line 28
    .line 29
    invoke-interface {v1, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iget-object v0, p0, Lwb/fv;->d:Li0/a1;

    .line 37
    .line 38
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    return-void
.end method
