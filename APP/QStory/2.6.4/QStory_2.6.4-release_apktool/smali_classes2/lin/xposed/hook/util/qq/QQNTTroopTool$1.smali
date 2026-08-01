.class Llin/xposed/hook/util/qq/QQNTTroopTool$1;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llin/xposed/hook/util/qq/QQNTTroopTool;->getProhibitList(Ljava/lang/String;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Llin/xposed/hook/javaplugin/bean/GroupBanInfo;",
        ">;"
    }
.end annotation


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
.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 18
    check-cast p1, Llin/xposed/hook/javaplugin/bean/GroupBanInfo;

    check-cast p2, Llin/xposed/hook/javaplugin/bean/GroupBanInfo;

    invoke-virtual {p0, p1, p2}, Llin/xposed/hook/util/qq/QQNTTroopTool$1;->compare(Llin/xposed/hook/javaplugin/bean/GroupBanInfo;Llin/xposed/hook/javaplugin/bean/GroupBanInfo;)I

    move-result p0

    return p0
.end method

.method public compare(Llin/xposed/hook/javaplugin/bean/GroupBanInfo;Llin/xposed/hook/javaplugin/bean/GroupBanInfo;)I
    .locals 2

    .line 1
    iget-object p0, p1, Llin/xposed/hook/javaplugin/bean/GroupBanInfo;->UserUin:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 4
    .line 5
    .line 6
    move-result-wide p0

    .line 7
    iget-object p2, p2, Llin/xposed/hook/javaplugin/bean/GroupBanInfo;->UserUin:Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {p2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    invoke-static {p0, p1, v0, v1}, Ljava/lang/Long;->compare(JJ)I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0
.end method
