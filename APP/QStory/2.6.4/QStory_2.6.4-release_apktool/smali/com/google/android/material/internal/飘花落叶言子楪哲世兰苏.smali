.class public final Lcom/google/android/material/internal/飘花落叶言子楪哲世兰苏;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public 飘花落叶言子楪世兰哲苏:L飘花落叶言楪苏兰世哲子/飘花落叶言子楪世哲兰苏;

.field public final 飘花落叶言子楪世兰苏哲:Ljava/lang/ref/WeakReference;

.field public 飘花落叶言子楪世哲兰苏:Z

.field public 飘花落叶言子楪世哲苏兰:F

.field public final 飘花落叶言子楪世苏兰哲:Lcom/google/android/material/internal/飘花落叶言子楪哲世苏兰;

.field public final 飘花落叶言子楪世苏哲兰:Landroid/text/TextPaint;


# direct methods
.method public constructor <init>(L飘花落叶言楪苏哲子世兰/飘花落叶言子楪世苏兰哲;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/text/TextPaint;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-direct {v0, v1}, Landroid/text/TextPaint;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/google/android/material/internal/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰:Landroid/text/TextPaint;

    .line 11
    .line 12
    new-instance v0, Lcom/google/android/material/internal/飘花落叶言子楪哲世苏兰;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-direct {v0, p0, v2}, Lcom/google/android/material/internal/飘花落叶言子楪哲世苏兰;-><init>(Ljava/lang/Object;I)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lcom/google/android/material/internal/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏兰哲:Lcom/google/android/material/internal/飘花落叶言子楪哲世苏兰;

    .line 19
    .line 20
    iput-boolean v1, p0, Lcom/google/android/material/internal/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世哲兰苏:Z

    .line 21
    .line 22
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Lcom/google/android/material/internal/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世兰苏哲:Ljava/lang/ref/WeakReference;

    .line 29
    .line 30
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 31
    .line 32
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, Lcom/google/android/material/internal/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世兰苏哲:Ljava/lang/ref/WeakReference;

    .line 36
    .line 37
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏哲兰(Ljava/lang/String;)F
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/google/android/material/internal/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世哲兰苏:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget p0, p0, Lcom/google/android/material/internal/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世哲苏兰:F

    .line 6
    .line 7
    return p0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    iget-object v1, p0, Lcom/google/android/material/internal/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰:Landroid/text/TextPaint;

    .line 10
    .line 11
    if-nez p1, :cond_1

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    goto :goto_0

    .line 15
    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    invoke-virtual {v1, p1, v0, v2}, Landroid/graphics/Paint;->measureText(Ljava/lang/CharSequence;II)F

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    :goto_0
    iput v2, p0, Lcom/google/android/material/internal/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世哲苏兰:F

    .line 24
    .line 25
    if-nez p1, :cond_2

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_2
    invoke-virtual {v1}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iget p1, p1, Landroid/graphics/Paint$FontMetrics;->ascent:F

    .line 33
    .line 34
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 35
    .line 36
    .line 37
    :goto_1
    iput-boolean v0, p0, Lcom/google/android/material/internal/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世哲兰苏:Z

    .line 38
    .line 39
    iget p0, p0, Lcom/google/android/material/internal/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世哲苏兰:F

    .line 40
    .line 41
    return p0
.end method
