.class public final Ly1/h;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ly1/y0;


# instance fields
.field public final a:Ly1/i;


# direct methods
.method public constructor <init>(Ly1/i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ly1/h;->a:Ly1/i;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Ly1/x0;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ly1/h;->a:Ly1/i;

    .line 2
    .line 3
    if-nez p1, :cond_1

    .line 4
    .line 5
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 6
    .line 7
    const/16 v1, 0x1c

    .line 8
    .line 9
    if-lt p1, v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Ly1/i;->a()Landroid/content/ClipboardManager;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {p1}, Lh3/c;->e(Landroid/content/ClipboardManager;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    invoke-virtual {v0}, Ly1/i;->a()Landroid/content/ClipboardManager;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const-string v0, ""

    .line 24
    .line 25
    invoke-static {v0, v0}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {p1, v0}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    invoke-virtual {v0}, Ly1/i;->a()Landroid/content/ClipboardManager;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iget-object p1, p1, Ly1/x0;->a:Landroid/content/ClipData;

    .line 38
    .line 39
    invoke-virtual {v0, p1}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method
