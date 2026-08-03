.class public final La/v6$b$c;
.super La/v6$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/v6$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "c"
.end annotation


# instance fields
.field public b:Z

.field public c:[Ljava/io/File;

.field public d:I

.field public final synthetic e:La/v6$b;


# direct methods
.method public constructor <init>(La/v6$b;Ljava/io/File;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            ")V"
        }
    .end annotation

    const-string v0, "rootDir"

    invoke-static {p2, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, La/v6$b$c;->e:La/v6$b;

    invoke-direct {p0, p2}, La/v6$c;-><init>(Ljava/io/File;)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/io/File;
    .locals 6

    iget-boolean v0, p0, La/v6$b$c;->b:Z

    iget-object v1, p0, La/v6$c;->a:Ljava/io/File;

    iget-object v2, p0, La/v6$b$c;->e:La/v6$b;

    if-nez v0, :cond_0

    iget-object v0, v2, La/v6$b;->d:La/v6;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x1

    iput-boolean v0, p0, La/v6$b$c;->b:Z

    return-object v1

    :cond_0
    iget-object v0, p0, La/v6$b$c;->c:[Ljava/io/File;

    const/4 v3, 0x0

    if-eqz v0, :cond_2

    iget v4, p0, La/v6$b$c;->d:I

    array-length v5, v0

    if-ge v4, v5, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, v2, La/v6$b;->d:La/v6;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object v3

    :cond_2
    :goto_0
    if-nez v0, :cond_5

    invoke-virtual {v1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    iput-object v0, p0, La/v6$b$c;->c:[Ljava/io/File;

    if-nez v0, :cond_3

    iget-object v0, v2, La/v6$b;->d:La/v6;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_3
    iget-object v0, p0, La/v6$b$c;->c:[Ljava/io/File;

    if-eqz v0, :cond_4

    array-length v0, v0

    if-nez v0, :cond_5

    :cond_4
    iget-object v0, v2, La/v6$b;->d:La/v6;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object v3

    :cond_5
    iget-object v0, p0, La/v6$b$c;->c:[Ljava/io/File;

    invoke-static {v0}, La/i9;->b(Ljava/lang/Object;)V

    iget v1, p0, La/v6$b$c;->d:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, La/v6$b$c;->d:I

    aget-object v0, v0, v1

    return-object v0
.end method
