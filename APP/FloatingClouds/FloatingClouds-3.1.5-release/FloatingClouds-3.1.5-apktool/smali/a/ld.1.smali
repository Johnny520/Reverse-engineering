.class public final La/ld;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/ld$a;,
        La/ld$b;
    }
.end annotation


# static fields
.field public static final a:La/ld;

.field public static final b:Ljava/util/LinkedHashMap;

.field public static volatile c:Z

.field public static final d:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, La/ld;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, La/ld;->a:La/ld;

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    sput-object v1, La/ld;->b:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, La/ld;->a()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    sput-object v0, La/ld;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method

.method public static b(Ljava/lang/ClassLoader;Ljava/lang/String;)Z
    .locals 6

    const-class v0, Ljava/lang/Object;

    :try_start_0
    invoke-static {p0, p1}, La/A1;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p0

    :goto_0
    const/4 p1, 0x0

    if-eqz p0, :cond_4

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    invoke-virtual {p0}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    move-result-object v1

    const-string v2, "getInterfaces(...)"

    invoke-static {v1, v2}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v2, v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    const/4 v3, 0x1

    const-string v4, "androidx.recyclerview.widget.RecyclerView$Adapter"

    if-ge p1, v2, :cond_2

    :try_start_1
    aget-object v5, v1, p1

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    :cond_0
    :goto_2
    move p1, v3

    goto :goto_3

    :cond_1
    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    const-string v1, "com.tencent.mm.view.recyclerview.WxRecyclerAdapter"

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object p0

    goto :goto_0

    :cond_4
    :goto_3
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_4

    :catchall_0
    move-exception p0

    invoke-static {p0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object p0

    :goto_4
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    instance-of v0, p0, La/wd$a;

    if-eqz v0, :cond_5

    move-object p0, p1

    :cond_5
    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final declared-synchronized a()V
    .locals 4

    const-string v0, "init() called registered="

    monitor-enter p0

    :try_start_0
    const-string v1, "ResolverRegistry"

    sget-boolean v2, La/ld;->c:Z

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v1, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    sget-boolean v0, La/ld;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    invoke-virtual {p0}, La/ld;->e()V

    const/4 v0, 0x1

    sput-boolean v0, La/ld;->c:Z

    const-string v0, "ResolverRegistry"

    const-string v1, "init() finished"

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method public final declared-synchronized c(Ljava/lang/String;)La/ld$a;
    .locals 1

    monitor-enter p0

    :try_start_0
    sget-object v0, La/ld;->b:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, La/ld$a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized d(La/ld$a;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    sget-object v0, La/ld;->b:Ljava/util/LinkedHashMap;

    iget-object v1, p1, La/ld$a;->a:Ljava/lang/String;

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final e()V
    .locals 44

    move-object/from16 v0, p0

    const/16 v4, 0x1a

    const/16 v5, 0x9

    const/16 v6, 0x18

    const/4 v7, 0x7

    const/16 v8, 0xc

    const/16 v9, 0x19

    const/16 v10, 0x17

    const/4 v15, 0x4

    const/16 v16, 0x5

    const/16 v11, 0x8

    const/16 v17, 0x3

    const/4 v12, 0x6

    const/16 v18, 0x2

    const/4 v13, 0x0

    const/16 v19, 0x1

    const-string v14, "ResolverRegistry"

    const-string v1, "registerBuiltins() start"

    filled-new-array {v14, v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, La/x1;->b([Ljava/lang/Object;)V

    new-instance v21, La/ld$a;

    sget-object v24, La/ld$b;->a:La/ld$b;

    new-instance v1, La/O8;

    invoke-direct {v1, v10}, La/O8;-><init>(I)V

    new-instance v2, La/O8;

    invoke-direct {v2, v9}, La/O8;-><init>(I)V

    const/16 v26, 0x1

    const/16 v28, 0x0

    const-string v22, "F017_msg_storage"

    move-object/from16 v23, v24

    const-string v24, "msg_storage_v1"

    const/16 v25, 0x0

    const/16 v30, 0x40

    move-object/from16 v27, v1

    move-object/from16 v29, v2

    invoke-direct/range {v21 .. v30}, La/ld$a;-><init>(Ljava/lang/String;La/ld$b;Ljava/lang/String;IZLa/D7;La/D7;La/D7;I)V

    move-object/from16 v1, v21

    move-object/from16 v24, v23

    invoke-virtual {v0, v1}, La/ld;->d(La/ld$a;)V

    new-instance v22, La/ld$a;

    new-instance v1, La/id;

    invoke-direct {v1, v12}, La/id;-><init>(I)V

    new-instance v2, La/id;

    const/16 v3, 0xe

    invoke-direct {v2, v3}, La/id;-><init>(I)V

    const/16 v27, 0x0

    const/16 v30, 0x0

    const-string v23, "F007_voip_mgr"

    const-string v25, ""

    const/16 v26, 0x0

    const/16 v31, 0x80

    move-object/from16 v28, v1

    move-object/from16 v29, v2

    invoke-direct/range {v22 .. v31}, La/ld$a;-><init>(Ljava/lang/String;La/ld$b;Ljava/lang/String;IZLa/D7;La/D7;La/D7;I)V

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, La/ld;->d(La/ld$a;)V

    new-instance v1, La/g3;

    const-string v2, "mm.storage.f9"

    const-string v3, "F017_msg_info_class"

    invoke-direct {v1, v3, v2, v13, v8}, La/g3;-><init>(Ljava/lang/String;Ljava/lang/String;II)V

    new-instance v22, La/ld$a;

    new-instance v2, La/id;

    move/from16 v32, v13

    const/16 v13, 0x16

    invoke-direct {v2, v13}, La/id;-><init>(I)V

    new-instance v13, La/jd;

    invoke-direct {v13, v1, v7}, La/jd;-><init>(La/g3;I)V

    const/16 v27, 0x0

    const/16 v30, 0x0

    const-string v23, "F017_msg_info"

    const/16 v26, 0x0

    const/16 v31, 0x80

    move-object/from16 v28, v2

    move-object/from16 v25, v3

    move-object/from16 v29, v13

    invoke-direct/range {v22 .. v31}, La/ld$a;-><init>(Ljava/lang/String;La/ld$b;Ljava/lang/String;IZLa/D7;La/D7;La/D7;I)V

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, La/ld;->d(La/ld$a;)V

    new-instance v1, La/g3;

    const-string v2, "SelectContactMvvmList"

    const-string v3, "F021_select_contact_mvvm_list_rule"

    const/16 v13, 0x50

    invoke-direct {v1, v3, v2, v13, v8}, La/g3;-><init>(Ljava/lang/String;Ljava/lang/String;II)V

    sget-object v2, La/Cd;->a:La/Cd;

    invoke-virtual {v2, v1}, La/Cd;->i(La/md;)V

    new-instance v22, La/ld$a;

    new-instance v7, La/id;

    invoke-direct {v7, v10}, La/id;-><init>(I)V

    new-instance v10, La/jd;

    invoke-direct {v10, v1, v11}, La/jd;-><init>(La/g3;I)V

    const/16 v27, 0x0

    const/16 v30, 0x0

    const-string v23, "F021_select_contact_mvvm_list"

    const/16 v26, 0x50

    const/16 v31, 0x80

    move-object/from16 v25, v3

    move-object/from16 v28, v7

    move-object/from16 v29, v10

    invoke-direct/range {v22 .. v31}, La/ld$a;-><init>(Ljava/lang/String;La/ld$b;Ljava/lang/String;IZLa/D7;La/D7;La/D7;I)V

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, La/ld;->d(La/ld$a;)V

    new-instance v1, La/g3;

    const-string v3, "n3.t0"

    const-string v7, "F021_recent_forward_adapter"

    invoke-direct {v1, v7, v3, v13, v8}, La/g3;-><init>(Ljava/lang/String;Ljava/lang/String;II)V

    invoke-virtual {v2, v1}, La/Cd;->i(La/md;)V

    new-instance v22, La/ld$a;

    new-instance v2, La/id;

    invoke-direct {v2, v6}, La/id;-><init>(I)V

    new-instance v3, La/jd;

    invoke-direct {v3, v1, v5}, La/jd;-><init>(La/g3;I)V

    const/16 v27, 0x0

    const/16 v30, 0x0

    const-string v23, "F021_recent_forward_adapter"

    const/16 v26, 0x50

    const/16 v31, 0x80

    move-object/from16 v28, v2

    move-object/from16 v29, v3

    move-object/from16 v25, v7

    invoke-direct/range {v22 .. v31}, La/ld$a;-><init>(Ljava/lang/String;La/ld$b;Ljava/lang/String;IZLa/D7;La/D7;La/D7;I)V

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, La/ld;->d(La/ld$a;)V

    new-instance v22, La/ld$a;

    new-instance v1, La/id;

    invoke-direct {v1, v15}, La/id;-><init>(I)V

    new-instance v2, La/id;

    const/16 v3, 0xb

    invoke-direct {v2, v3}, La/id;-><init>(I)V

    const/16 v27, 0x0

    const/16 v30, 0x0

    const-string v23, "F013_timeline_adapter"

    const-string v25, ""

    const/16 v26, 0x0

    const/16 v31, 0x80

    move-object/from16 v28, v1

    move-object/from16 v29, v2

    invoke-direct/range {v22 .. v31}, La/ld$a;-><init>(Ljava/lang/String;La/ld$b;Ljava/lang/String;IZLa/D7;La/D7;La/D7;I)V

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, La/ld;->d(La/ld$a;)V

    new-instance v1, La/g3;

    const-string v2, "wx8076_locator_helper"

    const-string v3, "hm0.j1"

    invoke-direct {v1, v2, v3, v13, v8}, La/g3;-><init>(Ljava/lang/String;Ljava/lang/String;II)V

    new-instance v2, La/g3;

    const-string v3, "wx8076_msg_foundation_h2"

    const-string v7, "e01.f"

    invoke-direct {v2, v3, v7, v13, v8}, La/g3;-><init>(Ljava/lang/String;Ljava/lang/String;II)V

    new-instance v3, La/g3;

    const-string v7, "wx8076_conv_storage_iface"

    const-string v10, "com.tencent.mm.storage.k8"

    invoke-direct {v3, v7, v10, v13, v8}, La/g3;-><init>(Ljava/lang/String;Ljava/lang/String;II)V

    new-instance v7, La/g3;

    const-string v10, "wx8076_conv_storage_class"

    move/from16 v33, v15

    const-string v15, "com.tencent.mm.storage.l4"

    invoke-direct {v7, v10, v15, v13, v8}, La/g3;-><init>(Ljava/lang/String;Ljava/lang/String;II)V

    new-instance v25, La/qb;

    const-string v10, "Ljava/lang/String;"

    invoke-static {v10}, La/w1;->K(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v28

    const/16 v31, 0x0

    const-string v26, "wx8076_conv_getter"

    const-string v27, "k4"

    const-string v29, ""

    const-string v30, "wx8076_conv_storage_class"

    invoke-direct/range {v25 .. v31}, La/qb;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Z)V

    new-instance v34, La/qb;

    const-string v15, "[Ljava/lang/String;"

    filled-new-array {v15, v10}, [Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, La/o3;->d0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v37

    const/16 v40, 0x0

    const-string v35, "wx8076_native_hide"

    const-string v36, "void"

    const-string v38, ""

    const-string v39, "wx8076_conv_storage_class"

    invoke-direct/range {v34 .. v40}, La/qb;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Z)V

    new-array v10, v12, [La/md;

    aput-object v1, v10, v32

    aput-object v2, v10, v19

    aput-object v3, v10, v18

    aput-object v7, v10, v17

    aput-object v25, v10, v33

    aput-object v34, v10, v16

    invoke-static {v10}, La/o3;->d0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La/md;

    sget-object v3, La/Cd;->a:La/Cd;

    invoke-virtual {v3, v2}, La/Cd;->i(La/md;)V

    goto :goto_0

    :cond_0
    new-instance v22, La/ld$a;

    new-instance v1, La/id;

    const/16 v2, 0x13

    invoke-direct {v1, v2}, La/id;-><init>(I)V

    new-instance v2, La/id;

    invoke-direct {v2, v9}, La/id;-><init>(I)V

    const/16 v27, 0x1

    const/16 v29, 0x0

    const-string v23, "F010_conv_storage_pair"

    const-string v25, "wx8076_conv_storage_iface"

    const/16 v26, 0x50

    const/16 v31, 0x40

    move-object/from16 v28, v1

    move-object/from16 v30, v2

    invoke-direct/range {v22 .. v31}, La/ld$a;-><init>(Ljava/lang/String;La/ld$b;Ljava/lang/String;IZLa/D7;La/D7;La/D7;I)V

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, La/ld;->d(La/ld$a;)V

    new-instance v22, La/ld$a;

    new-instance v1, La/id;

    invoke-direct {v1, v4}, La/id;-><init>(I)V

    new-instance v2, La/id;

    const/16 v3, 0x1b

    invoke-direct {v2, v3}, La/id;-><init>(I)V

    const/16 v27, 0x1

    const/16 v29, 0x0

    const-string v23, "F004_contact_add_mask"

    const-string v25, "contact_add_mask_v1"

    const/16 v26, 0x0

    const/16 v31, 0x40

    move-object/from16 v28, v1

    move-object/from16 v30, v2

    invoke-direct/range {v22 .. v31}, La/ld$a;-><init>(Ljava/lang/String;La/ld$b;Ljava/lang/String;IZLa/D7;La/D7;La/D7;I)V

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, La/ld;->d(La/ld$a;)V

    new-instance v34, La/ld$a;

    sget-object v36, La/ld$b;->c:La/ld$b;

    new-instance v1, La/id;

    const/16 v2, 0x1c

    invoke-direct {v1, v2}, La/id;-><init>(I)V

    const/16 v40, 0x0

    const/16 v41, 0x0

    const-string v35, "F004_contact_list_fields"

    const-string v37, "contact_list_fields_v1"

    const/16 v38, 0x0

    const/16 v39, 0x1

    const/16 v43, 0x60

    move-object/from16 v42, v1

    invoke-direct/range {v34 .. v43}, La/ld$a;-><init>(Ljava/lang/String;La/ld$b;Ljava/lang/String;IZLa/D7;La/D7;La/D7;I)V

    move-object/from16 v1, v34

    invoke-virtual {v0, v1}, La/ld;->d(La/ld$a;)V

    new-instance v22, La/ld$a;

    new-instance v1, La/id;

    const/16 v2, 0x1d

    invoke-direct {v1, v2}, La/id;-><init>(I)V

    new-instance v2, La/kd;

    move/from16 v3, v32

    invoke-direct {v2, v3}, La/kd;-><init>(I)V

    const/16 v27, 0x1

    const/16 v29, 0x0

    const-string v23, "sns_info_model"

    const-string v25, "sns_info_model"

    const/16 v26, 0x0

    const/16 v31, 0x40

    move-object/from16 v28, v1

    move-object/from16 v30, v2

    invoke-direct/range {v22 .. v31}, La/ld$a;-><init>(Ljava/lang/String;La/ld$b;Ljava/lang/String;IZLa/D7;La/D7;La/D7;I)V

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, La/ld;->d(La/ld$a;)V

    new-instance v22, La/ld$a;

    new-instance v1, La/O8;

    invoke-direct {v1, v6}, La/O8;-><init>(I)V

    new-instance v2, La/O8;

    invoke-direct {v2, v4}, La/O8;-><init>(I)V

    const/16 v27, 0x1

    const/16 v29, 0x0

    const-string v23, "notification_precheck"

    const-string v25, "notification_precheck"

    const/16 v26, 0x0

    const/16 v31, 0x40

    move-object/from16 v28, v1

    move-object/from16 v30, v2

    invoke-direct/range {v22 .. v31}, La/ld$a;-><init>(Ljava/lang/String;La/ld$b;Ljava/lang/String;IZLa/D7;La/D7;La/D7;I)V

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, La/ld;->d(La/ld$a;)V

    new-instance v22, La/ld$a;

    new-instance v1, La/O8;

    const/16 v3, 0x1b

    invoke-direct {v1, v3}, La/O8;-><init>(I)V

    new-instance v2, La/O8;

    const/16 v3, 0x1c

    invoke-direct {v2, v3}, La/O8;-><init>(I)V

    const/16 v27, 0x1

    const/16 v29, 0x0

    const-string v23, "conv_list_classes"

    const-string v25, "conv_mvvm_list_v3"

    const/16 v26, 0x0

    const/16 v31, 0x40

    move-object/from16 v28, v1

    move-object/from16 v30, v2

    invoke-direct/range {v22 .. v31}, La/ld$a;-><init>(Ljava/lang/String;La/ld$b;Ljava/lang/String;IZLa/D7;La/D7;La/D7;I)V

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, La/ld;->d(La/ld$a;)V

    new-instance v22, La/ld$a;

    new-instance v1, La/O8;

    const/16 v2, 0x1d

    invoke-direct {v1, v2}, La/O8;-><init>(I)V

    new-instance v2, La/id;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, La/id;-><init>(I)V

    const/16 v27, 0x1

    const/16 v29, 0x0

    const-string v23, "sns_album_classes"

    const-string v25, "sns_album"

    const/16 v26, 0x0

    const/16 v31, 0x40

    move-object/from16 v28, v1

    move-object/from16 v30, v2

    invoke-direct/range {v22 .. v31}, La/ld$a;-><init>(Ljava/lang/String;La/ld$b;Ljava/lang/String;IZLa/D7;La/D7;La/D7;I)V

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, La/ld;->d(La/ld$a;)V

    new-instance v22, La/ld$a;

    new-instance v1, La/id;

    move/from16 v2, v19

    invoke-direct {v1, v2}, La/id;-><init>(I)V

    new-instance v2, La/id;

    move/from16 v3, v18

    invoke-direct {v2, v3}, La/id;-><init>(I)V

    const/16 v27, 0x1

    const/16 v29, 0x0

    const-string v23, "forward_data_item"

    const-string v25, "forward_data_item"

    const/16 v26, 0x0

    const/16 v31, 0x40

    move-object/from16 v28, v1

    move-object/from16 v30, v2

    invoke-direct/range {v22 .. v31}, La/ld$a;-><init>(Ljava/lang/String;La/ld$b;Ljava/lang/String;IZLa/D7;La/D7;La/D7;I)V

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, La/ld;->d(La/ld$a;)V

    new-instance v1, La/g3;

    const-string v2, "m3.t0"

    const-string v3, "F004_contact_adapter_locator"

    const/4 v4, 0x0

    invoke-direct {v1, v3, v2, v4, v8}, La/g3;-><init>(Ljava/lang/String;Ljava/lang/String;II)V

    sget-object v2, La/Cd;->a:La/Cd;

    invoke-virtual {v2, v1}, La/Cd;->i(La/md;)V

    new-instance v22, La/ld$a;

    new-instance v6, La/id;

    move/from16 v7, v17

    invoke-direct {v6, v7}, La/id;-><init>(I)V

    new-instance v7, La/jd;

    invoke-direct {v7, v1, v4}, La/jd;-><init>(La/g3;I)V

    const/16 v27, 0x0

    const/16 v30, 0x0

    const-string v23, "F004_contact_adapter_locator"

    const/16 v26, 0x0

    const/16 v31, 0x80

    move-object/from16 v25, v3

    move-object/from16 v28, v6

    move-object/from16 v29, v7

    invoke-direct/range {v22 .. v31}, La/ld$a;-><init>(Ljava/lang/String;La/ld$b;Ljava/lang/String;IZLa/D7;La/D7;La/D7;I)V

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, La/ld;->d(La/ld$a;)V

    new-instance v1, La/g3;

    const-string v3, "mm.storage.g4"

    const-string v4, "F005_label_storage_g4"

    invoke-direct {v1, v4, v3, v13, v8}, La/g3;-><init>(Ljava/lang/String;Ljava/lang/String;II)V

    invoke-virtual {v2, v1}, La/Cd;->i(La/md;)V

    new-instance v22, La/ld$a;

    new-instance v3, La/id;

    move/from16 v6, v16

    invoke-direct {v3, v6}, La/id;-><init>(I)V

    new-instance v6, La/jd;

    const/4 v7, 0x1

    invoke-direct {v6, v1, v7}, La/jd;-><init>(La/g3;I)V

    const/16 v27, 0x0

    const/16 v30, 0x0

    const-string v23, "F005_hide_contact_label"

    const/16 v26, 0x50

    const/16 v31, 0x80

    move-object/from16 v28, v3

    move-object/from16 v25, v4

    move-object/from16 v29, v6

    invoke-direct/range {v22 .. v31}, La/ld$a;-><init>(Ljava/lang/String;La/ld$b;Ljava/lang/String;IZLa/D7;La/D7;La/D7;I)V

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, La/ld;->d(La/ld$a;)V

    new-instance v22, La/ld$a;

    new-instance v1, La/id;

    const/4 v3, 0x7

    invoke-direct {v1, v3}, La/id;-><init>(I)V

    new-instance v3, La/id;

    invoke-direct {v3, v11}, La/id;-><init>(I)V

    const/16 v27, 0x0

    const/16 v30, 0x0

    const-string v23, "F006_hide_sns_entry"

    const-string v25, ""

    const/16 v26, 0x0

    const/16 v31, 0x80

    move-object/from16 v28, v1

    move-object/from16 v29, v3

    invoke-direct/range {v22 .. v31}, La/ld$a;-><init>(Ljava/lang/String;La/ld$b;Ljava/lang/String;IZLa/D7;La/D7;La/D7;I)V

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, La/ld;->d(La/ld$a;)V

    new-instance v1, La/g3;

    const-string v3, "FindMoreFriendsUI"

    const-string v4, "F006_find_more_friends_ui"

    invoke-direct {v1, v4, v3, v13, v8}, La/g3;-><init>(Ljava/lang/String;Ljava/lang/String;II)V

    new-instance v25, La/qb;

    sget-object v28, La/Y5;->a:La/Y5;

    const/16 v31, 0x0

    const-string v37, "F006_entry_control_method"

    const-string v27, "void"

    const-string v29, "C1"

    const-string v30, "F006_find_more_friends_ui"

    move-object/from16 v26, v37

    invoke-direct/range {v25 .. v31}, La/qb;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v3, v25

    invoke-virtual {v2, v1}, La/Cd;->i(La/md;)V

    invoke-virtual {v2, v3}, La/Cd;->i(La/md;)V

    new-instance v22, La/ld$a;

    new-instance v6, La/id;

    invoke-direct {v6, v5}, La/id;-><init>(I)V

    new-instance v5, La/jd;

    const/4 v7, 0x2

    invoke-direct {v5, v1, v7}, La/jd;-><init>(La/g3;I)V

    const/16 v27, 0x1

    const/16 v30, 0x0

    const-string v23, "F006_find_more_friends_ui"

    const/16 v26, 0x50

    const/16 v31, 0x80

    move-object/from16 v25, v4

    move-object/from16 v29, v5

    move-object/from16 v28, v6

    invoke-direct/range {v22 .. v31}, La/ld$a;-><init>(Ljava/lang/String;La/ld$b;Ljava/lang/String;IZLa/D7;La/D7;La/D7;I)V

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, La/ld;->d(La/ld$a;)V

    new-instance v34, La/ld$a;

    sget-object v36, La/ld$b;->b:La/ld$b;

    new-instance v1, La/id;

    const/16 v4, 0xa

    invoke-direct {v1, v4}, La/id;-><init>(I)V

    new-instance v4, La/t;

    invoke-direct {v4, v11, v3}, La/t;-><init>(ILjava/lang/Object;)V

    const/16 v39, 0x1

    const/16 v42, 0x0

    const-string v35, "F006_entry_control_method"

    const/16 v38, 0x50

    const/16 v43, 0x80

    move-object/from16 v40, v1

    move-object/from16 v41, v4

    invoke-direct/range {v34 .. v43}, La/ld$a;-><init>(Ljava/lang/String;La/ld$b;Ljava/lang/String;IZLa/D7;La/D7;La/D7;I)V

    move-object/from16 v1, v34

    invoke-virtual {v0, v1}, La/ld;->d(La/ld$a;)V

    new-instance v1, La/g3;

    const-string v3, "plugin.fts.ui.f0"

    const-string v4, "F014_fts_adapter"

    invoke-direct {v1, v4, v3, v13, v8}, La/g3;-><init>(Ljava/lang/String;Ljava/lang/String;II)V

    invoke-virtual {v2, v1}, La/Cd;->i(La/md;)V

    new-instance v22, La/ld$a;

    new-instance v3, La/id;

    invoke-direct {v3, v8}, La/id;-><init>(I)V

    new-instance v5, La/jd;

    const/4 v7, 0x3

    invoke-direct {v5, v1, v7}, La/jd;-><init>(La/g3;I)V

    const/16 v27, 0x1

    const/16 v30, 0x0

    const-string v23, "F014_fts_adapter"

    const/16 v26, 0x50

    const/16 v31, 0x80

    move-object/from16 v28, v3

    move-object/from16 v25, v4

    move-object/from16 v29, v5

    invoke-direct/range {v22 .. v31}, La/ld$a;-><init>(Ljava/lang/String;La/ld$b;Ljava/lang/String;IZLa/D7;La/D7;La/D7;I)V

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, La/ld;->d(La/ld$a;)V

    new-instance v1, La/g3;

    const-string v3, "CleanNewUI"

    const-string v4, "F019_clean_new_ui"

    invoke-direct {v1, v4, v3, v13, v8}, La/g3;-><init>(Ljava/lang/String;Ljava/lang/String;II)V

    invoke-virtual {v2, v1}, La/Cd;->i(La/md;)V

    new-instance v22, La/ld$a;

    new-instance v3, La/id;

    const/16 v5, 0xd

    invoke-direct {v3, v5}, La/id;-><init>(I)V

    new-instance v5, La/jd;

    move/from16 v6, v33

    invoke-direct {v5, v1, v6}, La/jd;-><init>(La/g3;I)V

    const/16 v27, 0x1

    const/16 v30, 0x0

    const-string v23, "F019_clean_new_ui"

    const/16 v26, 0x50

    const/16 v31, 0x80

    move-object/from16 v28, v3

    move-object/from16 v25, v4

    move-object/from16 v29, v5

    invoke-direct/range {v22 .. v31}, La/ld$a;-><init>(Ljava/lang/String;La/ld$b;Ljava/lang/String;IZLa/D7;La/D7;La/D7;I)V

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, La/ld;->d(La/ld$a;)V

    new-instance v17, La/qb;

    const-string v1, "J"

    invoke-static {v1}, La/w1;->K(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v20

    const/16 v23, 0x0

    const-string v18, "F019_update_msg_root"

    const-string v19, "void"

    const-string v21, ""

    const-string v22, "F019_clean_new_ui"

    invoke-direct/range {v17 .. v23}, La/qb;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v3, v17

    new-instance v17, La/qb;

    filled-new-array {v1, v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, La/o3;->d0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v20

    const/16 v23, 0x0

    const-string v18, "F020_update_cache_root"

    const-string v19, "void"

    const-string v21, ""

    const-string v22, "F019_clean_new_ui"

    invoke-direct/range {v17 .. v23}, La/qb;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v1, v17

    invoke-virtual {v2, v3}, La/Cd;->i(La/md;)V

    invoke-virtual {v2, v1}, La/Cd;->i(La/md;)V

    new-instance v22, La/ld$a;

    new-instance v1, La/id;

    const/16 v3, 0xf

    invoke-direct {v1, v3}, La/id;-><init>(I)V

    new-instance v3, La/id;

    const/16 v4, 0x10

    invoke-direct {v3, v4}, La/id;-><init>(I)V

    const/16 v27, 0x0

    const/16 v30, 0x0

    const-string v23, "F008_hide_own_sns"

    const-string v25, ""

    const/16 v26, 0x0

    const/16 v31, 0x80

    move-object/from16 v28, v1

    move-object/from16 v29, v3

    invoke-direct/range {v22 .. v31}, La/ld$a;-><init>(Ljava/lang/String;La/ld$b;Ljava/lang/String;IZLa/D7;La/D7;La/D7;I)V

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, La/ld;->d(La/ld$a;)V

    new-instance v1, La/g3;

    const-string v3, "j4.m0"

    const-string v4, "F024_status_store"

    invoke-direct {v1, v4, v3, v13, v8}, La/g3;-><init>(Ljava/lang/String;Ljava/lang/String;II)V

    invoke-virtual {v2, v1}, La/Cd;->i(La/md;)V

    new-instance v22, La/ld$a;

    new-instance v3, La/id;

    const/16 v5, 0x11

    invoke-direct {v3, v5}, La/id;-><init>(I)V

    new-instance v5, La/jd;

    const/4 v6, 0x5

    invoke-direct {v5, v1, v6}, La/jd;-><init>(La/g3;I)V

    const/16 v27, 0x0

    const/16 v30, 0x0

    const-string v23, "F024_status_store"

    const/16 v26, 0x50

    const/16 v31, 0x80

    move-object/from16 v28, v3

    move-object/from16 v25, v4

    move-object/from16 v29, v5

    invoke-direct/range {v22 .. v31}, La/ld$a;-><init>(Ljava/lang/String;La/ld$b;Ljava/lang/String;IZLa/D7;La/D7;La/D7;I)V

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, La/ld;->d(La/ld$a;)V

    new-instance v1, La/g3;

    const-string v3, "n3.o0"

    const-string v4, "F024_mvvm_submit_param"

    invoke-direct {v1, v4, v3, v13, v8}, La/g3;-><init>(Ljava/lang/String;Ljava/lang/String;II)V

    invoke-virtual {v2, v1}, La/Cd;->i(La/md;)V

    new-instance v22, La/ld$a;

    new-instance v2, La/id;

    const/16 v3, 0x12

    invoke-direct {v2, v3}, La/id;-><init>(I)V

    new-instance v3, La/jd;

    invoke-direct {v3, v1, v12}, La/jd;-><init>(La/g3;I)V

    const/16 v27, 0x0

    const/16 v30, 0x0

    const-string v23, "F024_mvvm_submit_param"

    const/16 v26, 0x50

    const/16 v31, 0x80

    move-object/from16 v28, v2

    move-object/from16 v29, v3

    move-object/from16 v25, v4

    invoke-direct/range {v22 .. v31}, La/ld$a;-><init>(Ljava/lang/String;La/ld$b;Ljava/lang/String;IZLa/D7;La/D7;La/D7;I)V

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, La/ld;->d(La/ld$a;)V

    new-instance v22, La/ld$a;

    new-instance v1, La/id;

    const/16 v2, 0x14

    invoke-direct {v1, v2}, La/id;-><init>(I)V

    new-instance v2, La/id;

    const/16 v3, 0x15

    invoke-direct {v2, v3}, La/id;-><init>(I)V

    const/16 v27, 0x0

    const/16 v30, 0x0

    const-string v23, "F025_msg_storage"

    const-string v25, ""

    const/16 v26, 0x50

    const/16 v31, 0x80

    move-object/from16 v28, v1

    move-object/from16 v29, v2

    invoke-direct/range {v22 .. v31}, La/ld$a;-><init>(Ljava/lang/String;La/ld$b;Ljava/lang/String;IZLa/D7;La/D7;La/D7;I)V

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, La/ld;->d(La/ld$a;)V

    const-string v1, "registerBuiltins() done"

    filled-new-array {v14, v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, La/x1;->b([Ljava/lang/Object;)V

    return-void
.end method
