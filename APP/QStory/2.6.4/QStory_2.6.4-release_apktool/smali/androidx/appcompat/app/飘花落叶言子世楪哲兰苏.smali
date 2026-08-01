.class public abstract Landroidx/appcompat/app/飘花落叶言子世楪哲兰苏;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# direct methods
.method public static 飘花落叶言子楪世哲兰苏(Landroid/content/res/Configuration;Landroidx/core/os/飘花落叶言子楪苏哲世兰;)V
    .locals 0

    .line 1
    iget-object p1, p1, Landroidx/core/os/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰:Landroidx/core/os/飘花落叶言子楪苏哲兰世;

    .line 2
    .line 3
    iget-object p1, p1, Landroidx/core/os/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Landroid/os/LocaleList;

    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/os/LocaleList;->toLanguageTags()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-static {p1}, Landroid/os/LocaleList;->forLanguageTags(Ljava/lang/String;)Landroid/os/LocaleList;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p0, p1}, Landroid/content/res/Configuration;->setLocales(Landroid/os/LocaleList;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public static 飘花落叶言子楪世哲苏兰(Landroidx/core/os/飘花落叶言子楪苏哲世兰;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/core/os/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰:Landroidx/core/os/飘花落叶言子楪苏哲兰世;

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/core/os/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Landroid/os/LocaleList;

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/os/LocaleList;->toLanguageTags()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-static {p0}, Landroid/os/LocaleList;->forLanguageTags(Ljava/lang/String;)Landroid/os/LocaleList;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-static {p0}, Landroid/os/LocaleList;->setDefault(Landroid/os/LocaleList;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public static 飘花落叶言子楪世苏兰哲(Landroid/content/res/Configuration;)Landroidx/core/os/飘花落叶言子楪苏哲世兰;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/content/res/Configuration;->getLocales()Landroid/os/LocaleList;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroid/os/LocaleList;->toLanguageTags()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-static {p0}, Landroidx/core/os/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Landroidx/core/os/飘花落叶言子楪苏哲世兰;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public static 飘花落叶言子楪世苏哲兰(Landroid/content/res/Configuration;Landroid/content/res/Configuration;Landroid/content/res/Configuration;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/content/res/Configuration;->getLocales()Landroid/os/LocaleList;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p1}, Landroid/content/res/Configuration;->getLocales()Landroid/os/LocaleList;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0, v0}, Landroid/os/LocaleList;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-nez p0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p2, v0}, Landroid/content/res/Configuration;->setLocales(Landroid/os/LocaleList;)V

    .line 16
    .line 17
    .line 18
    iget-object p0, p1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 19
    .line 20
    iput-object p0, p2, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 21
    .line 22
    :cond_0
    return-void
.end method
