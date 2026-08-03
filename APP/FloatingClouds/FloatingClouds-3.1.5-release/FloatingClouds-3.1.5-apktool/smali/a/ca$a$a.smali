.class public final La/ca$a$a;
.super La/ca$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/ca$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:La/ca$b;

.field public final b:La/ca$b;

.field public final c:La/ca$c;


# direct methods
.method public constructor <init>(La/ca$b;La/ca$b;La/ca$c;)V
    .locals 1

    const-string v0, "oldState"

    invoke-static {p2, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, La/ca$a;-><init>()V

    iput-object p1, p0, La/ca$a$a;->a:La/ca$b;

    iput-object p2, p0, La/ca$a$a;->b:La/ca$b;

    iput-object p3, p0, La/ca$a$a;->c:La/ca$c;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, La/ca$a$a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, La/ca$a$a;

    iget-object v1, p1, La/ca$a$a;->a:La/ca$b;

    iget-object v3, p0, La/ca$a$a;->a:La/ca$b;

    if-eq v3, v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, La/ca$a$a;->b:La/ca$b;

    iget-object v3, p1, La/ca$a$a;->b:La/ca$b;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, La/ca$a$a;->c:La/ca$c;

    iget-object p1, p1, La/ca$a$a;->c:La/ca$c;

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, La/ca$a$a;->a:La/ca$b;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, La/ca$a$a;->b:La/ca$b;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, La/ca$a$a;->c:La/ca$c;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "HideStateChanged(newState="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, La/ca$a$a;->a:La/ca$b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", oldState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, La/ca$a$a;->b:La/ca$b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", source="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, La/ca$a$a;->c:La/ca$c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
