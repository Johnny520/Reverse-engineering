.class public final La/W5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/x4;
.implements Ljava/io/Serializable;


# static fields
.field public static final a:La/W5;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, La/W5;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, La/W5;->a:La/W5;

    return-void
.end method


# virtual methods
.method public final b(La/x4$b;)La/x4$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "La/x4$a;",
            ">(",
            "La/x4$b<",
            "TE;>;)TE;"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public final hashCode()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "EmptyCoroutineContext"

    return-object v0
.end method
