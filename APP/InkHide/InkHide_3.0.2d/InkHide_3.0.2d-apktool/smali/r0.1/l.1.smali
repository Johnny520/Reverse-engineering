.class public final Lr0/l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/widget/ListView;

.field public final b:Landroid/view/View;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Class;

.field public final e:Ljava/util/List;

.field public final f:Ljava/util/List;

.field public final g:I

.field public final h:Lr0/n;


# direct methods
.method public constructor <init>(Landroid/widget/ListView;Landroid/view/View;Ljava/lang/Object;Ljava/lang/Class;Ljava/util/List;Ljava/util/List;ILr0/n;)V
    .locals 1

    .line 1
    const-string v0, "adapter"

    .line 2
    .line 3
    invoke-static {p3, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "sampleUsernames"

    .line 7
    .line 8
    invoke-static {p5, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "sampleItemClassNames"

    .line 12
    .line 13
    invoke-static {p6, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lr0/l;->a:Landroid/widget/ListView;

    .line 20
    .line 21
    iput-object p2, p0, Lr0/l;->b:Landroid/view/View;

    .line 22
    .line 23
    iput-object p3, p0, Lr0/l;->c:Ljava/lang/Object;

    .line 24
    .line 25
    iput-object p4, p0, Lr0/l;->d:Ljava/lang/Class;

    .line 26
    .line 27
    iput-object p5, p0, Lr0/l;->e:Ljava/util/List;

    .line 28
    .line 29
    iput-object p6, p0, Lr0/l;->f:Ljava/util/List;

    .line 30
    .line 31
    iput p7, p0, Lr0/l;->g:I

    .line 32
    .line 33
    iput-object p8, p0, Lr0/l;->h:Lr0/n;

    .line 34
    .line 35
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lr0/l;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lr0/l;

    .line 12
    .line 13
    iget-object v1, p1, Lr0/l;->a:Landroid/widget/ListView;

    .line 14
    .line 15
    iget-object v3, p0, Lr0/l;->a:Landroid/widget/ListView;

    .line 16
    .line 17
    invoke-static {v3, v1}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget-object v1, p0, Lr0/l;->b:Landroid/view/View;

    .line 25
    .line 26
    iget-object v3, p1, Lr0/l;->b:Landroid/view/View;

    .line 27
    .line 28
    invoke-static {v1, v3}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    iget-object v1, p0, Lr0/l;->c:Ljava/lang/Object;

    .line 36
    .line 37
    iget-object v3, p1, Lr0/l;->c:Ljava/lang/Object;

    .line 38
    .line 39
    invoke-static {v1, v3}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_4

    .line 44
    .line 45
    return v2

    .line 46
    :cond_4
    iget-object v1, p0, Lr0/l;->d:Ljava/lang/Class;

    .line 47
    .line 48
    iget-object v3, p1, Lr0/l;->d:Ljava/lang/Class;

    .line 49
    .line 50
    invoke-static {v1, v3}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-nez v1, :cond_5

    .line 55
    .line 56
    return v2

    .line 57
    :cond_5
    iget-object v1, p0, Lr0/l;->e:Ljava/util/List;

    .line 58
    .line 59
    iget-object v3, p1, Lr0/l;->e:Ljava/util/List;

    .line 60
    .line 61
    invoke-static {v1, v3}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-nez v1, :cond_6

    .line 66
    .line 67
    return v2

    .line 68
    :cond_6
    iget-object v1, p0, Lr0/l;->f:Ljava/util/List;

    .line 69
    .line 70
    iget-object v3, p1, Lr0/l;->f:Ljava/util/List;

    .line 71
    .line 72
    invoke-static {v1, v3}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-nez v1, :cond_7

    .line 77
    .line 78
    return v2

    .line 79
    :cond_7
    iget v1, p0, Lr0/l;->g:I

    .line 80
    .line 81
    iget v3, p1, Lr0/l;->g:I

    .line 82
    .line 83
    if-eq v1, v3, :cond_8

    .line 84
    .line 85
    return v2

    .line 86
    :cond_8
    iget-object v1, p0, Lr0/l;->h:Lr0/n;

    .line 87
    .line 88
    iget-object p1, p1, Lr0/l;->h:Lr0/n;

    .line 89
    .line 90
    if-eq v1, p1, :cond_9

    .line 91
    .line 92
    return v2

    .line 93
    :cond_9
    return v0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lr0/l;->a:Landroid/widget/ListView;

    .line 3
    .line 4
    if-nez v1, :cond_0

    .line 5
    .line 6
    move v1, v0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    :goto_0
    const/16 v2, 0x1f

    .line 13
    .line 14
    mul-int/2addr v1, v2

    .line 15
    iget-object v3, p0, Lr0/l;->b:Landroid/view/View;

    .line 16
    .line 17
    if-nez v3, :cond_1

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    :goto_1
    add-int/2addr v1, v0

    .line 25
    mul-int/2addr v1, v2

    .line 26
    iget-object v0, p0, Lr0/l;->c:Ljava/lang/Object;

    .line 27
    .line 28
    invoke-static {v0, v1, v2}, LL/d;->b(Ljava/lang/Object;II)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    iget-object v1, p0, Lr0/l;->d:Ljava/lang/Class;

    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    add-int/2addr v1, v0

    .line 39
    mul-int/2addr v1, v2

    .line 40
    iget-object v0, p0, Lr0/l;->e:Ljava/util/List;

    .line 41
    .line 42
    invoke-static {v0, v1, v2}, LL/d;->e(Ljava/util/List;II)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-object v1, p0, Lr0/l;->f:Ljava/util/List;

    .line 47
    .line 48
    invoke-static {v1, v0, v2}, LL/d;->e(Ljava/util/List;II)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget v1, p0, Lr0/l;->g:I

    .line 53
    .line 54
    invoke-static {v1, v0, v2}, LL/d;->a(III)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget-object v1, p0, Lr0/l;->h:Lr0/n;

    .line 59
    .line 60
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    add-int/2addr v1, v0

    .line 65
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "ConversationSurface(listView="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lr0/l;->a:Landroid/widget/ListView;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", recyclerView="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lr0/l;->b:Landroid/view/View;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", adapter="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lr0/l;->c:Ljava/lang/Object;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", adapterClass="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, Lr0/l;->d:Ljava/lang/Class;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", sampleUsernames="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, Lr0/l;->e:Ljava/util/List;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, ", sampleItemClassNames="

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget-object v1, p0, Lr0/l;->f:Ljava/util/List;

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v1, ", sampleConfidence="

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    iget v1, p0, Lr0/l;->g:I

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v1, ", source="

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    iget-object v1, p0, Lr0/l;->h:Lr0/n;

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string v1, ")"

    .line 84
    .line 85
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    return-object v0
.end method
