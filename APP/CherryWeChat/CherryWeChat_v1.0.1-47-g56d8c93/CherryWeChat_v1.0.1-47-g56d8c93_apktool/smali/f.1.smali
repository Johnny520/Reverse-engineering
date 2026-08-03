.class public final synthetic Lf;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LUi;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput p1, p0, Lf;->a:I

    iput-object p2, p0, Lf;->b:Ljava/lang/Object;

    iput-object p3, p0, Lf;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 12

    iget v0, p0, Lf;->a:I

    const/4 v1, 0x0

    sget-object v2, LTC;->a:LTC;

    const/4 v3, 0x0

    iget-object v4, p0, Lf;->c:Ljava/lang/Object;

    iget-object v5, p0, Lf;->b:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v5, LMv;

    check-cast v4, Ljava/lang/CharSequence;

    iget-object v0, v5, LMv;->a:Ljava/util/regex/Pattern;

    invoke-virtual {v0, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-static {v0, v3, v4}, LfG;->E(Ljava/util/regex/Matcher;ILjava/lang/CharSequence;)Lzq;

    move-result-object v0

    return-object v0

    :pswitch_0
    check-cast v5, Lparty/iroiro/luajava/Lua;

    check-cast v4, Lio/github/cherrywechat/lua/api/MessageAPI$MessageCallback;

    invoke-static {v5, v4}, Lio/github/cherrywechat/lua/api/MessageAPI;->G(Lparty/iroiro/luajava/Lua;Lio/github/cherrywechat/lua/api/MessageAPI$MessageCallback;)LTC;

    move-result-object v0

    return-object v0

    :pswitch_1
    check-cast v5, Ljava/util/ArrayList;

    check-cast v4, Ljq;

    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    sget v0, Ljq;->e:I

    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v4, v5, v3}, Ljq;->l(Ljava/util/ArrayList;I)V

    :cond_1
    :goto_0
    return-object v2

    :pswitch_2
    check-cast v5, LRp;

    check-cast v4, Landroid/app/Activity;

    iget-object v0, v5, LRp;->q:Ljava/util/List;

    new-instance v6, Ljava/util/ArrayList;

    const/16 v7, 0xa

    invoke-static {v0, v7}, Lta;->d0(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LOp;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v9, v7, LOp;->a:Ljava/lang/String;

    const-wide v10, -0x188b3fffff835L

    invoke-static {v8, v9, v10, v11}, Lph;->n(Ljava/lang/StringBuilder;Ljava/lang/String;J)V

    iget-object v7, v7, LOp;->b:Ljava/lang/String;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    new-array v0, v3, [Ljava/lang/String;

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    new-instance v6, Landroid/app/AlertDialog$Builder;

    invoke-direct {v6, v4}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const-wide v7, -0x188b7fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v6, v4}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v4

    check-cast v0, [Ljava/lang/CharSequence;

    new-instance v6, LLp;

    invoke-direct {v6, v5, v3}, LLp;-><init>(LRp;I)V

    invoke-virtual {v4, v0, v6}, Landroid/app/AlertDialog$Builder;->setItems([Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const-wide v3, -0x188befffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3, v1}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    return-object v2

    :pswitch_3
    check-cast v5, LCx;

    check-cast v4, Lmm;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iget-object v2, v4, Lmm;->a:Lpm;

    invoke-static {v5, v4}, LTB;->v(LCx;Lmm;)V

    invoke-interface {v5}, LCx;->d()I

    move-result v2

    move v4, v3

    :goto_2
    if-ge v4, v2, :cond_9

    invoke-interface {v5, v4}, LCx;->i(I)Ljava/util/List;

    move-result-object v6

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_3
    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_4

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    instance-of v9, v8, LDm;

    if-eqz v9, :cond_3

    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_4
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v6

    const/4 v8, 0x1

    if-ne v6, v8, :cond_5

    invoke-virtual {v7, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    goto :goto_4

    :cond_5
    move-object v6, v1

    :goto_4
    check-cast v6, LDm;

    if-eqz v6, :cond_8

    invoke-interface {v6}, LDm;->names()[Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_8

    array-length v7, v6

    move v8, v3

    :goto_5
    if-ge v8, v7, :cond_8

    aget-object v9, v6, v8

    invoke-interface {v5}, LCx;->c()LfG;

    move-result-object v10

    sget-object v11, LFx;->h:LFx;

    invoke-static {v10, v11}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_6

    const-string v10, "enum value"

    goto :goto_6

    :cond_6
    const-string v10, "property"

    :goto_6
    invoke-interface {v0, v9}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_7

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v0, v9, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v8, v8, 0x1

    goto :goto_5

    :cond_7
    new-instance v1, Lym;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "The suggested name \'"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "\' for "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0x20

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-interface {v5, v4}, LCx;->e(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " is already one of the names for "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {v0, v9}, Luq;->J(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-interface {v5, v0}, LCx;->e(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " in "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_8
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_2

    :cond_9
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_a

    sget-object v0, LLf;->a:LLf;

    :cond_a
    return-object v0

    :pswitch_4
    check-cast v5, Landroid/widget/ImageView;

    check-cast v4, Landroid/graphics/Bitmap;

    invoke-static {v5, v4}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->m0(Landroid/widget/ImageView;Landroid/graphics/Bitmap;)LTC;

    move-result-object v0

    return-object v0

    :pswitch_5
    check-cast v5, Ljava/util/Map;

    check-cast v4, Lparty/iroiro/luajava/Lua;

    invoke-static {v5, v4}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->b(Ljava/util/Map;Lparty/iroiro/luajava/Lua;)LTC;

    move-result-object v0

    return-object v0

    :pswitch_6
    check-cast v5, Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageCallback;

    check-cast v4, Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageData;

    invoke-static {v5, v4}, Lio/github/cherrywechat/lua/api/CherryMessageAPI;->v(Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageCallback;Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageData;)LTC;

    move-result-object v0

    return-object v0

    :pswitch_7
    check-cast v5, Lparty/iroiro/luajava/Lua;

    check-cast v4, Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageCallback;

    invoke-static {v5, v4}, Lio/github/cherrywechat/lua/api/CherryMessageAPI;->d(Lparty/iroiro/luajava/Lua;Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageCallback;)LTC;

    move-result-object v0

    return-object v0

    :pswitch_8
    check-cast v5, Lm;

    check-cast v4, Lio/github/cherrywechat/network/model/Link;

    invoke-virtual {v4}, Lio/github/cherrywechat/network/model/Link;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lm;->j(Ljava/lang/String;)V

    return-object v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
