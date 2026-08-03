.class public final Lio/sentry/android/replay/video/a;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Ljava/io/File;

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I


# direct methods
.method public constructor <init>(Ljava/io/File;IIII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/android/replay/video/a;->a:Ljava/io/File;

    iput p2, p0, Lio/sentry/android/replay/video/a;->b:I

    iput p3, p0, Lio/sentry/android/replay/video/a;->c:I

    iput p4, p0, Lio/sentry/android/replay/video/a;->d:I

    iput p5, p0, Lio/sentry/android/replay/video/a;->e:I

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Lio/sentry/android/replay/video/a;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lio/sentry/android/replay/video/a;

    iget-object v0, p0, Lio/sentry/android/replay/video/a;->a:Ljava/io/File;

    iget-object v1, p1, Lio/sentry/android/replay/video/a;->a:Ljava/io/File;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    iget v0, p0, Lio/sentry/android/replay/video/a;->b:I

    iget v1, p1, Lio/sentry/android/replay/video/a;->b:I

    if-eq v0, v1, :cond_3

    goto :goto_0

    :cond_3
    iget v0, p0, Lio/sentry/android/replay/video/a;->c:I

    iget v1, p1, Lio/sentry/android/replay/video/a;->c:I

    if-eq v0, v1, :cond_4

    goto :goto_0

    :cond_4
    iget v0, p0, Lio/sentry/android/replay/video/a;->d:I

    iget v1, p1, Lio/sentry/android/replay/video/a;->d:I

    if-eq v0, v1, :cond_5

    goto :goto_0

    :cond_5
    iget v0, p0, Lio/sentry/android/replay/video/a;->e:I

    iget p1, p1, Lio/sentry/android/replay/video/a;->e:I

    if-eq v0, p1, :cond_6

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_6
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lio/sentry/android/replay/video/a;->a:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lio/sentry/android/replay/video/a;->b:I

    invoke-static {v2, v0, v1}, LEy;->a(III)I

    move-result v0

    iget v2, p0, Lio/sentry/android/replay/video/a;->c:I

    invoke-static {v2, v0, v1}, LEy;->a(III)I

    move-result v0

    iget v2, p0, Lio/sentry/android/replay/video/a;->d:I

    invoke-static {v2, v0, v1}, LEy;->a(III)I

    move-result v0

    iget v2, p0, Lio/sentry/android/replay/video/a;->e:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    const v0, 0x4f62373a

    add-int/2addr v2, v0

    return v2
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "MuxerConfig(file="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lio/sentry/android/replay/video/a;->a:Ljava/io/File;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", recordingWidth="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lio/sentry/android/replay/video/a;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", recordingHeight="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lio/sentry/android/replay/video/a;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", frameRate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lio/sentry/android/replay/video/a;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", bitRate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lio/sentry/android/replay/video/a;->e:I

    const-string v2, ", mimeType=video/avc)"

    invoke-static {v0, v1, v2}, LEy;->g(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
