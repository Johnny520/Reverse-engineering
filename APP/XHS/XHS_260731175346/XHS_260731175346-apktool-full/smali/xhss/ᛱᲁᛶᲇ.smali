.class public abstract Lxhss/ᛱᲁᛶᲇ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# static fields
.field public static final ᛱᛱᛲᲇ:Lxhss/ᲇᲀᲈᛲ;

.field public static ᛳᲁᲇᛸ:Landroid/graphics/Paint;

.field public static final ᛷᛵᛵᲈ:Lxhss/ᛶᛵᲇᛸ;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "TypefaceCompat static init"

    .line 2
    .line 3
    invoke-static {v0}, Lxhss/ᛱᛷᛵᛷ;->ᛳᲁᲇᛸ(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 7
    .line 8
    const/16 v1, 0x1f

    .line 9
    .line 10
    if-lt v0, v1, :cond_0

    .line 11
    .line 12
    new-instance v0, Lxhss/ᲈᲇᲈᛴ;

    .line 13
    .line 14
    invoke-direct {v0}, Lxhss/ᛶᛵᲇᛸ;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lxhss/ᛱᲁᛶᲇ;->ᛷᛵᛵᲈ:Lxhss/ᛶᛵᲇᛸ;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lxhss/ᛶᛵᲇᛸ;

    .line 21
    .line 22
    invoke-direct {v0}, Lxhss/ᛶᛵᲇᛸ;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, Lxhss/ᛱᲁᛶᲇ;->ᛷᛵᛵᲈ:Lxhss/ᛶᛵᲇᛸ;

    .line 26
    .line 27
    :goto_0
    new-instance v0, Lxhss/ᲇᲀᲈᛲ;

    .line 28
    .line 29
    const/16 v1, 0x10

    .line 30
    .line 31
    invoke-direct {v0, v1}, Lxhss/ᲇᲀᲈᛲ;-><init>(I)V

    .line 32
    .line 33
    .line 34
    sput-object v0, Lxhss/ᛱᲁᛶᲇ;->ᛱᛱᛲᲇ:Lxhss/ᲇᲀᲈᛲ;

    .line 35
    .line 36
    const/4 v0, 0x0

    .line 37
    sput-object v0, Lxhss/ᛱᲁᛶᲇ;->ᛳᲁᲇᛸ:Landroid/graphics/Paint;

    .line 38
    .line 39
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public static ᛱᛱᛲᲇ(Landroid/content/Context;Lxhss/ᛶᛶᲈᛱ;Landroid/content/res/Resources;ILjava/lang/String;IILxhss/ᛷᲀᲇᲀ;)Landroid/graphics/Typeface;
    .locals 13

    move/from16 v4, p6

    move-object/from16 v1, p7

    .line 1
    instance-of v0, p1, Lxhss/ᲀᛲᲈᛶ;

    const/4 v6, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_13

    .line 2
    check-cast p1, Lxhss/ᲀᛲᲈᛶ;

    .line 3
    const-string v0, "TypefaceCompat"

    iget-object v3, p1, Lxhss/ᲀᛲᲈᛶ;->ᲇᛴᲇᛵ:Ljava/lang/String;

    .line 4
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    const/4 v7, 0x1

    if-nez v5, :cond_0

    .line 5
    invoke-static {v3}, Lxhss/ᛱᲁᛶᲇ;->ᛷᛴᛷᛱ(Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v3

    if-eqz v3, :cond_0

    goto/16 :goto_6

    .line 6
    :cond_0
    iget-object v3, p1, Lxhss/ᲀᛲᲈᛶ;->ᛷᛵᛵᲈ:Ljava/util/ArrayList;

    .line 7
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-ne v5, v7, :cond_1

    .line 8
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lxhss/ᛷᛱᛲᲇ;

    .line 9
    iget-object v0, v0, Lxhss/ᛷᛱᛲᲇ;->ᛷᛴᛷᛱ:Ljava/lang/String;

    .line 10
    invoke-static {v0}, Lxhss/ᛱᲁᛶᲇ;->ᛷᛴᛷᛱ(Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v3

    goto/16 :goto_6

    .line 11
    :cond_1
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v8, 0x1f

    if-ge v5, v8, :cond_2

    :goto_0
    move-object v3, v6

    goto/16 :goto_6

    :cond_2
    move v5, v2

    .line 12
    :goto_1
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v8

    if-ge v5, v8, :cond_4

    .line 13
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lxhss/ᛷᛱᛲᲇ;

    .line 14
    iget-object v8, v8, Lxhss/ᛷᛱᛲᲇ;->ᛷᛴᛷᛱ:Ljava/lang/String;

    .line 15
    invoke-static {v8}, Lxhss/ᛱᲁᛶᲇ;->ᛷᛴᛷᛱ(Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v8

    if-nez v8, :cond_3

    goto :goto_0

    :cond_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_4
    move v5, v2

    move-object v8, v6

    .line 16
    :goto_2
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v9

    if-ge v5, v9, :cond_9

    .line 17
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lxhss/ᛷᛱᛲᲇ;

    .line 18
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v10

    sub-int/2addr v10, v7

    if-ne v5, v10, :cond_5

    .line 19
    iget-object v10, v9, Lxhss/ᛷᛱᛲᲇ;->ᲇᛶᛴᲀ:Ljava/lang/String;

    .line 20
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v10

    if-eqz v10, :cond_5

    .line 21
    iget-object v0, v9, Lxhss/ᛷᛱᛲᲇ;->ᛷᛴᛷᛱ:Ljava/lang/String;

    .line 22
    invoke-virtual {v8, v0}, Landroid/graphics/Typeface$CustomFallbackBuilder;->setSystemFallback(Ljava/lang/String;)Landroid/graphics/Typeface$CustomFallbackBuilder;

    goto :goto_5

    .line 23
    :cond_5
    iget-object v10, v9, Lxhss/ᛷᛱᛲᲇ;->ᛷᛴᛷᛱ:Ljava/lang/String;

    iget-object v11, v9, Lxhss/ᛷᛱᛲᲇ;->ᲇᛶᛴᲀ:Ljava/lang/String;

    .line 24
    invoke-static {v10}, Lxhss/ᛱᲁᛶᲇ;->ᛷᛴᛷᛱ(Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v10

    invoke-static {v10}, Lxhss/ᛱᲁᛶᲇ;->ᲇᛶᛴᲀ(Landroid/graphics/Typeface;)Landroid/graphics/fonts/Font;

    move-result-object v10

    if-nez v10, :cond_6

    .line 25
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v5, "Unable identify the primary font for "

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 26
    iget-object v5, v9, Lxhss/ᛷᛱᛲᲇ;->ᛷᛴᛷᛱ:Ljava/lang/String;

    .line 27
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ". Falling back to provider font."

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 28
    :cond_6
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v9

    if-nez v9, :cond_7

    .line 29
    :try_start_0
    new-instance v9, Landroid/graphics/fonts/FontFamily$Builder;

    new-instance v12, Landroid/graphics/fonts/Font$Builder;

    invoke-static {v10}, Lxhss/ᲇᛳᛶᛴ;->ᲇᛴᲇᛵ(Landroid/graphics/fonts/Font;)Landroid/graphics/fonts/Font$Builder;

    move-result-object v10

    .line 30
    invoke-virtual {v10, v11}, Landroid/graphics/fonts/Font$Builder;->setFontVariationSettings(Ljava/lang/String;)Landroid/graphics/fonts/Font$Builder;

    move-result-object v10

    .line 31
    invoke-virtual {v10}, Landroid/graphics/fonts/Font$Builder;->build()Landroid/graphics/fonts/Font;

    move-result-object v10

    invoke-direct {v9, v10}, Landroid/graphics/fonts/FontFamily$Builder;-><init>(Landroid/graphics/fonts/Font;)V

    invoke-virtual {v9}, Landroid/graphics/fonts/FontFamily$Builder;->build()Landroid/graphics/fonts/FontFamily;

    move-result-object v9
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    .line 32
    :catch_0
    const-string v3, "Failed to clone Font instance. Fall back to provider font."

    invoke-static {v0, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_0

    .line 33
    :cond_7
    new-instance v9, Landroid/graphics/fonts/FontFamily$Builder;

    invoke-direct {v9, v10}, Landroid/graphics/fonts/FontFamily$Builder;-><init>(Landroid/graphics/fonts/Font;)V

    invoke-virtual {v9}, Landroid/graphics/fonts/FontFamily$Builder;->build()Landroid/graphics/fonts/FontFamily;

    move-result-object v9

    :goto_3
    if-nez v8, :cond_8

    .line 34
    new-instance v8, Landroid/graphics/Typeface$CustomFallbackBuilder;

    invoke-direct {v8, v9}, Landroid/graphics/Typeface$CustomFallbackBuilder;-><init>(Landroid/graphics/fonts/FontFamily;)V

    goto :goto_4

    .line 35
    :cond_8
    invoke-virtual {v8, v9}, Landroid/graphics/Typeface$CustomFallbackBuilder;->addCustomFallback(Landroid/graphics/fonts/FontFamily;)Landroid/graphics/Typeface$CustomFallbackBuilder;

    :goto_4
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_2

    .line 36
    :cond_9
    :goto_5
    invoke-virtual {v8}, Landroid/graphics/Typeface$CustomFallbackBuilder;->build()Landroid/graphics/Typeface;

    move-result-object v3

    :goto_6
    if-eqz v3, :cond_a

    .line 37
    new-instance p0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p1

    invoke-direct {p0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 38
    new-instance p1, Lxhss/ᲈᲈᛸᛳ;

    invoke-direct {p1, v1, v3}, Lxhss/ᲈᲈᛸᛳ;-><init>(Lxhss/ᛷᲀᲇᲀ;Landroid/graphics/Typeface;)V

    invoke-virtual {p0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 39
    sget-object p0, Lxhss/ᛱᲁᛶᲇ;->ᛱᛱᛲᲇ:Lxhss/ᲇᲀᲈᛲ;

    invoke-static/range {p2 .. p6}, Lxhss/ᛱᲁᛶᲇ;->ᲇᛴᲇᛵ(Landroid/content/res/Resources;ILjava/lang/String;II)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, v3}, Lxhss/ᲇᲀᲈᛲ;->ᛱᛱᛲᲇ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v3

    .line 40
    :cond_a
    iget v0, p1, Lxhss/ᲀᛲᲈᛶ;->ᛳᲁᲇᛸ:I

    if-nez v0, :cond_b

    move v0, v7

    goto :goto_7

    :cond_b
    move v0, v2

    .line 41
    :goto_7
    iget v8, p1, Lxhss/ᲀᛲᲈᛶ;->ᛱᛱᛲᲇ:I

    .line 42
    new-instance v3, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v5

    invoke-direct {v3, v5}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 43
    new-instance v5, Lxhss/ᲇᛵᛲᲁ;

    const/16 v9, 0x17

    .line 44
    invoke-direct {v5, v9}, Lxhss/ᲇᛵᛲᲁ;-><init>(I)V

    .line 45
    iput-object v1, v5, Lxhss/ᲇᛵᛲᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 46
    iget-object p1, p1, Lxhss/ᲀᛲᲈᛶ;->ᛷᛵᛵᲈ:Ljava/util/ArrayList;

    .line 47
    new-instance v9, Lxhss/ᛳᛱᛲᲀ;

    .line 48
    new-instance v1, Lxhss/ᲈᲀᛶᛶ;

    invoke-direct {v1, v3}, Lxhss/ᲈᲀᛶᛶ;-><init>(Landroid/os/Handler;)V

    const/4 v3, 0x3

    .line 49
    invoke-direct {v9, v3, v5, v1}, Lxhss/ᛳᛱᛲᲀ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    if-eqz v0, :cond_f

    .line 50
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gt v0, v7, :cond_e

    .line 51
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    move-object v3, p1

    check-cast v3, Lxhss/ᛷᛱᛲᲇ;

    sget-object p1, Lxhss/ᛳᛷᲈᛵ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲀᲈᛲ;

    .line 52
    invoke-static {v3}, Ljava/util/List;->of(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1, v4}, Lxhss/ᛳᛷᲈᛵ;->ᛷᛵᛵᲈ(Ljava/util/List;I)Ljava/lang/String;

    move-result-object p1

    .line 53
    sget-object v0, Lxhss/ᛳᛷᲈᛵ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲀᲈᛲ;

    invoke-virtual {v0, p1}, Lxhss/ᲇᲀᲈᛲ;->ᛷᛵᛵᲈ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Typeface;

    if-eqz v0, :cond_c

    .line 54
    new-instance p0, Lxhss/ᛳᛵᛲᲇ;

    invoke-direct {p0, v2, v5, v0}, Lxhss/ᛳᛵᛲᲇ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, p0}, Lxhss/ᲈᲀᛶᛶ;->execute(Ljava/lang/Runnable;)V

    move-object v6, v0

    goto/16 :goto_10

    :cond_c
    const/4 v0, -0x1

    if-ne v8, v0, :cond_d

    .line 55
    invoke-static {v3}, Ljava/util/List;->of(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {p1, p0, v0, v4}, Lxhss/ᛳᛷᲈᛵ;->ᛱᛱᛲᲇ(Ljava/lang/String;Landroid/content/Context;Ljava/util/List;I)Lxhss/ᛳᛵᛴᲈ;

    move-result-object p0

    .line 56
    invoke-virtual {v9, p0}, Lxhss/ᛳᛱᛲᲀ;->ᲇᛸᛳᲁ(Lxhss/ᛳᛵᛴᲈ;)V

    .line 57
    iget-object v6, p0, Lxhss/ᛳᛵᛴᲈ;->ᛷᛵᛵᲈ:Landroid/graphics/Typeface;

    goto/16 :goto_10

    .line 58
    :cond_d
    new-instance v0, Lxhss/ᛳᛱᛵᛱ;

    const/4 v5, 0x0

    move-object v2, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lxhss/ᛳᛱᛵᛱ;-><init>(Ljava/lang/String;Landroid/content/Context;Ljava/lang/Object;II)V

    .line 59
    :try_start_1
    sget-object p0, Lxhss/ᛳᛷᲈᛵ;->ᛱᛱᛲᲇ:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 60
    invoke-interface {p0, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p0
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_4

    int-to-long v0, v8

    .line 61
    :try_start_2
    sget-object p1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {p0, v0, v1, p1}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object p0
    :try_end_2
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_2 .. :try_end_2} :catch_3

    .line 62
    :try_start_3
    check-cast p0, Lxhss/ᛳᛵᛴᲈ;

    .line 63
    invoke-virtual {v9, p0}, Lxhss/ᛳᛱᛲᲀ;->ᲇᛸᛳᲁ(Lxhss/ᛳᛵᛴᲈ;)V

    .line 64
    iget-object v6, p0, Lxhss/ᛳᛵᛴᲈ;->ᛷᛵᛵᲈ:Landroid/graphics/Typeface;

    goto/16 :goto_10

    :catch_1
    move-exception v0

    move-object p0, v0

    goto :goto_8

    :catch_2
    move-exception v0

    move-object p0, v0

    goto :goto_9

    .line 65
    :catch_3
    new-instance p0, Ljava/lang/InterruptedException;

    const-string p1, "timeout"

    invoke-direct {p0, p1}, Ljava/lang/InterruptedException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 66
    :goto_8
    throw p0

    .line 67
    :goto_9
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p1
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_4

    .line 68
    :catch_4
    iget-object p0, v9, Lxhss/ᛳᛱᛲᲀ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    check-cast p0, Lxhss/ᲈᲀᛶᛶ;

    .line 69
    iget-object p1, v9, Lxhss/ᛳᛱᛲᲀ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    check-cast p1, Lxhss/ᲇᛵᛲᲁ;

    .line 70
    new-instance v0, Lxhss/ᲀᛸᲁᛲ;

    const/4 v1, -0x3

    invoke-direct {v0, p1, v1}, Lxhss/ᲀᛸᲁᛲ;-><init>(Lxhss/ᲇᛵᛲᲁ;I)V

    invoke-virtual {p0, v0}, Lxhss/ᲈᲀᛶᛶ;->execute(Ljava/lang/Runnable;)V

    goto/16 :goto_10

    .line 71
    :cond_e
    const-string p0, "Fallbacks with blocking fetches are not supported for performance reasons"

    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᲀᲇᛳᲁ(Ljava/lang/String;)V

    return-object v6

    .line 72
    :cond_f
    invoke-static {p1, v4}, Lxhss/ᛳᛷᲈᛵ;->ᛷᛵᛵᲈ(Ljava/util/List;I)Ljava/lang/String;

    move-result-object v0

    .line 73
    sget-object v3, Lxhss/ᛳᛷᲈᛵ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲀᲈᛲ;

    invoke-virtual {v3, v0}, Lxhss/ᲇᲀᲈᛲ;->ᛷᛵᛵᲈ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/graphics/Typeface;

    if-eqz v3, :cond_10

    .line 74
    new-instance p0, Lxhss/ᛳᛵᛲᲇ;

    invoke-direct {p0, v2, v5, v3}, Lxhss/ᛳᛵᛲᲇ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, p0}, Lxhss/ᲈᲀᛶᛶ;->execute(Ljava/lang/Runnable;)V

    move-object v6, v3

    goto/16 :goto_10

    .line 75
    :cond_10
    new-instance v1, Lxhss/ᲀᛶᛲᛵ;

    invoke-direct {v1, v2, v9}, Lxhss/ᲀᛶᛲᛵ;-><init>(ILjava/lang/Object;)V

    .line 76
    sget-object v3, Lxhss/ᛳᛷᲈᛵ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    monitor-enter v3

    .line 77
    :try_start_4
    sget-object v2, Lxhss/ᛳᛷᲈᛵ;->ᲇᛴᲇᛵ:Lxhss/ᛴᛶᲀᛶ;

    invoke-virtual {v2, v0}, Lxhss/ᛴᛶᲀᛶ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/ArrayList;

    if-eqz v5, :cond_11

    .line 78
    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 79
    monitor-exit v3

    goto/16 :goto_10

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_b

    .line 80
    :cond_11
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 81
    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 82
    invoke-virtual {v2, v0, v5}, Lxhss/ᛴᛶᲀᛶ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    monitor-exit v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    move-object v1, v0

    .line 84
    new-instance v0, Lxhss/ᛳᛱᛵᛱ;

    const/4 v5, 0x1

    move-object v2, p0

    move-object v3, p1

    invoke-direct/range {v0 .. v5}, Lxhss/ᛳᛱᛵᛱ;-><init>(Ljava/lang/String;Landroid/content/Context;Ljava/lang/Object;II)V

    .line 85
    sget-object p0, Lxhss/ᛳᛷᲈᛵ;->ᛱᛱᛲᲇ:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 86
    new-instance p1, Lxhss/ᲀᛶᛲᛵ;

    invoke-direct {p1, v7, v1}, Lxhss/ᲀᛶᛲᛵ;-><init>(ILjava/lang/Object;)V

    .line 87
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    if-nez v1, :cond_12

    .line 88
    new-instance v1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    goto :goto_a

    .line 89
    :cond_12
    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    .line 90
    :goto_a
    new-instance v2, Lxhss/ᲀᛳᲀᛴ;

    .line 91
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 92
    iput-object v0, v2, Lxhss/ᲀᛳᲀᛴ;->ᛱᛱᛲᲇ:Lxhss/ᛳᛱᛵᛱ;

    .line 93
    iput-object p1, v2, Lxhss/ᲀᛳᲀᛴ;->ᛳᲁᲇᛸ:Lxhss/ᲀᛶᛲᛵ;

    .line 94
    iput-object v1, v2, Lxhss/ᲀᛳᲀᛴ;->ᲇᛴᲇᛵ:Landroid/os/Handler;

    .line 95
    invoke-virtual {p0, v2}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    goto/16 :goto_10

    .line 96
    :goto_b
    :try_start_5
    monitor-exit v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    throw p0

    .line 97
    :cond_13
    sget-object p0, Lxhss/ᛱᲁᛶᲇ;->ᛷᛵᛵᲈ:Lxhss/ᛶᛵᲇᛸ;

    check-cast p1, Lxhss/ᛷᲁᛵ;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    :try_start_6
    iget-object p0, p1, Lxhss/ᛷᲁᛵ;->ᛷᛵᛵᲈ:[Lxhss/ᛲᲁᲈᛱ;

    .line 99
    array-length p1, p0

    move-object v0, v6

    :goto_c
    if-ge v2, p1, :cond_15

    aget-object v3, p0, v2
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_5

    .line 100
    :try_start_7
    new-instance v5, Landroid/graphics/fonts/Font$Builder;

    .line 101
    iget v7, v3, Lxhss/ᛲᲁᲈᛱ;->ᛷᛴᛷᛱ:I

    .line 102
    invoke-direct {v5, p2, v7}, Landroid/graphics/fonts/Font$Builder;-><init>(Landroid/content/res/Resources;I)V

    .line 103
    iget v7, v3, Lxhss/ᛲᲁᲈᛱ;->ᛷᛵᛵᲈ:I

    .line 104
    invoke-virtual {v5, v7}, Landroid/graphics/fonts/Font$Builder;->setWeight(I)Landroid/graphics/fonts/Font$Builder;

    move-result-object v5

    .line 105
    iget-boolean v7, v3, Lxhss/ᛲᲁᲈᛱ;->ᛱᛱᛲᲇ:Z

    .line 106
    invoke-virtual {v5, v7}, Landroid/graphics/fonts/Font$Builder;->setSlant(I)Landroid/graphics/fonts/Font$Builder;

    move-result-object v5

    .line 107
    iget v7, v3, Lxhss/ᛲᲁᲈᛱ;->ᲇᛴᲇᛵ:I

    .line 108
    invoke-virtual {v5, v7}, Landroid/graphics/fonts/Font$Builder;->setTtcIndex(I)Landroid/graphics/fonts/Font$Builder;

    move-result-object v5

    .line 109
    iget-object v3, v3, Lxhss/ᛲᲁᲈᛱ;->ᛳᲁᲇᛸ:Ljava/lang/String;

    .line 110
    invoke-virtual {v5, v3}, Landroid/graphics/fonts/Font$Builder;->setFontVariationSettings(Ljava/lang/String;)Landroid/graphics/fonts/Font$Builder;

    move-result-object v3

    .line 111
    invoke-virtual {v3}, Landroid/graphics/fonts/Font$Builder;->build()Landroid/graphics/fonts/Font;

    move-result-object v3

    if-nez v0, :cond_14

    .line 112
    new-instance v5, Landroid/graphics/fonts/FontFamily$Builder;

    invoke-direct {v5, v3}, Landroid/graphics/fonts/FontFamily$Builder;-><init>(Landroid/graphics/fonts/Font;)V

    move-object v0, v5

    goto :goto_d

    :catch_5
    move-exception v0

    move-object p0, v0

    goto :goto_e

    .line 113
    :cond_14
    invoke-virtual {v0, v3}, Landroid/graphics/fonts/FontFamily$Builder;->addFont(Landroid/graphics/fonts/Font;)Landroid/graphics/fonts/FontFamily$Builder;
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_6
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_5

    :catch_6
    :goto_d
    add-int/lit8 v2, v2, 0x1

    goto :goto_c

    :cond_15
    if-nez v0, :cond_16

    goto :goto_f

    .line 114
    :cond_16
    :try_start_8
    invoke-virtual {v0}, Landroid/graphics/fonts/FontFamily$Builder;->build()Landroid/graphics/fonts/FontFamily;

    move-result-object p0

    .line 115
    new-instance p1, Landroid/graphics/Typeface$CustomFallbackBuilder;

    invoke-direct {p1, p0}, Landroid/graphics/Typeface$CustomFallbackBuilder;-><init>(Landroid/graphics/fonts/FontFamily;)V

    .line 116
    invoke-static {p0, v4}, Lxhss/ᛶᛵᲇᛸ;->ᛸᛲᲀᛵ(Landroid/graphics/fonts/FontFamily;I)Landroid/graphics/fonts/Font;

    move-result-object p0

    invoke-virtual {p0}, Landroid/graphics/fonts/Font;->getStyle()Landroid/graphics/fonts/FontStyle;

    move-result-object p0

    invoke-virtual {p1, p0}, Landroid/graphics/Typeface$CustomFallbackBuilder;->setStyle(Landroid/graphics/fonts/FontStyle;)Landroid/graphics/Typeface$CustomFallbackBuilder;

    move-result-object p0

    .line 117
    invoke-virtual {p0}, Landroid/graphics/Typeface$CustomFallbackBuilder;->build()Landroid/graphics/Typeface;

    move-result-object v6
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_5

    goto :goto_f

    .line 118
    :goto_e
    const-string p1, "TypefaceCompatApi29Impl"

    const-string v0, "Font load failed"

    invoke-static {p1, v0, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_f
    if-eqz v6, :cond_17

    .line 119
    new-instance p0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p1

    invoke-direct {p0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 120
    new-instance p1, Lxhss/ᲈᲈᛸᛳ;

    invoke-direct {p1, v1, v6}, Lxhss/ᲈᲈᛸᛳ;-><init>(Lxhss/ᛷᲀᲇᲀ;Landroid/graphics/Typeface;)V

    invoke-virtual {p0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_10

    .line 121
    :cond_17
    invoke-virtual {v1}, Lxhss/ᛷᲀᲇᲀ;->ᛷᛵᛵᲈ()V

    :goto_10
    if-eqz v6, :cond_18

    .line 122
    sget-object p0, Lxhss/ᛱᲁᛶᲇ;->ᛱᛱᛲᲇ:Lxhss/ᲇᲀᲈᛲ;

    invoke-static/range {p2 .. p6}, Lxhss/ᛱᲁᛶᲇ;->ᲇᛴᲇᛵ(Landroid/content/res/Resources;ILjava/lang/String;II)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, v6}, Lxhss/ᲇᲀᲈᛲ;->ᛱᛱᛲᲇ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_18
    return-object v6
.end method

.method public static ᛳᲁᲇᛸ(Landroid/content/res/Resources;ILjava/lang/String;II)Landroid/graphics/Typeface;
    .locals 3

    .line 1
    sget-object v0, Lxhss/ᛱᲁᛶᲇ;->ᛷᛵᛵᲈ:Lxhss/ᛶᛵᲇᛸ;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    :try_start_0
    new-instance v0, Landroid/graphics/fonts/Font$Builder;

    .line 7
    .line 8
    invoke-direct {v0, p0, p1}, Landroid/graphics/fonts/Font$Builder;-><init>(Landroid/content/res/Resources;I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/graphics/fonts/Font$Builder;->build()Landroid/graphics/fonts/Font;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, Landroid/graphics/fonts/FontFamily$Builder;

    .line 16
    .line 17
    invoke-direct {v1, v0}, Landroid/graphics/fonts/FontFamily$Builder;-><init>(Landroid/graphics/fonts/Font;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Landroid/graphics/fonts/FontFamily$Builder;->build()Landroid/graphics/fonts/FontFamily;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    new-instance v2, Landroid/graphics/Typeface$CustomFallbackBuilder;

    .line 25
    .line 26
    invoke-direct {v2, v1}, Landroid/graphics/Typeface$CustomFallbackBuilder;-><init>(Landroid/graphics/fonts/FontFamily;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/graphics/fonts/Font;->getStyle()Landroid/graphics/fonts/FontStyle;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v2, v0}, Landroid/graphics/Typeface$CustomFallbackBuilder;->setStyle(Landroid/graphics/fonts/FontStyle;)Landroid/graphics/Typeface$CustomFallbackBuilder;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v0}, Landroid/graphics/Typeface$CustomFallbackBuilder;->build()Landroid/graphics/Typeface;

    .line 38
    .line 39
    .line 40
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    goto :goto_0

    .line 42
    :catch_0
    move-exception v0

    .line 43
    const-string v1, "TypefaceCompatApi29Impl"

    .line 44
    .line 45
    const-string v2, "Font load failed"

    .line 46
    .line 47
    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 48
    .line 49
    .line 50
    const/4 v0, 0x0

    .line 51
    :goto_0
    if-eqz v0, :cond_0

    .line 52
    .line 53
    invoke-static {p0, p1, p2, p3, p4}, Lxhss/ᛱᲁᛶᲇ;->ᲇᛴᲇᛵ(Landroid/content/res/Resources;ILjava/lang/String;II)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    sget-object p1, Lxhss/ᛱᲁᛶᲇ;->ᛱᛱᛲᲇ:Lxhss/ᲇᲀᲈᛲ;

    .line 58
    .line 59
    invoke-virtual {p1, p0, v0}, Lxhss/ᲇᲀᲈᛲ;->ᛱᛱᛲᲇ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    :cond_0
    return-object v0
.end method

.method public static ᛷᛴᛷᛱ(Ljava/lang/String;)Landroid/graphics/Typeface;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_1

    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v1, 0x0

    .line 12
    invoke-static {p0, v1}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    sget-object v2, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    .line 17
    .line 18
    invoke-static {v2, v1}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    if-eqz p0, :cond_1

    .line 23
    .line 24
    invoke-virtual {p0, v1}, Landroid/graphics/Typeface;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_1

    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_1
    :goto_0
    return-object v0
.end method

.method public static ᛷᛵᛵᲈ(Landroid/content/Context;[Lxhss/ᛵᛶᲈᛳ;I)Landroid/graphics/Typeface;
    .locals 2

    .line 1
    const-string v0, "TypefaceCompat.createFromFontInfo"

    .line 2
    .line 3
    invoke-static {v0}, Lxhss/ᛱᛷᛵᛷ;->ᛳᲁᲇᛸ(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    sget-object v0, Lxhss/ᛱᲁᛶᲇ;->ᛷᛵᛵᲈ:Lxhss/ᛶᛵᲇᛸ;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 12
    .line 13
    .line 14
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    const/4 v1, 0x0

    .line 16
    :try_start_1
    invoke-virtual {v0, p1, p0}, Lxhss/ᛶᛵᲇᛸ;->ᛸᛷᲈᲈ([Lxhss/ᛵᛶᲈᛳ;Landroid/content/ContentResolver;)Landroid/graphics/fonts/FontFamily;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    if-nez p0, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-instance p1, Landroid/graphics/Typeface$CustomFallbackBuilder;

    .line 24
    .line 25
    invoke-direct {p1, p0}, Landroid/graphics/Typeface$CustomFallbackBuilder;-><init>(Landroid/graphics/fonts/FontFamily;)V

    .line 26
    .line 27
    .line 28
    invoke-static {p0, p2}, Lxhss/ᛶᛵᲇᛸ;->ᛸᛲᲀᛵ(Landroid/graphics/fonts/FontFamily;I)Landroid/graphics/fonts/Font;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {p0}, Landroid/graphics/fonts/Font;->getStyle()Landroid/graphics/fonts/FontStyle;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {p1, p0}, Landroid/graphics/Typeface$CustomFallbackBuilder;->setStyle(Landroid/graphics/fonts/FontStyle;)Landroid/graphics/Typeface$CustomFallbackBuilder;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-virtual {p0}, Landroid/graphics/Typeface$CustomFallbackBuilder;->build()Landroid/graphics/Typeface;

    .line 41
    .line 42
    .line 43
    move-result-object v1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 44
    goto :goto_0

    .line 45
    :catch_0
    move-exception p0

    .line 46
    :try_start_2
    const-string p1, "TypefaceCompatApi29Impl"

    .line 47
    .line 48
    const-string p2, "Font load failed"

    .line 49
    .line 50
    invoke-static {p1, p2, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 51
    .line 52
    .line 53
    :goto_0
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 54
    .line 55
    .line 56
    return-object v1

    .line 57
    :catchall_0
    move-exception p0

    .line 58
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 59
    .line 60
    .line 61
    throw p0
.end method

.method public static ᲇᛴᲇᛵ(Landroid/content/res/Resources;ILjava/lang/String;II)Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getResourcePackageName(I)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const/16 p0, 0x2d

    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0
.end method

.method public static ᲇᛶᛴᲀ(Landroid/graphics/Typeface;)Landroid/graphics/fonts/Font;
    .locals 2

    .line 1
    sget-object v0, Lxhss/ᛱᲁᛶᲇ;->ᛳᲁᲇᛸ:Landroid/graphics/Paint;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroid/graphics/Paint;

    .line 6
    .line 7
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lxhss/ᛱᲁᛶᲇ;->ᛳᲁᲇᛸ:Landroid/graphics/Paint;

    .line 11
    .line 12
    :cond_0
    const/high16 v1, 0x41200000    # 10.0f

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 15
    .line 16
    .line 17
    sget-object v0, Lxhss/ᛱᲁᛶᲇ;->ᛳᲁᲇᛸ:Landroid/graphics/Paint;

    .line 18
    .line 19
    invoke-virtual {v0, p0}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 20
    .line 21
    .line 22
    sget-object p0, Lxhss/ᛱᲁᛶᲇ;->ᛳᲁᲇᛸ:Landroid/graphics/Paint;

    .line 23
    .line 24
    invoke-static {p0}, Lxhss/ᲇᛳᛶᛴ;->ᲇᛶᛴᲀ(Landroid/graphics/Paint;)Landroid/graphics/text/PositionedGlyphs;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-static {p0}, Lxhss/ᲇᛳᛶᛴ;->ᛷᛵᛵᲈ(Landroid/graphics/text/PositionedGlyphs;)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    const/4 p0, 0x0

    .line 35
    return-object p0

    .line 36
    :cond_1
    invoke-static {p0}, Lxhss/ᲇᛳᛶᛴ;->ᛷᛴᛷᛱ(Landroid/graphics/text/PositionedGlyphs;)Landroid/graphics/fonts/Font;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0
.end method
