.class public final La/Ab;
.super La/A4;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    sget-object v0, La/A4$a;->b:La/A4$a;

    invoke-direct {p0, v0}, La/Ab;-><init>(La/A4;)V

    return-void
.end method

.method public constructor <init>(La/A4;)V
    .locals 1

    const-string v0, "initialExtras"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, La/A4;-><init>()V

    .line 3
    iget-object v0, p0, La/A4;->a:Ljava/util/LinkedHashMap;

    iget-object p1, p1, La/A4;->a:Ljava/util/LinkedHashMap;

    .line 4
    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    return-void
.end method
