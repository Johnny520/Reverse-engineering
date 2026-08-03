.class public abstract Lio/sentry/android/replay/capture/e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/sentry/android/replay/capture/n;


# static fields
.field public static final synthetic q:[LPm;


# instance fields
.field public final a:Lio/sentry/v2;

.field public final b:Lio/sentry/Z;

.field public final c:Lio/sentry/transport/f;

.field public final d:Ljava/util/concurrent/ScheduledExecutorService;

.field public final e:LcA;

.field public final f:Lio/sentry/android/replay/gestures/c;

.field public final g:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public h:Lio/sentry/android/replay/j;

.field public final i:Lio/sentry/android/replay/capture/c;

.field public final j:Lio/sentry/android/replay/capture/c;

.field public final k:Ljava/util/concurrent/atomic/AtomicLong;

.field public final l:Lio/sentry/android/replay/capture/c;

.field public final m:Lio/sentry/android/replay/capture/c;

.field public final n:Lio/sentry/android/replay/capture/c;

.field public final o:Lio/sentry/android/replay/capture/c;

.field public final p:Ljava/util/concurrent/ConcurrentLinkedDeque;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lys;

    const-string v1, "recorderConfig"

    const-string v2, "getRecorderConfig()Lio/sentry/android/replay/ScreenshotRecorderConfig;"

    invoke-direct {v0, v1, v2}, Lys;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v1, LJv;->a:LKv;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lys;

    const-string v2, "segmentTimestamp"

    const-string v3, "getSegmentTimestamp()Ljava/util/Date;"

    invoke-direct {v1, v2, v3}, Lys;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v2, Lys;

    const-string v3, "screenAtStart"

    const-string v4, "getScreenAtStart()Ljava/lang/String;"

    invoke-direct {v2, v3, v4}, Lys;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v3, Lys;

    const-string v4, "currentReplayId"

    const-string v5, "getCurrentReplayId()Lio/sentry/protocol/SentryId;"

    invoke-direct {v3, v4, v5}, Lys;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v4, Lys;

    const-string v5, "currentSegment"

    const-string v6, "getCurrentSegment()I"

    invoke-direct {v4, v5, v6}, Lys;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v5, Lys;

    const-string v6, "replayType"

    const-string v7, "getReplayType()Lio/sentry/SentryReplayEvent$ReplayType;"

    invoke-direct {v5, v6, v7}, Lys;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v6, 0x6

    new-array v6, v6, [LPm;

    const/4 v7, 0x0

    aput-object v0, v6, v7

    const/4 v0, 0x1

    aput-object v1, v6, v0

    const/4 v0, 0x2

    aput-object v2, v6, v0

    const/4 v0, 0x3

    aput-object v3, v6, v0

    const/4 v0, 0x4

    aput-object v4, v6, v0

    const/4 v0, 0x5

    aput-object v5, v6, v0

    sput-object v6, Lio/sentry/android/replay/capture/e;->q:[LPm;

    return-void
.end method

.method public constructor <init>(Lio/sentry/v2;Lio/sentry/Z;Lio/sentry/transport/f;Ljava/util/concurrent/ScheduledExecutorService;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/android/replay/capture/e;->a:Lio/sentry/v2;

    iput-object p2, p0, Lio/sentry/android/replay/capture/e;->b:Lio/sentry/Z;

    iput-object p3, p0, Lio/sentry/android/replay/capture/e;->c:Lio/sentry/transport/f;

    iput-object p4, p0, Lio/sentry/android/replay/capture/e;->d:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance p1, LcA;

    sget-object p2, Lio/sentry/android/replay/capture/a;->b:Lio/sentry/android/replay/capture/a;

    invoke-direct {p1, p2}, LcA;-><init>(LUi;)V

    iput-object p1, p0, Lio/sentry/android/replay/capture/e;->e:LcA;

    new-instance p1, Lio/sentry/android/replay/gestures/c;

    invoke-direct {p1, p3}, Lio/sentry/android/replay/gestures/c;-><init>(Lio/sentry/transport/f;)V

    iput-object p1, p0, Lio/sentry/android/replay/capture/e;->f:Lio/sentry/android/replay/gestures/c;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Lio/sentry/android/replay/capture/e;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance p1, Lio/sentry/android/replay/capture/c;

    const/4 p2, 0x3

    invoke-direct {p1, p0, p0, p2}, Lio/sentry/android/replay/capture/c;-><init>(Lio/sentry/android/replay/capture/e;Lio/sentry/android/replay/capture/e;I)V

    iput-object p1, p0, Lio/sentry/android/replay/capture/e;->i:Lio/sentry/android/replay/capture/c;

    new-instance p1, Lio/sentry/android/replay/capture/c;

    const/4 p2, 0x4

    invoke-direct {p1, p0, p0, p2}, Lio/sentry/android/replay/capture/c;-><init>(Lio/sentry/android/replay/capture/e;Lio/sentry/android/replay/capture/e;I)V

    iput-object p1, p0, Lio/sentry/android/replay/capture/e;->j:Lio/sentry/android/replay/capture/c;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object p1, p0, Lio/sentry/android/replay/capture/e;->k:Ljava/util/concurrent/atomic/AtomicLong;

    new-instance p1, Lio/sentry/android/replay/capture/c;

    const/4 p2, 0x5

    invoke-direct {p1, p0, p0, p2}, Lio/sentry/android/replay/capture/c;-><init>(Lio/sentry/android/replay/capture/e;Lio/sentry/android/replay/capture/e;I)V

    iput-object p1, p0, Lio/sentry/android/replay/capture/e;->l:Lio/sentry/android/replay/capture/c;

    sget-object p1, Lio/sentry/protocol/t;->b:Lio/sentry/protocol/t;

    new-instance p2, Lio/sentry/android/replay/capture/c;

    invoke-direct {p2, p1, p0, p0}, Lio/sentry/android/replay/capture/c;-><init>(Ljava/lang/Object;Lio/sentry/android/replay/capture/e;Lio/sentry/android/replay/capture/e;)V

    iput-object p2, p0, Lio/sentry/android/replay/capture/e;->m:Lio/sentry/android/replay/capture/c;

    new-instance p1, Lio/sentry/android/replay/capture/c;

    const/4 p2, 0x1

    invoke-direct {p1, p0, p0, p2}, Lio/sentry/android/replay/capture/c;-><init>(Lio/sentry/android/replay/capture/e;Lio/sentry/android/replay/capture/e;I)V

    iput-object p1, p0, Lio/sentry/android/replay/capture/e;->n:Lio/sentry/android/replay/capture/c;

    new-instance p1, Lio/sentry/android/replay/capture/c;

    const/4 p2, 0x2

    invoke-direct {p1, p0, p0, p2}, Lio/sentry/android/replay/capture/c;-><init>(Lio/sentry/android/replay/capture/e;Lio/sentry/android/replay/capture/e;I)V

    iput-object p1, p0, Lio/sentry/android/replay/capture/e;->o:Lio/sentry/android/replay/capture/c;

    new-instance p1, Ljava/util/concurrent/ConcurrentLinkedDeque;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentLinkedDeque;-><init>()V

    iput-object p1, p0, Lio/sentry/android/replay/capture/e;->p:Ljava/util/concurrent/ConcurrentLinkedDeque;

    return-void
.end method

.method public static h(Lio/sentry/android/replay/capture/e;JLjava/util/Date;Lio/sentry/protocol/t;IIIII)Lio/sentry/android/replay/capture/m;
    .locals 20

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/sentry/android/replay/capture/e;->o:Lio/sentry/android/replay/capture/c;

    const/4 v2, 0x5

    sget-object v3, Lio/sentry/android/replay/capture/e;->q:[LPm;

    aget-object v2, v3, v2

    iget-object v1, v1, Lio/sentry/android/replay/capture/c;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v13, v1

    check-cast v13, Lio/sentry/w2;

    iget-object v14, v0, Lio/sentry/android/replay/capture/e;->h:Lio/sentry/android/replay/j;

    iget-object v1, v0, Lio/sentry/android/replay/capture/e;->l:Lio/sentry/android/replay/capture/c;

    const/4 v2, 0x2

    aget-object v2, v3, v2

    iget-object v1, v1, Lio/sentry/android/replay/capture/c;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v17, v1

    check-cast v17, Ljava/lang/String;

    iget-object v1, v0, Lio/sentry/android/replay/capture/e;->p:Ljava/util/concurrent/ConcurrentLinkedDeque;

    iget-object v4, v0, Lio/sentry/android/replay/capture/e;->b:Lio/sentry/Z;

    iget-object v5, v0, Lio/sentry/android/replay/capture/e;->a:Lio/sentry/v2;

    const/16 v18, 0x0

    move-wide/from16 v6, p1

    move-object/from16 v8, p3

    move-object/from16 v9, p4

    move/from16 v10, p5

    move/from16 v11, p6

    move/from16 v12, p7

    move/from16 v15, p8

    move/from16 v16, p9

    move-object/from16 v19, v1

    invoke-static/range {v4 .. v19}, Lio/sentry/android/replay/capture/j;->a(Lio/sentry/Z;Lio/sentry/v2;JLjava/util/Date;Lio/sentry/protocol/t;IIILio/sentry/w2;Lio/sentry/android/replay/j;IILjava/lang/String;Ljava/util/List;Ljava/util/Deque;)Lio/sentry/android/replay/capture/m;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Landroid/view/MotionEvent;)V
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual {v0}, Lio/sentry/android/replay/capture/e;->k()Lio/sentry/android/replay/w;

    move-result-object v2

    if-eqz v2, :cond_f

    iget-object v3, v0, Lio/sentry/android/replay/capture/e;->f:Lio/sentry/android/replay/gestures/c;

    iget-object v4, v3, Lio/sentry/android/replay/gestures/c;->a:Lio/sentry/transport/f;

    iget-object v5, v3, Lio/sentry/android/replay/gestures/c;->b:Ljava/util/LinkedHashMap;

    iget v6, v2, Lio/sentry/android/replay/w;->d:F

    iget v2, v2, Lio/sentry/android/replay/w;->c:F

    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v7

    const/4 v9, -0x1

    const/4 v10, 0x0

    if-eqz v7, :cond_d

    const/4 v12, 0x1

    if-eq v7, v12, :cond_b

    const/4 v12, 0x2

    if-eq v7, v12, :cond_2

    const/4 v3, 0x3

    if-eq v7, v3, :cond_1

    const/4 v3, 0x5

    if-eq v7, v3, :cond_d

    const/4 v3, 0x6

    if-eq v7, v3, :cond_b

    :cond_0
    :goto_0
    const/4 v11, 0x0

    goto/16 :goto_4

    :cond_1
    invoke-virtual {v5}, Ljava/util/LinkedHashMap;->clear()V

    new-instance v3, Lio/sentry/rrweb/g;

    invoke-direct {v3}, Lio/sentry/rrweb/g;-><init>()V

    invoke-interface {v4}, Lio/sentry/transport/f;->b()J

    move-result-wide v4

    iput-wide v4, v3, Lio/sentry/rrweb/b;->b:J

    invoke-virtual {v1}, Landroid/view/MotionEvent;->getX()F

    move-result v4

    mul-float/2addr v4, v2

    iput v4, v3, Lio/sentry/rrweb/g;->f:F

    invoke-virtual {v1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    mul-float/2addr v1, v6

    iput v1, v3, Lio/sentry/rrweb/g;->g:F

    iput v10, v3, Lio/sentry/rrweb/g;->e:I

    iput v10, v3, Lio/sentry/rrweb/g;->i:I

    sget-object v1, Lio/sentry/rrweb/f;->TouchCancel:Lio/sentry/rrweb/f;

    iput-object v1, v3, Lio/sentry/rrweb/g;->d:Lio/sentry/rrweb/f;

    invoke-static {v3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v11

    goto/16 :goto_4

    :cond_2
    invoke-interface {v4}, Lio/sentry/transport/f;->b()J

    move-result-wide v12

    iget-wide v14, v3, Lio/sentry/android/replay/gestures/c;->d:J

    const-wide/16 v10, 0x0

    cmp-long v4, v14, v10

    if-eqz v4, :cond_3

    const/16 v4, 0x32

    move-wide/from16 v16, v10

    int-to-long v10, v4

    add-long/2addr v14, v10

    cmp-long v4, v14, v12

    if-lez v4, :cond_4

    goto :goto_0

    :cond_3
    move-wide/from16 v16, v10

    :cond_4
    iput-wide v12, v3, Lio/sentry/android/replay/gestures/c;->d:J

    invoke-virtual {v5}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_7

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Integer;

    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v11

    invoke-virtual {v1, v11}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v11

    if-ne v11, v9, :cond_5

    goto :goto_1

    :cond_5
    iget-wide v14, v3, Lio/sentry/android/replay/gestures/c;->c:J

    cmp-long v14, v14, v16

    if-nez v14, :cond_6

    iput-wide v12, v3, Lio/sentry/android/replay/gestures/c;->c:J

    :cond_6
    invoke-virtual {v5, v10}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/util/Collection;

    new-instance v14, Lio/sentry/rrweb/h;

    invoke-direct {v14}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v1, v11}, Landroid/view/MotionEvent;->getX(I)F

    move-result v15

    mul-float/2addr v15, v2

    iput v15, v14, Lio/sentry/rrweb/h;->b:F

    invoke-virtual {v1, v11}, Landroid/view/MotionEvent;->getY(I)F

    move-result v11

    mul-float/2addr v11, v6

    iput v11, v14, Lio/sentry/rrweb/h;->c:F

    const/4 v11, 0x0

    iput v11, v14, Lio/sentry/rrweb/h;->a:I

    iget-wide v7, v3, Lio/sentry/android/replay/gestures/c;->c:J

    sub-long v7, v12, v7

    iput-wide v7, v14, Lio/sentry/rrweb/h;->d:J

    invoke-interface {v10, v14}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_7
    iget-wide v1, v3, Lio/sentry/android/replay/gestures/c;->c:J

    sub-long v1, v12, v1

    const-wide/16 v6, 0x1f4

    cmp-long v4, v1, v6

    if-lez v4, :cond_0

    new-instance v4, Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/AbstractMap;->size()I

    move-result v6

    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v5}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_8
    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_a

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/Map$Entry;

    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v8

    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/ArrayList;

    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    move-result v9

    if-nez v9, :cond_8

    new-instance v9, Lio/sentry/rrweb/i;

    invoke-direct {v9}, Lio/sentry/rrweb/i;-><init>()V

    iput-wide v12, v9, Lio/sentry/rrweb/b;->b:J

    new-instance v10, Ljava/util/ArrayList;

    const/16 v11, 0xa

    invoke-static {v7, v11}, Lta;->d0(Ljava/lang/Iterable;I)I

    move-result v14

    invoke-direct {v10, v14}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_3
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_9

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lio/sentry/rrweb/h;

    move-wide/from16 v18, v12

    iget-wide v11, v14, Lio/sentry/rrweb/h;->d:J

    sub-long/2addr v11, v1

    iput-wide v11, v14, Lio/sentry/rrweb/h;->d:J

    invoke-virtual {v10, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-wide/from16 v12, v18

    goto :goto_3

    :cond_9
    move-wide/from16 v18, v12

    iput-object v10, v9, Lio/sentry/rrweb/i;->e:Ljava/util/List;

    iput v8, v9, Lio/sentry/rrweb/i;->d:I

    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->clear()V

    goto :goto_2

    :cond_a
    move-wide/from16 v7, v16

    iput-wide v7, v3, Lio/sentry/android/replay/gestures/c;->c:J

    move-object v11, v4

    goto/16 :goto_4

    :cond_b
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v3

    invoke-virtual {v1, v3}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v3

    invoke-virtual {v1, v3}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v7

    if-ne v7, v9, :cond_c

    goto/16 :goto_0

    :cond_c
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v5, v8}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v5, Lio/sentry/rrweb/g;

    invoke-direct {v5}, Lio/sentry/rrweb/g;-><init>()V

    invoke-interface {v4}, Lio/sentry/transport/f;->b()J

    move-result-wide v8

    iput-wide v8, v5, Lio/sentry/rrweb/b;->b:J

    invoke-virtual {v1, v7}, Landroid/view/MotionEvent;->getX(I)F

    move-result v4

    mul-float/2addr v4, v2

    iput v4, v5, Lio/sentry/rrweb/g;->f:F

    invoke-virtual {v1, v7}, Landroid/view/MotionEvent;->getY(I)F

    move-result v1

    mul-float/2addr v1, v6

    iput v1, v5, Lio/sentry/rrweb/g;->g:F

    const/4 v11, 0x0

    iput v11, v5, Lio/sentry/rrweb/g;->e:I

    iput v3, v5, Lio/sentry/rrweb/g;->i:I

    sget-object v1, Lio/sentry/rrweb/f;->TouchEnd:Lio/sentry/rrweb/f;

    iput-object v1, v5, Lio/sentry/rrweb/g;->d:Lio/sentry/rrweb/f;

    invoke-static {v5}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v11

    goto :goto_4

    :cond_d
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v3

    invoke-virtual {v1, v3}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v3

    invoke-virtual {v1, v3}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v7

    if-ne v7, v9, :cond_e

    goto/16 :goto_0

    :cond_e
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    new-instance v9, Ljava/util/ArrayList;

    const/16 v11, 0xa

    invoke-direct {v9, v11}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v5, v8, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v5, Lio/sentry/rrweb/g;

    invoke-direct {v5}, Lio/sentry/rrweb/g;-><init>()V

    invoke-interface {v4}, Lio/sentry/transport/f;->b()J

    move-result-wide v8

    iput-wide v8, v5, Lio/sentry/rrweb/b;->b:J

    invoke-virtual {v1, v7}, Landroid/view/MotionEvent;->getX(I)F

    move-result v4

    mul-float/2addr v4, v2

    iput v4, v5, Lio/sentry/rrweb/g;->f:F

    invoke-virtual {v1, v7}, Landroid/view/MotionEvent;->getY(I)F

    move-result v1

    mul-float/2addr v1, v6

    iput v1, v5, Lio/sentry/rrweb/g;->g:F

    const/4 v11, 0x0

    iput v11, v5, Lio/sentry/rrweb/g;->e:I

    iput v3, v5, Lio/sentry/rrweb/g;->i:I

    sget-object v1, Lio/sentry/rrweb/f;->TouchStart:Lio/sentry/rrweb/f;

    iput-object v1, v5, Lio/sentry/rrweb/g;->d:Lio/sentry/rrweb/f;

    invoke-static {v5}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v11

    :goto_4
    if-eqz v11, :cond_f

    iget-object v1, v0, Lio/sentry/android/replay/capture/e;->p:Ljava/util/concurrent/ConcurrentLinkedDeque;

    invoke-interface {v1, v11}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z

    :cond_f
    return-void
.end method

.method public f(ILio/sentry/protocol/t;Lio/sentry/w2;)V
    .locals 8

    new-instance v0, Lio/sentry/android/replay/j;

    iget-object v1, p0, Lio/sentry/android/replay/capture/e;->a:Lio/sentry/v2;

    invoke-direct {v0, v1, p2}, Lio/sentry/android/replay/j;-><init>(Lio/sentry/v2;Lio/sentry/protocol/t;)V

    iput-object v0, p0, Lio/sentry/android/replay/capture/e;->h:Lio/sentry/android/replay/j;

    const/4 v0, 0x3

    sget-object v1, Lio/sentry/android/replay/capture/e;->q:[LPm;

    aget-object v0, v1, v0

    iget-object v0, p0, Lio/sentry/android/replay/capture/e;->m:Lio/sentry/android/replay/capture/c;

    iget-object v2, v0, Lio/sentry/android/replay/capture/c;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v2, p2}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2, p2}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const-string v4, "Failed to execute task CaptureStrategy.runInBackground"

    const-string v5, "CaptureStrategy.runInBackground"

    if-nez v3, :cond_1

    new-instance v3, Lio/sentry/android/replay/capture/b;

    iget-object v6, v0, Lio/sentry/android/replay/capture/c;->c:Lio/sentry/android/replay/capture/e;

    const/4 v7, 0x0

    invoke-direct {v3, v2, p2, v6, v7}, Lio/sentry/android/replay/capture/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lio/sentry/android/replay/capture/e;I)V

    iget-object p2, v0, Lio/sentry/android/replay/capture/c;->b:Lio/sentry/android/replay/capture/e;

    iget-object v0, p2, Lio/sentry/android/replay/capture/e;->a:Lio/sentry/v2;

    invoke-virtual {v0}, Lio/sentry/v2;->getThreadChecker()Lio/sentry/util/thread/a;

    move-result-object v2

    invoke-interface {v2}, Lio/sentry/util/thread/a;->c()Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object p2, p2, Lio/sentry/android/replay/capture/e;->e:LcA;

    invoke-virtual {p2}, LcA;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v2, Lio/sentry/H0;

    const/4 v6, 0x1

    invoke-direct {v2, v6, v3}, Lio/sentry/H0;-><init>(ILjava/lang/Object;)V

    invoke-static {p2, v0, v5, v2}, Lio/sentry/config/a;->H(Ljava/util/concurrent/ExecutorService;Lio/sentry/v2;Ljava/lang/String;Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    :try_start_0
    invoke-virtual {v3}, Lio/sentry/android/replay/capture/b;->a()Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p2

    invoke-virtual {v0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    sget-object v2, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    invoke-interface {v0, v2, v4, p2}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    invoke-virtual {p0, p1}, Lio/sentry/android/replay/capture/e;->l(I)V

    if-nez p3, :cond_3

    instance-of p1, p0, Lio/sentry/android/replay/capture/q;

    if-eqz p1, :cond_2

    sget-object p3, Lio/sentry/w2;->SESSION:Lio/sentry/w2;

    goto :goto_1

    :cond_2
    sget-object p3, Lio/sentry/w2;->BUFFER:Lio/sentry/w2;

    :cond_3
    :goto_1
    const/4 p1, 0x5

    aget-object p1, v1, p1

    iget-object p1, p0, Lio/sentry/android/replay/capture/e;->o:Lio/sentry/android/replay/capture/c;

    iget-object p2, p1, Lio/sentry/android/replay/capture/c;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p2, p3}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2, p3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    new-instance v0, Lio/sentry/android/replay/capture/b;

    iget-object v1, p1, Lio/sentry/android/replay/capture/c;->c:Lio/sentry/android/replay/capture/e;

    const/4 v2, 0x1

    invoke-direct {v0, p2, p3, v1, v2}, Lio/sentry/android/replay/capture/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lio/sentry/android/replay/capture/e;I)V

    iget-object p1, p1, Lio/sentry/android/replay/capture/c;->b:Lio/sentry/android/replay/capture/e;

    iget-object p2, p1, Lio/sentry/android/replay/capture/e;->a:Lio/sentry/v2;

    invoke-virtual {p2}, Lio/sentry/v2;->getThreadChecker()Lio/sentry/util/thread/a;

    move-result-object p3

    invoke-interface {p3}, Lio/sentry/util/thread/a;->c()Z

    move-result p3

    if-eqz p3, :cond_4

    iget-object p1, p1, Lio/sentry/android/replay/capture/e;->e:LcA;

    invoke-virtual {p1}, LcA;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/concurrent/ScheduledExecutorService;

    new-instance p3, Lio/sentry/H0;

    const/4 v1, 0x3

    invoke-direct {p3, v1, v0}, Lio/sentry/H0;-><init>(ILjava/lang/Object;)V

    invoke-static {p1, p2, v5, p3}, Lio/sentry/config/a;->H(Ljava/util/concurrent/ExecutorService;Lio/sentry/v2;Ljava/lang/String;Ljava/lang/Runnable;)V

    goto :goto_2

    :cond_4
    :try_start_1
    invoke-virtual {v0}, Lio/sentry/android/replay/capture/b;->a()Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p1

    invoke-virtual {p2}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p2

    sget-object p3, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    invoke-interface {p2, p3, v4, p1}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5
    :goto_2
    invoke-static {}, Lio/sentry/config/a;->m()Ljava/util/Date;

    move-result-object p1

    invoke-virtual {p0, p1}, Lio/sentry/android/replay/capture/e;->m(Ljava/util/Date;)V

    iget-object p1, p0, Lio/sentry/android/replay/capture/e;->c:Lio/sentry/transport/f;

    invoke-interface {p1}, Lio/sentry/transport/f;->b()J

    move-result-wide p1

    iget-object p3, p0, Lio/sentry/android/replay/capture/e;->k:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {p3, p1, p2}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    return-void
.end method

.method public final i()Lio/sentry/protocol/t;
    .locals 2

    sget-object v0, Lio/sentry/android/replay/capture/e;->q:[LPm;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    iget-object v0, p0, Lio/sentry/android/replay/capture/e;->m:Lio/sentry/android/replay/capture/c;

    iget-object v0, v0, Lio/sentry/android/replay/capture/c;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/protocol/t;

    return-object v0
.end method

.method public final j()I
    .locals 2

    sget-object v0, Lio/sentry/android/replay/capture/e;->q:[LPm;

    const/4 v1, 0x4

    aget-object v0, v0, v1

    iget-object v0, p0, Lio/sentry/android/replay/capture/e;->n:Lio/sentry/android/replay/capture/c;

    iget-object v0, v0, Lio/sentry/android/replay/capture/c;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    return v0
.end method

.method public final k()Lio/sentry/android/replay/w;
    .locals 2

    sget-object v0, Lio/sentry/android/replay/capture/e;->q:[LPm;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iget-object v0, p0, Lio/sentry/android/replay/capture/e;->i:Lio/sentry/android/replay/capture/c;

    iget-object v0, v0, Lio/sentry/android/replay/capture/c;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/android/replay/w;

    return-object v0
.end method

.method public final l(I)V
    .locals 5

    sget-object v0, Lio/sentry/android/replay/capture/e;->q:[LPm;

    const/4 v1, 0x4

    aget-object v0, v0, v1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iget-object v0, p0, Lio/sentry/android/replay/capture/e;->n:Lio/sentry/android/replay/capture/c;

    iget-object v1, v0, Lio/sentry/android/replay/capture/c;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1, p1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, p1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    new-instance v2, Lio/sentry/android/replay/capture/d;

    iget-object v3, v0, Lio/sentry/android/replay/capture/c;->c:Lio/sentry/android/replay/capture/e;

    const/4 v4, 0x0

    invoke-direct {v2, v1, p1, v3, v4}, Lio/sentry/android/replay/capture/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lio/sentry/android/replay/capture/e;I)V

    iget-object p1, v0, Lio/sentry/android/replay/capture/c;->b:Lio/sentry/android/replay/capture/e;

    iget-object v0, p1, Lio/sentry/android/replay/capture/e;->a:Lio/sentry/v2;

    invoke-virtual {v0}, Lio/sentry/v2;->getThreadChecker()Lio/sentry/util/thread/a;

    move-result-object v1

    invoke-interface {v1}, Lio/sentry/util/thread/a;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object p1, p1, Lio/sentry/android/replay/capture/e;->e:LcA;

    invoke-virtual {p1}, LcA;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v1, Lio/sentry/H0;

    const/4 v3, 0x2

    invoke-direct {v1, v3, v2}, Lio/sentry/H0;-><init>(ILjava/lang/Object;)V

    const-string v2, "CaptureStrategy.runInBackground"

    invoke-static {p1, v0, v2, v1}, Lio/sentry/config/a;->H(Ljava/util/concurrent/ExecutorService;Lio/sentry/v2;Ljava/lang/String;Ljava/lang/Runnable;)V

    return-void

    :cond_0
    :try_start_0
    invoke-virtual {v2}, Lio/sentry/android/replay/capture/d;->a()Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    sget-object v1, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v2, "Failed to execute task CaptureStrategy.runInBackground"

    invoke-interface {v0, v1, v2, p1}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    return-void
.end method

.method public final m(Ljava/util/Date;)V
    .locals 5

    sget-object v0, Lio/sentry/android/replay/capture/e;->q:[LPm;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    iget-object v0, p0, Lio/sentry/android/replay/capture/e;->j:Lio/sentry/android/replay/capture/c;

    iget-object v1, v0, Lio/sentry/android/replay/capture/c;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1, p1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, p1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    new-instance v2, Lio/sentry/android/replay/capture/b;

    iget-object v3, v0, Lio/sentry/android/replay/capture/c;->c:Lio/sentry/android/replay/capture/e;

    const/4 v4, 0x2

    invoke-direct {v2, v1, p1, v3, v4}, Lio/sentry/android/replay/capture/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lio/sentry/android/replay/capture/e;I)V

    iget-object p1, v0, Lio/sentry/android/replay/capture/c;->b:Lio/sentry/android/replay/capture/e;

    iget-object v0, p1, Lio/sentry/android/replay/capture/e;->a:Lio/sentry/v2;

    invoke-virtual {v0}, Lio/sentry/v2;->getThreadChecker()Lio/sentry/util/thread/a;

    move-result-object v1

    invoke-interface {v1}, Lio/sentry/util/thread/a;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object p1, p1, Lio/sentry/android/replay/capture/e;->e:LcA;

    invoke-virtual {p1}, LcA;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v1, Lio/sentry/H0;

    const/4 v3, 0x5

    invoke-direct {v1, v3, v2}, Lio/sentry/H0;-><init>(ILjava/lang/Object;)V

    const-string v2, "CaptureStrategy.runInBackground"

    invoke-static {p1, v0, v2, v1}, Lio/sentry/config/a;->H(Ljava/util/concurrent/ExecutorService;Lio/sentry/v2;Ljava/lang/String;Ljava/lang/Runnable;)V

    return-void

    :cond_0
    :try_start_0
    invoke-virtual {v2}, Lio/sentry/android/replay/capture/b;->a()Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    sget-object v1, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v2, "Failed to execute task CaptureStrategy.runInBackground"

    invoke-interface {v0, v1, v2, p1}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    return-void
.end method
