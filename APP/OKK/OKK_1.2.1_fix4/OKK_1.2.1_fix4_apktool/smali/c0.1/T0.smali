.class public final Lc0/T0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Z

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:F

.field public final e:I

.field public final f:I

.field public final g:I

.field public final h:I

.field public final i:I

.field public final j:I

.field public final k:Z


# direct methods
.method public synthetic constructor <init>()V
    .locals 12

    const/4 v11, 0x0

    const/4 v1, 0x1

    .line 1
    const-string v2, "${time} ${relativeTime}"

    const-string v3, "MM-dd HH:mm:ss"

    const/high16 v4, 0x41400000    # 12.0f

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const v8, -0x33000001    # -1.3421772E8f

    const/high16 v9, -0x1a000000

    const v10, -0x33000001    # -1.3421772E8f

    move-object v0, p0

    invoke-direct/range {v0 .. v11}, Lc0/T0;-><init>(ZLjava/lang/String;Ljava/lang/String;FIIIIIIZ)V

    return-void
.end method

.method public constructor <init>(ZLjava/lang/String;Ljava/lang/String;FIIIIIIZ)V
    .locals 1

    const-string v0, "template"

    invoke-static {p2, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timePattern"

    invoke-static {p3, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-boolean p1, p0, Lc0/T0;->a:Z

    .line 4
    iput-object p2, p0, Lc0/T0;->b:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lc0/T0;->c:Ljava/lang/String;

    .line 6
    iput p4, p0, Lc0/T0;->d:F

    .line 7
    iput p5, p0, Lc0/T0;->e:I

    .line 8
    iput p6, p0, Lc0/T0;->f:I

    .line 9
    iput p7, p0, Lc0/T0;->g:I

    .line 10
    iput p8, p0, Lc0/T0;->h:I

    .line 11
    iput p9, p0, Lc0/T0;->i:I

    .line 12
    iput p10, p0, Lc0/T0;->j:I

    .line 13
    iput-boolean p11, p0, Lc0/T0;->k:Z

    return-void
.end method


# virtual methods
.method public final a(Z)I
    .locals 2

    iget v0, p0, Lc0/T0;->g:I

    iget v1, p0, Lc0/T0;->f:I

    if-nez v1, :cond_1

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget v0, p0, Lc0/T0;->e:I

    goto :goto_1

    :cond_1
    :goto_0
    if-eqz p1, :cond_2

    move v0, v1

    :cond_2
    :goto_1
    return v0
.end method

.method public final b(Z)I
    .locals 2

    iget v0, p0, Lc0/T0;->g:I

    iget v1, p0, Lc0/T0;->f:I

    if-nez v1, :cond_1

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget v0, p0, Lc0/T0;->e:I

    goto :goto_1

    :cond_1
    :goto_0
    if-eqz p1, :cond_2

    goto :goto_1

    :cond_2
    move v0, v1

    :goto_1
    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lc0/T0;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lc0/T0;

    iget-boolean v1, p1, Lc0/T0;->a:Z

    iget-boolean v3, p0, Lc0/T0;->a:Z

    if-eq v3, v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lc0/T0;->b:Ljava/lang/String;

    iget-object v3, p1, Lc0/T0;->b:Ljava/lang/String;

    invoke-static {v1, v3}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lc0/T0;->c:Ljava/lang/String;

    iget-object v3, p1, Lc0/T0;->c:Ljava/lang/String;

    invoke-static {v1, v3}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lc0/T0;->d:F

    iget v3, p1, Lc0/T0;->d:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lc0/T0;->e:I

    iget v3, p1, Lc0/T0;->e:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lc0/T0;->f:I

    iget v3, p1, Lc0/T0;->f:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lc0/T0;->g:I

    iget v3, p1, Lc0/T0;->g:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lc0/T0;->h:I

    iget v3, p1, Lc0/T0;->h:I

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget v1, p0, Lc0/T0;->i:I

    iget v3, p1, Lc0/T0;->i:I

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget v1, p0, Lc0/T0;->j:I

    iget v3, p1, Lc0/T0;->j:I

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-boolean v1, p0, Lc0/T0;->k:Z

    iget-boolean p1, p1, Lc0/T0;->k:Z

    if-eq v1, p1, :cond_c

    return v2

    :cond_c
    return v0
.end method

.method public final hashCode()I
    .locals 3

    iget-boolean v0, p0, Lc0/T0;->a:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lc0/T0;->b:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lc0/T0;->c:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Lc0/T0;->d:F

    invoke-static {v2}, Ljava/lang/Float;->hashCode(F)I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget v0, p0, Lc0/T0;->e:I

    invoke-static {v0, v2, v1}, LS/d;->a(III)I

    move-result v0

    iget v2, p0, Lc0/T0;->f:I

    invoke-static {v2, v0, v1}, LS/d;->a(III)I

    move-result v0

    iget v2, p0, Lc0/T0;->g:I

    invoke-static {v2, v0, v1}, LS/d;->a(III)I

    move-result v0

    iget v2, p0, Lc0/T0;->h:I

    invoke-static {v2, v0, v1}, LS/d;->a(III)I

    move-result v0

    iget v2, p0, Lc0/T0;->i:I

    invoke-static {v2, v0, v1}, LS/d;->a(III)I

    move-result v0

    iget v2, p0, Lc0/T0;->j:I

    invoke-static {v2, v0, v1}, LS/d;->a(III)I

    move-result v0

    iget-boolean v1, p0, Lc0/T0;->k:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "MessageDetailOptions(enabled="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v1, p0, Lc0/T0;->a:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", template="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lc0/T0;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", timePattern="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lc0/T0;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", textSizeSp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lc0/T0;->d:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", horizontalMarginDp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lc0/T0;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", leftMarginDp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lc0/T0;->f:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", rightMarginDp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lc0/T0;->g:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", textColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lc0/T0;->h:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", textColorLight="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lc0/T0;->i:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", textColorDark="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lc0/T0;->j:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", clickToShow="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lc0/T0;->k:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
