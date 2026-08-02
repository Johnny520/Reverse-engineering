.class public final Lr92;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public final h:Lk82;

.field public final i:Lc42;

.field public final j:Ljava/lang/String;

.field public final k:I

.field public final l:Lyr0;

.field public final m:Ljs0;

.field public final n:Lu92;

.field public final o:Lys2;

.field public final p:Lr92;

.field public final q:Lr92;

.field public final r:Lr92;

.field public final s:J

.field public final t:J

.field public final u:Lf90;

.field public final v:Le33;

.field public final w:Z


# direct methods
.method public constructor <init>(Lk82;Lc42;Ljava/lang/String;ILyr0;Ljs0;Lu92;Lys2;Lr92;Lr92;Lr92;JJLf90;Le33;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual/range {p17 .. p17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lr92;->h:Lk82;

    .line 20
    .line 21
    iput-object p2, p0, Lr92;->i:Lc42;

    .line 22
    .line 23
    iput-object p3, p0, Lr92;->j:Ljava/lang/String;

    .line 24
    .line 25
    iput p4, p0, Lr92;->k:I

    .line 26
    .line 27
    iput-object p5, p0, Lr92;->l:Lyr0;

    .line 28
    .line 29
    iput-object p6, p0, Lr92;->m:Ljs0;

    .line 30
    .line 31
    iput-object p7, p0, Lr92;->n:Lu92;

    .line 32
    .line 33
    iput-object p8, p0, Lr92;->o:Lys2;

    .line 34
    .line 35
    iput-object p9, p0, Lr92;->p:Lr92;

    .line 36
    .line 37
    iput-object p10, p0, Lr92;->q:Lr92;

    .line 38
    .line 39
    iput-object p11, p0, Lr92;->r:Lr92;

    .line 40
    .line 41
    iput-wide p12, p0, Lr92;->s:J

    .line 42
    .line 43
    iput-wide p14, p0, Lr92;->t:J

    .line 44
    .line 45
    move-object/from16 p1, p16

    .line 46
    .line 47
    iput-object p1, p0, Lr92;->u:Lf90;

    .line 48
    .line 49
    move-object/from16 p1, p17

    .line 50
    .line 51
    iput-object p1, p0, Lr92;->v:Le33;

    .line 52
    .line 53
    const/16 p1, 0xc8

    .line 54
    .line 55
    const/4 p2, 0x0

    .line 56
    if-gt p1, p4, :cond_0

    .line 57
    .line 58
    const/16 p1, 0x12c

    .line 59
    .line 60
    if-ge p4, p1, :cond_0

    .line 61
    .line 62
    const/4 p2, 0x1

    .line 63
    :cond_0
    iput-boolean p2, p0, Lr92;->w:Z

    .line 64
    .line 65
    return-void
.end method


# virtual methods
.method public final b()Lp92;
    .locals 3

    .line 1
    new-instance v0, Lp92;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, -0x1

    .line 7
    iput v1, v0, Lp92;->c:I

    .line 8
    .line 9
    sget-object v1, Lu92;->i:Lt92;

    .line 10
    .line 11
    iput-object v1, v0, Lp92;->g:Lu92;

    .line 12
    .line 13
    sget-object v1, Le33;->g:Lix2;

    .line 14
    .line 15
    iput-object v1, v0, Lp92;->o:Le33;

    .line 16
    .line 17
    iget-object v1, p0, Lr92;->h:Lk82;

    .line 18
    .line 19
    iput-object v1, v0, Lp92;->a:Lk82;

    .line 20
    .line 21
    iget-object v1, p0, Lr92;->i:Lc42;

    .line 22
    .line 23
    iput-object v1, v0, Lp92;->b:Lc42;

    .line 24
    .line 25
    iget v1, p0, Lr92;->k:I

    .line 26
    .line 27
    iput v1, v0, Lp92;->c:I

    .line 28
    .line 29
    iget-object v1, p0, Lr92;->j:Ljava/lang/String;

    .line 30
    .line 31
    iput-object v1, v0, Lp92;->d:Ljava/lang/String;

    .line 32
    .line 33
    iget-object v1, p0, Lr92;->l:Lyr0;

    .line 34
    .line 35
    iput-object v1, v0, Lp92;->e:Lyr0;

    .line 36
    .line 37
    iget-object v1, p0, Lr92;->m:Ljs0;

    .line 38
    .line 39
    invoke-virtual {v1}, Ljs0;->c()Lye0;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    iput-object v1, v0, Lp92;->f:Lye0;

    .line 44
    .line 45
    iget-object v1, p0, Lr92;->n:Lu92;

    .line 46
    .line 47
    iput-object v1, v0, Lp92;->g:Lu92;

    .line 48
    .line 49
    iget-object v1, p0, Lr92;->o:Lys2;

    .line 50
    .line 51
    iput-object v1, v0, Lp92;->h:Lys2;

    .line 52
    .line 53
    iget-object v1, p0, Lr92;->p:Lr92;

    .line 54
    .line 55
    iput-object v1, v0, Lp92;->i:Lr92;

    .line 56
    .line 57
    iget-object v1, p0, Lr92;->q:Lr92;

    .line 58
    .line 59
    iput-object v1, v0, Lp92;->j:Lr92;

    .line 60
    .line 61
    iget-object v1, p0, Lr92;->r:Lr92;

    .line 62
    .line 63
    iput-object v1, v0, Lp92;->k:Lr92;

    .line 64
    .line 65
    iget-wide v1, p0, Lr92;->s:J

    .line 66
    .line 67
    iput-wide v1, v0, Lp92;->l:J

    .line 68
    .line 69
    iget-wide v1, p0, Lr92;->t:J

    .line 70
    .line 71
    iput-wide v1, v0, Lp92;->m:J

    .line 72
    .line 73
    iget-object v1, p0, Lr92;->u:Lf90;

    .line 74
    .line 75
    iput-object v1, v0, Lp92;->n:Lf90;

    .line 76
    .line 77
    iget-object p0, p0, Lr92;->v:Le33;

    .line 78
    .line 79
    iput-object p0, v0, Lp92;->o:Le33;

    .line 80
    .line 81
    return-object v0
.end method

.method public final close()V
    .locals 0

    .line 1
    iget-object p0, p0, Lr92;->n:Lu92;

    .line 2
    .line 3
    invoke-virtual {p0}, Lu92;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Response{protocol="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lr92;->i:Lc42;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", code="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget v1, p0, Lr92;->k:I

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", message="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lr92;->j:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", url="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object p0, p0, Lr92;->h:Lk82;

    .line 39
    .line 40
    iget-object p0, p0, Lk82;->a:Lyw0;

    .line 41
    .line 42
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const/16 p0, 0x7d

    .line 46
    .line 47
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    return-object p0
.end method
