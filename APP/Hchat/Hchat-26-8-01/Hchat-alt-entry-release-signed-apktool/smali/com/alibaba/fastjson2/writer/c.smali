.class public final synthetic Lcom/alibaba/fastjson2/writer/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/function/ToIntFunction;


# instance fields
.field public final synthetic a:Ljava/util/function/ToLongFunction;


# direct methods
.method public synthetic constructor <init>(Ljava/util/function/ToLongFunction;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/alibaba/fastjson2/writer/c;->a:Ljava/util/function/ToLongFunction;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final applyAsInt(Ljava/lang/Object;)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/c;->a:Ljava/util/function/ToLongFunction;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/writer/ObjectWriters;->a(Ljava/util/function/ToLongFunction;Ljava/lang/Object;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method
