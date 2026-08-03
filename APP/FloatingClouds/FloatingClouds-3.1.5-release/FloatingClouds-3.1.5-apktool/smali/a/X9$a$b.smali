.class public final La/X9$a$b;
.super La/X9$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/X9$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Z

.field public final d:La/l4;


# direct methods
.method public constructor <init>(ZLa/l4;)V
    .locals 1

    invoke-direct {p0}, La/X9$a;-><init>()V

    const-string v0, "\u9690\u85cf\u5bc6\u53cb\u6d88\u606f\u901a\u77e5"

    iput-object v0, p0, La/X9$a$b;->a:Ljava/lang/String;

    const-string v0, "\u5bc6\u53cb\u88ab\u9690\u85cf\u540e\u81ea\u52a8\u8bbe\u7f6e\u5fae\u4fe1\u539f\u751f\u514d\u6253\u6270\uff0c\u4e34\u65f6\u89e3\u9664\u540e\u6062\u590d\u63d0\u9192"

    iput-object v0, p0, La/X9$a$b;->b:Ljava/lang/String;

    iput-boolean p1, p0, La/X9$a$b;->c:Z

    iput-object p2, p0, La/X9$a$b;->d:La/l4;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, La/X9$a$b;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, La/X9$a$b;

    iget-object v0, p1, La/X9$a$b;->a:Ljava/lang/String;

    iget-object v1, p0, La/X9$a$b;->a:Ljava/lang/String;

    invoke-static {v1, v0}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    iget-object v0, p0, La/X9$a$b;->b:Ljava/lang/String;

    iget-object v1, p1, La/X9$a$b;->b:Ljava/lang/String;

    invoke-static {v0, v1}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    iget-boolean v0, p0, La/X9$a$b;->c:Z

    iget-boolean v1, p1, La/X9$a$b;->c:Z

    if-eq v0, v1, :cond_4

    goto :goto_0

    :cond_4
    iget-object v0, p0, La/X9$a$b;->d:La/l4;

    iget-object p1, p1, La/X9$a$b;->d:La/l4;

    invoke-static {v0, p1}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_5
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, La/X9$a$b;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, La/X9$a$b;->b:Ljava/lang/String;

    invoke-static {v2, v0, v1}, La/z;->b(Ljava/lang/String;II)I

    move-result v0

    iget-boolean v2, p0, La/X9$a$b;->c:Z

    invoke-static {v2}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, La/X9$a$b;->d:La/l4;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Switch(title="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, La/X9$a$b;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", desc="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, La/X9$a$b;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", checked="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, La/X9$a$b;->c:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", onCheckedChange="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, La/X9$a$b;->d:La/l4;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
