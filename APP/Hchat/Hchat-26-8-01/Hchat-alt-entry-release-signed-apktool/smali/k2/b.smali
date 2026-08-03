.class public final Lk2/b;
.super Lx6/d;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final g:Ljava/lang/CharSequence;

.field public final h:Landroid/text/TextPaint;


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lk2/b;->g:Ljava/lang/CharSequence;

    .line 5
    .line 6
    iput-object p2, p0, Lk2/b;->h:Landroid/text/TextPaint;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final P(I)I
    .locals 3

    .line 1
    iget-object v0, p0, Lk2/b;->g:Ljava/lang/CharSequence;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    iget-object v2, p0, Lk2/b;->h:Landroid/text/TextPaint;

    .line 8
    .line 9
    invoke-static {v2, v0, v1, p1}, Lj2/b;->w(Landroid/text/TextPaint;Ljava/lang/CharSequence;II)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1
.end method

.method public final V(I)I
    .locals 3

    .line 1
    iget-object v0, p0, Lk2/b;->g:Ljava/lang/CharSequence;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    iget-object v2, p0, Lk2/b;->h:Landroid/text/TextPaint;

    .line 8
    .line 9
    invoke-static {v2, v0, v1, p1}, Lj2/b;->c(Landroid/text/TextPaint;Ljava/lang/CharSequence;II)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1
.end method
