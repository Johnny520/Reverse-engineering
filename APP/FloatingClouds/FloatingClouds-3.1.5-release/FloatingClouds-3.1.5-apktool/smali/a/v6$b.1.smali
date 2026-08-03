.class public final La/v6$b;
.super La/v;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/v6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/v6$b$a;,
        La/v6$b$b;,
        La/v6$b$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "La/v<",
        "Ljava/io/File;",
        ">;"
    }
.end annotation


# instance fields
.field public final c:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "La/v6$c;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic d:La/v6;


# direct methods
.method public constructor <init>(La/v6;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/v6$b;->d:La/v6;

    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, La/v6$b;->c:Ljava/util/ArrayDeque;

    iget-object v1, p1, La/v6;->a:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->isDirectory()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object p1, p1, La/v6;->a:Ljava/io/File;

    invoke-virtual {p0, p1}, La/v6$b;->b(Ljava/io/File;)La/v6$a;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object v1, p1, La/v6;->a:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->isFile()Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance v1, La/v6$b$b;

    iget-object p1, p1, La/v6;->a:Ljava/io/File;

    const-string v2, "rootFile"

    invoke-static {p1, v2}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, p1}, La/v6$c;-><init>(Ljava/io/File;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    return-void

    :cond_1
    const/4 p1, 0x2

    iput p1, p0, La/v;->a:I

    return-void
.end method


# virtual methods
.method public final b(Ljava/io/File;)La/v6$a;
    .locals 2

    iget-object v0, p0, La/v6$b;->d:La/v6;

    iget-object v0, v0, La/v6;->b:La/w6;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    new-instance v0, La/v6$b$a;

    invoke-direct {v0, p0, p1}, La/v6$b$a;-><init>(La/v6$b;Ljava/io/File;)V

    return-object v0

    :cond_0
    new-instance p1, La/Ob;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :cond_1
    new-instance v0, La/v6$b$c;

    invoke-direct {v0, p0, p1}, La/v6$b$c;-><init>(La/v6$b;Ljava/io/File;)V

    return-object v0
.end method
