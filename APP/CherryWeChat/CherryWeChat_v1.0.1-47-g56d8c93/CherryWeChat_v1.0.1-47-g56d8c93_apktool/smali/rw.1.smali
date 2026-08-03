.class public final Lrw;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LSm;


# static fields
.field public static final j:LCp;


# instance fields
.field public final b:Lzp;

.field public final c:LSm;

.field public final d:LSm;

.field public final e:I

.field public final f:I

.field public final g:Ljava/lang/Class;

.field public final h:Lvt;

.field public final i:LCB;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LCp;

    const-wide/16 v1, 0x32

    invoke-direct {v0, v1, v2}, LCp;-><init>(J)V

    sput-object v0, Lrw;->j:LCp;

    return-void
.end method

.method public constructor <init>(Lzp;LSm;LSm;IILCB;Ljava/lang/Class;Lvt;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrw;->b:Lzp;

    iput-object p2, p0, Lrw;->c:LSm;

    iput-object p3, p0, Lrw;->d:LSm;

    iput p4, p0, Lrw;->e:I

    iput p5, p0, Lrw;->f:I

    iput-object p6, p0, Lrw;->i:LCB;

    iput-object p7, p0, Lrw;->g:Ljava/lang/Class;

    iput-object p8, p0, Lrw;->h:Lvt;

    return-void
.end method


# virtual methods
.method public final b(Ljava/security/MessageDigest;)V
    .locals 5

    iget-object v0, p0, Lrw;->b:Lzp;

    const-class v1, [B

    monitor-enter v0

    :try_start_0
    iget-object v2, v0, Lzp;->b:Lyp;

    iget-object v3, v2, Lv5;->a:Ljava/lang/Object;

    check-cast v3, Ljava/util/ArrayDeque;

    invoke-virtual {v3}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LVt;

    if-nez v3, :cond_0

    invoke-virtual {v2}, Lyp;->g()LVt;

    move-result-object v3

    :cond_0
    check-cast v3, Lxp;

    const/16 v2, 0x8

    iput v2, v3, Lxp;->b:I

    iput-object v1, v3, Lxp;->c:Ljava/lang/Class;

    invoke-virtual {v0, v3, v1}, Lzp;->e(Lxp;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    check-cast v1, [B

    invoke-static {v1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    iget v2, p0, Lrw;->e:I

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    iget v2, p0, Lrw;->f:I

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    iget-object v0, p0, Lrw;->d:LSm;

    invoke-interface {v0, p1}, LSm;->b(Ljava/security/MessageDigest;)V

    iget-object v0, p0, Lrw;->c:LSm;

    invoke-interface {v0, p1}, LSm;->b(Ljava/security/MessageDigest;)V

    invoke-virtual {p1, v1}, Ljava/security/MessageDigest;->update([B)V

    iget-object v0, p0, Lrw;->i:LCB;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, LSm;->b(Ljava/security/MessageDigest;)V

    :cond_1
    iget-object v0, p0, Lrw;->h:Lvt;

    invoke-virtual {v0, p1}, Lvt;->b(Ljava/security/MessageDigest;)V

    sget-object v0, Lrw;->j:LCp;

    iget-object v2, p0, Lrw;->g:Ljava/lang/Class;

    invoke-virtual {v0, v2}, LCp;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [B

    if-nez v3, :cond_2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    sget-object v4, LSm;->a:Ljava/nio/charset/Charset;

    invoke-virtual {v3, v4}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v3

    invoke-virtual {v0, v2, v3}, LCp;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    invoke-virtual {p1, v3}, Ljava/security/MessageDigest;->update([B)V

    iget-object p1, p0, Lrw;->b:Lzp;

    invoke-virtual {p1, v1}, Lzp;->g(Ljava/lang/Object;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lrw;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Lrw;

    iget v0, p0, Lrw;->f:I

    iget v2, p1, Lrw;->f:I

    if-ne v0, v2, :cond_0

    iget v0, p0, Lrw;->e:I

    iget v2, p1, Lrw;->e:I

    if-ne v0, v2, :cond_0

    iget-object v0, p0, Lrw;->i:LCB;

    iget-object v2, p1, Lrw;->i:LCB;

    invoke-static {v0, v2}, LvD;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lrw;->g:Ljava/lang/Class;

    iget-object v2, p1, Lrw;->g:Ljava/lang/Class;

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lrw;->c:LSm;

    iget-object v2, p1, Lrw;->c:LSm;

    invoke-interface {v0, v2}, LSm;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lrw;->d:LSm;

    iget-object v2, p1, Lrw;->d:LSm;

    invoke-interface {v0, v2}, LSm;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lrw;->h:Lvt;

    iget-object p1, p1, Lrw;->h:Lvt;

    invoke-virtual {v0, p1}, Lvt;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v1
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lrw;->c:LSm;

    invoke-interface {v0}, LSm;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lrw;->d:LSm;

    invoke-interface {v1}, LSm;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Lrw;->e:I

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Lrw;->f:I

    add-int/2addr v1, v0

    iget-object v0, p0, Lrw;->i:LCB;

    if-eqz v0, :cond_0

    mul-int/lit8 v1, v1, 0x1f

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v1, v0

    :cond_0
    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lrw;->g:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lrw;->h:Lvt;

    iget-object v1, v1, Lvt;->b:LA6;

    invoke-virtual {v1}, LA6;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ResourceCacheKey{sourceKey="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lrw;->c:LSm;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", signature="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lrw;->d:LSm;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", width="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lrw;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", height="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lrw;->f:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", decodedResourceClass="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lrw;->g:Ljava/lang/Class;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", transformation=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lrw;->i:LCB;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\', options="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lrw;->h:Lvt;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
