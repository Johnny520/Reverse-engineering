.class public Llin/xposed/hook/javaplugin/controller/menu/PluginMenuUtils;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public addItemCallbackToPlugin(Llin/xposed/hook/javaplugin/controller/PluginLoader;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p0, p1, Llin/xposed/hook/javaplugin/controller/PluginLoader;->dialogItemMap:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {p0, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method
