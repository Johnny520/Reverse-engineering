.class public final LA0/S;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/util/List;

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public final g:Ljava/lang/String;

.field public final h:Ljava/lang/String;

.field public final i:Ljava/lang/String;

.field public final j:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "sendClickClassName"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "sendClickMethodName"

    .line 7
    .line 8
    invoke-static {p2, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "sendClickMethodSign"

    .line 12
    .line 13
    invoke-static {p3, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "appMsgContentClassName"

    .line 17
    .line 18
    invoke-static {p5, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "parseXmlMethodName"

    .line 22
    .line 23
    invoke-static {p6, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "parseXmlMethodSign"

    .line 27
    .line 28
    invoke-static {p7, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const-string v0, "appMsgLogicClassName"

    .line 32
    .line 33
    invoke-static {p8, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const-string v0, "sendAppMsgMethodName"

    .line 37
    .line 38
    invoke-static {p9, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const-string v0, "sendAppMsgMethodSign"

    .line 42
    .line 43
    invoke-static {p10, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    .line 48
    .line 49
    iput-object p1, p0, LA0/S;->a:Ljava/lang/String;

    .line 50
    .line 51
    iput-object p2, p0, LA0/S;->b:Ljava/lang/String;

    .line 52
    .line 53
    iput-object p3, p0, LA0/S;->c:Ljava/lang/String;

    .line 54
    .line 55
    iput-object p4, p0, LA0/S;->d:Ljava/util/List;

    .line 56
    .line 57
    iput-object p5, p0, LA0/S;->e:Ljava/lang/String;

    .line 58
    .line 59
    iput-object p6, p0, LA0/S;->f:Ljava/lang/String;

    .line 60
    .line 61
    iput-object p7, p0, LA0/S;->g:Ljava/lang/String;

    .line 62
    .line 63
    iput-object p8, p0, LA0/S;->h:Ljava/lang/String;

    .line 64
    .line 65
    iput-object p9, p0, LA0/S;->i:Ljava/lang/String;

    .line 66
    .line 67
    iput-object p10, p0, LA0/S;->j:Ljava/lang/String;

    .line 68
    .line 69
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
    instance-of v1, p1, LA0/S;

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
    check-cast p1, LA0/S;

    .line 12
    .line 13
    iget-object v1, p1, LA0/S;->a:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p0, LA0/S;->a:Ljava/lang/String;

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
    iget-object v1, p0, LA0/S;->b:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v3, p1, LA0/S;->b:Ljava/lang/String;

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
    iget-object v1, p0, LA0/S;->c:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v3, p1, LA0/S;->c:Ljava/lang/String;

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
    iget-object v1, p0, LA0/S;->d:Ljava/util/List;

    .line 47
    .line 48
    iget-object v3, p1, LA0/S;->d:Ljava/util/List;

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
    iget-object v1, p0, LA0/S;->e:Ljava/lang/String;

    .line 58
    .line 59
    iget-object v3, p1, LA0/S;->e:Ljava/lang/String;

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
    iget-object v1, p0, LA0/S;->f:Ljava/lang/String;

    .line 69
    .line 70
    iget-object v3, p1, LA0/S;->f:Ljava/lang/String;

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
    iget-object v1, p0, LA0/S;->g:Ljava/lang/String;

    .line 80
    .line 81
    iget-object v3, p1, LA0/S;->g:Ljava/lang/String;

    .line 82
    .line 83
    invoke-static {v1, v3}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    if-nez v1, :cond_8

    .line 88
    .line 89
    return v2

    .line 90
    :cond_8
    iget-object v1, p0, LA0/S;->h:Ljava/lang/String;

    .line 91
    .line 92
    iget-object v3, p1, LA0/S;->h:Ljava/lang/String;

    .line 93
    .line 94
    invoke-static {v1, v3}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    if-nez v1, :cond_9

    .line 99
    .line 100
    return v2

    .line 101
    :cond_9
    iget-object v1, p0, LA0/S;->i:Ljava/lang/String;

    .line 102
    .line 103
    iget-object v3, p1, LA0/S;->i:Ljava/lang/String;

    .line 104
    .line 105
    invoke-static {v1, v3}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    if-nez v1, :cond_a

    .line 110
    .line 111
    return v2

    .line 112
    :cond_a
    iget-object v1, p0, LA0/S;->j:Ljava/lang/String;

    .line 113
    .line 114
    iget-object p1, p1, LA0/S;->j:Ljava/lang/String;

    .line 115
    .line 116
    invoke-static {v1, p1}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result p1

    .line 120
    if-nez p1, :cond_b

    .line 121
    .line 122
    return v2

    .line 123
    :cond_b
    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, LA0/S;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget-object v2, p0, LA0/S;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, LL/d;->c(Ljava/lang/String;II)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, LA0/S;->c:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, LL/d;->c(Ljava/lang/String;II)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, LA0/S;->d:Ljava/util/List;

    .line 23
    .line 24
    invoke-static {v2, v0, v1}, LL/d;->e(Ljava/util/List;II)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, LA0/S;->e:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v2, v0, v1}, LL/d;->c(Ljava/lang/String;II)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v2, p0, LA0/S;->f:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v2, v0, v1}, LL/d;->c(Ljava/lang/String;II)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-object v2, p0, LA0/S;->g:Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {v2, v0, v1}, LL/d;->c(Ljava/lang/String;II)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-object v2, p0, LA0/S;->h:Ljava/lang/String;

    .line 47
    .line 48
    invoke-static {v2, v0, v1}, LL/d;->c(Ljava/lang/String;II)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-object v2, p0, LA0/S;->i:Ljava/lang/String;

    .line 53
    .line 54
    invoke-static {v2, v0, v1}, LL/d;->c(Ljava/lang/String;II)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget-object v1, p0, LA0/S;->j:Ljava/lang/String;

    .line 59
    .line 60
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

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
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "HookPoint(sendClickClassName="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, LA0/S;->a:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", sendClickMethodName="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, LA0/S;->b:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", sendClickMethodSign="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, LA0/S;->c:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", sendClickMethods="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, LA0/S;->d:Ljava/util/List;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", appMsgContentClassName="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, LA0/S;->e:Ljava/lang/String;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, ", parseXmlMethodName="

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget-object v1, p0, LA0/S;->f:Ljava/lang/String;

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v1, ", parseXmlMethodSign="

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    iget-object v1, p0, LA0/S;->g:Ljava/lang/String;

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v1, ", appMsgLogicClassName="

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    iget-object v1, p0, LA0/S;->h:Ljava/lang/String;

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string v1, ", sendAppMsgMethodName="

    .line 84
    .line 85
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    iget-object v1, p0, LA0/S;->i:Ljava/lang/String;

    .line 89
    .line 90
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    const-string v1, ", sendAppMsgMethodSign="

    .line 94
    .line 95
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    iget-object v1, p0, LA0/S;->j:Ljava/lang/String;

    .line 99
    .line 100
    const-string v2, ")"

    .line 101
    .line 102
    invoke-static {v0, v1, v2}, LL/d;->l(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    return-object v0
.end method
