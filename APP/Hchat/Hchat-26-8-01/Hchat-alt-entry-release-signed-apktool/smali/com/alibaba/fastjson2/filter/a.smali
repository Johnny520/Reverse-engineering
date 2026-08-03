.class public final synthetic Lcom/alibaba/fastjson2/filter/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lcom/alibaba/fastjson2/filter/NameFilter;


# instance fields
.field public final synthetic a:Lcom/alibaba/fastjson2/filter/NameFilter;

.field public final synthetic b:Lcom/alibaba/fastjson2/filter/NameFilter;


# direct methods
.method public synthetic constructor <init>(Lcom/alibaba/fastjson2/filter/NameFilter;Lcom/alibaba/fastjson2/filter/NameFilter;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/alibaba/fastjson2/filter/a;->a:Lcom/alibaba/fastjson2/filter/NameFilter;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/alibaba/fastjson2/filter/a;->b:Lcom/alibaba/fastjson2/filter/NameFilter;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final process(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/filter/a;->a:Lcom/alibaba/fastjson2/filter/NameFilter;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/filter/a;->b:Lcom/alibaba/fastjson2/filter/NameFilter;

    .line 4
    .line 5
    invoke-static {v0, v1, p1, p2, p3}, Lcom/alibaba/fastjson2/filter/NameFilter;->f(Lcom/alibaba/fastjson2/filter/NameFilter;Lcom/alibaba/fastjson2/filter/NameFilter;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method
