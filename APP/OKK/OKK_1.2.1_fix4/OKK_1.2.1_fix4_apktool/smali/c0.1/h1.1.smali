.class public final Lc0/h1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lc0/h1;

.field public static final b:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final c:Ljava/util/concurrent/atomic/AtomicLong;

.field public static final d:Ljava/util/concurrent/atomic/AtomicInteger;

.field public static final e:Ljava/lang/Object;

.field public static final f:Ljava/util/concurrent/ExecutorService;

.field public static volatile g:Z

.field public static final h:Ljava/util/LinkedHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 68

    new-instance v0, Lc0/h1;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lc0/h1;->a:Lc0/h1;

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lc0/h1;->b:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    sput-object v0, Lc0/h1;->c:Ljava/util/concurrent/atomic/AtomicLong;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    sput-object v0, Lc0/h1;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lc0/h1;->e:Ljava/lang/Object;

    new-instance v0, Lc0/g1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lc0/g1;-><init>(I)V

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lc0/h1;->f:Ljava/util/concurrent/ExecutorService;

    new-instance v1, LD0/e;

    const-string v0, "anti_revoke"

    const-string v2, "true"

    invoke-direct {v1, v0, v2}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, LD0/e;

    const-string v3, "revoke_notice_enabled"

    invoke-direct {v0, v3, v2}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, LD0/e;

    const-string v4, "anti_revoke_keep_self"

    const-string v5, "false"

    invoke-direct {v3, v4, v5}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v4, LD0/e;

    const-string v6, "anti_revoke_notice_text"

    const-string v7, "{name}\u64a4\u56de\u4e86\u4e00\u6761\u6d88\u606f"

    invoke-direct {v4, v6, v7}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v6, LD0/e;

    const-string v7, "media_protect_enabled"

    invoke-direct {v6, v7, v2}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v7, LD0/e;

    const-string v8, "anti_moments_delete"

    invoke-direct {v7, v8, v2}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v8, LD0/e;

    const-string v9, "swipe_quote"

    invoke-direct {v8, v9, v2}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v9, LD0/e;

    const-string v10, "swipe_repeat"

    invoke-direct {v9, v10, v5}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v10, LD0/e;

    const-string v11, "quote_delete_clear"

    invoke-direct {v10, v11, v5}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v11, LD0/e;

    const-string v12, "bubble_enabled"

    invoke-direct {v11, v12, v2}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v12, LD0/e;

    const-string v13, "settings_entry_enabled"

    invoke-direct {v12, v13, v2}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v13, LD0/e;

    const-string v14, "module_log_enabled"

    invoke-direct {v13, v14, v5}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v14, LD0/e;

    const-string v15, "bottom_tab_hide_title"

    invoke-direct {v14, v15, v5}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v15, LD0/e;

    move-object/from16 v16, v14

    const-string v14, "detail_enabled"

    invoke-direct {v15, v14, v2}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v14, LD0/e;

    move-object/from16 v17, v15

    const-string v15, "detail_template"

    move-object/from16 v18, v13

    const-string v13, "${time} ${relativeTime}"

    invoke-direct {v14, v15, v13}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v15, LD0/e;

    const-string v13, "detail_time_pattern"

    move-object/from16 v19, v14

    const-string v14, "MM-dd HH:mm:ss"

    invoke-direct {v15, v13, v14}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v14, LD0/e;

    const-string v13, "detail_text_size"

    move-object/from16 v20, v15

    const-string v15, "12"

    invoke-direct {v14, v13, v15}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v15, LD0/e;

    const-string v13, "detail_left_margin"

    move-object/from16 v21, v14

    const-string v14, "0"

    invoke-direct {v15, v13, v14}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v13, LD0/e;

    move-object/from16 v22, v15

    const-string v15, "detail_right_margin"

    invoke-direct {v13, v15, v14}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v15, LD0/e;

    const-string v14, "detail_text_color_light"

    move-object/from16 v23, v13

    const-string v13, "#E6000000"

    invoke-direct {v15, v14, v13}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v14, LD0/e;

    const-string v13, "detail_text_color_dark"

    move-object/from16 v24, v15

    const-string v15, "#CCFFFFFF"

    invoke-direct {v14, v13, v15}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v15, LD0/e;

    const-string v13, "detail_click_show"

    invoke-direct {v15, v13, v5}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v13, LD0/e;

    move-object/from16 v25, v14

    const-string v14, "input_stats_enabled"

    invoke-direct {v13, v14, v2}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v14, LD0/e;

    move-object/from16 v26, v13

    const-string v13, "input_stats_count_send"

    invoke-direct {v14, v13, v2}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v13, LD0/e;

    move-object/from16 v27, v14

    const-string v14, "input_stats_template"

    move-object/from16 v28, v15

    const-string v15, "\u4eca\u65e5\u5df2\u53d1${totalMsg}\u6761"

    invoke-direct {v13, v14, v15}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v15, LD0/e;

    const-string v14, "round_avatar_enabled"

    invoke-direct {v15, v14, v5}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v14, LD0/e;

    move-object/from16 v29, v13

    const-string v13, "round_avatar_radius"

    move-object/from16 v30, v15

    const-string v15, "0.36"

    invoke-direct {v14, v13, v15}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v15, LD0/e;

    const-string v13, "anti_moments_comment_revoke"

    invoke-direct {v15, v13, v2}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v13, LD0/e;

    move-object/from16 v31, v14

    const-string v14, "virtual_location_enabled"

    invoke-direct {v13, v14, v5}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v14, LD0/e;

    move-object/from16 v32, v13

    const-string v13, "virtual_location_latitude"

    move-object/from16 v33, v15

    const-string v15, ""

    invoke-direct {v14, v13, v15}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v13, LD0/e;

    move-object/from16 v34, v14

    const-string v14, "virtual_location_longitude"

    invoke-direct {v13, v14, v15}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v14, LD0/e;

    move-object/from16 v35, v13

    const-string v13, "auto_login_win_enabled"

    invoke-direct {v14, v13, v5}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v13, LD0/e;

    move-object/from16 v36, v14

    const-string v14, "auto_login_win_sync_msg"

    invoke-direct {v13, v14, v2}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v14, LD0/e;

    move-object/from16 v37, v13

    const-string v13, "auto_login_win_show_device"

    invoke-direct {v14, v13, v2}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v13, LD0/e;

    move-object/from16 v38, v14

    const-string v14, "auto_login_win_auto_device"

    invoke-direct {v13, v14, v5}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v14, LD0/e;

    move-object/from16 v39, v13

    const-string v13, "auto_login_win_auto_click"

    invoke-direct {v14, v13, v2}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v13, LD0/e;

    move-object/from16 v40, v14

    const-string v14, "remove_moments_ads"

    invoke-direct {v13, v14, v5}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v14, LD0/e;

    move-object/from16 v41, v13

    const-string v13, "profile_id"

    invoke-direct {v14, v13, v5}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v13, LD0/e;

    move-object/from16 v42, v14

    const-string v14, "home_avatar_entry"

    invoke-direct {v13, v14, v2}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v14, LD0/e;

    move-object/from16 v43, v13

    const-string v13, "home_drawer_shortcuts"

    move-object/from16 v44, v12

    const-string v12, "qrcode,pay,favorite"

    invoke-direct {v14, v13, v12}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v13, LD0/e;

    const-string v12, "home_drawer_signature"

    move-object/from16 v45, v14

    const-string v14, "OKK \u5feb\u6377\u9762\u677f"

    invoke-direct {v13, v12, v14}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v14, LD0/e;

    const-string v12, "home_status_custom"

    invoke-direct {v14, v12, v15}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v12, LD0/e;

    move-object/from16 v46, v13

    const-string v13, "theme_wallpaper_enabled"

    invoke-direct {v12, v13, v5}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v13, LD0/e;

    move-object/from16 v47, v12

    const-string v12, "theme_wallpaper_alpha"

    move-object/from16 v48, v14

    const-string v14, "0.28"

    invoke-direct {v13, v12, v14}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v14, LD0/e;

    const-string v12, "theme_wallpaper_path"

    invoke-direct {v14, v12, v15}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v15, LD0/e;

    const-string v12, "disable_hot_update"

    invoke-direct {v15, v12, v5}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v12, LD0/e;

    move-object/from16 v49, v13

    const-string v13, "real_name_tail"

    invoke-direct {v12, v13, v5}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v13, LD0/e;

    move-object/from16 v50, v12

    const-string v12, "real_name_tail_color"

    move-object/from16 v51, v14

    const-string v14, "#9E9E9E"

    invoke-direct {v13, v12, v14}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v14, LD0/e;

    const-string v12, "member_title"

    invoke-direct {v14, v12, v5}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v12, LD0/e;

    move-object/from16 v52, v13

    const-string v13, "member_title_show_member"

    invoke-direct {v12, v13, v2}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v13, LD0/e;

    move-object/from16 v53, v12

    const-string v12, "member_title_owner"

    move-object/from16 v54, v14

    const-string v14, "\u7fa4\u4e3b"

    invoke-direct {v13, v12, v14}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v14, LD0/e;

    const-string v12, "member_title_admin"

    move-object/from16 v55, v13

    const-string v13, "\u7ba1\u7406\u5458"

    invoke-direct {v14, v12, v13}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v13, LD0/e;

    const-string v12, "member_title_member"

    move-object/from16 v56, v14

    const-string v14, "\u6210\u5458"

    invoke-direct {v13, v12, v14}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v14, LD0/e;

    const-string v12, "edit_message"

    invoke-direct {v14, v12, v5}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v12, LD0/e;

    move-object/from16 v57, v13

    const-string v13, "hide_home_divider"

    invoke-direct {v12, v13, v5}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v13, LD0/e;

    move-object/from16 v58, v12

    const-string v12, "fold_banner_fixed"

    invoke-direct {v13, v12, v2}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v12, LD0/e;

    move-object/from16 v59, v13

    const-string v13, "bottom_tab_floating"

    invoke-direct {v12, v13, v5}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v13, LD0/e;

    move-object/from16 v60, v12

    const-string v12, "bottom_tab_floating_labels"

    invoke-direct {v13, v12, v2}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v12, LD0/e;

    move-object/from16 v61, v13

    const-string v13, "bottom_tab_floating_badge"

    invoke-direct {v12, v13, v2}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v13, LD0/e;

    move-object/from16 v62, v12

    const-string v12, "bottom_tab_title_chats"

    move-object/from16 v63, v14

    const-string v14, "\u5fae\u4fe1"

    invoke-direct {v13, v12, v14}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v14, LD0/e;

    const-string v12, "bottom_tab_title_contacts"

    move-object/from16 v64, v13

    const-string v13, "\u901a\u8baf\u5f55"

    invoke-direct {v14, v12, v13}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v13, LD0/e;

    const-string v12, "bottom_tab_title_discover"

    move-object/from16 v65, v14

    const-string v14, "\u53d1\u73b0"

    invoke-direct {v13, v12, v14}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v14, LD0/e;

    const-string v12, "bottom_tab_title_me"

    move-object/from16 v66, v13

    const-string v13, "\u6211"

    invoke-direct {v14, v12, v13}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v13, LD0/e;

    const-string v12, "night_mode_follow"

    invoke-direct {v13, v12, v2}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v12, LD0/e;

    const-string v2, "night_mode"

    invoke-direct {v12, v2, v5}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v2, v0

    move-object v5, v6

    move-object v6, v7

    move-object v7, v8

    move-object v8, v9

    move-object v9, v10

    move-object v10, v11

    move-object/from16 v11, v44

    move-object/from16 v67, v12

    move-object/from16 v0, v47

    move-object/from16 v47, v50

    move-object/from16 v50, v53

    move-object/from16 v12, v18

    move-object/from16 v44, v46

    move-object/from16 v46, v49

    move-object/from16 v49, v52

    move-object/from16 v52, v55

    move-object/from16 v53, v57

    move-object/from16 v57, v59

    move-object/from16 v59, v61

    move-object/from16 v61, v64

    move-object/from16 v64, v66

    move-object/from16 v66, v13

    move-object/from16 v13, v16

    move-object/from16 v16, v19

    move-object/from16 v18, v21

    move-object/from16 v21, v25

    move-object/from16 v25, v27

    move-object/from16 v27, v31

    move-object/from16 v31, v34

    move-object/from16 v34, v36

    move-object/from16 v36, v38

    move-object/from16 v38, v40

    move-object/from16 v40, v42

    move-object/from16 v42, v45

    move-object/from16 v45, v48

    move-object/from16 v48, v51

    move-object/from16 v51, v54

    move-object/from16 v54, v56

    move-object/from16 v55, v63

    move-object/from16 v63, v65

    move-object/from16 v65, v14

    move-object/from16 v14, v17

    move-object/from16 v56, v15

    move-object/from16 v17, v20

    move-object/from16 v19, v22

    move-object/from16 v20, v24

    move-object/from16 v22, v28

    move-object/from16 v28, v30

    move-object/from16 v30, v33

    move-object/from16 v15, v16

    move-object/from16 v16, v17

    move-object/from16 v17, v18

    move-object/from16 v18, v19

    move-object/from16 v19, v23

    move-object/from16 v23, v26

    move-object/from16 v24, v25

    move-object/from16 v25, v29

    move-object/from16 v26, v28

    move-object/from16 v28, v30

    move-object/from16 v29, v32

    move-object/from16 v30, v31

    move-object/from16 v31, v35

    move-object/from16 v32, v34

    move-object/from16 v33, v37

    move-object/from16 v34, v36

    move-object/from16 v35, v39

    move-object/from16 v36, v38

    move-object/from16 v37, v41

    move-object/from16 v38, v40

    move-object/from16 v39, v43

    move-object/from16 v40, v42

    move-object/from16 v41, v44

    move-object/from16 v42, v45

    move-object/from16 v43, v0

    move-object/from16 v44, v46

    move-object/from16 v45, v48

    move-object/from16 v46, v56

    move-object/from16 v48, v49

    move-object/from16 v49, v51

    move-object/from16 v51, v52

    move-object/from16 v52, v54

    move-object/from16 v54, v55

    move-object/from16 v55, v58

    move-object/from16 v56, v57

    move-object/from16 v57, v60

    move-object/from16 v58, v59

    move-object/from16 v59, v62

    move-object/from16 v60, v61

    move-object/from16 v61, v63

    move-object/from16 v62, v64

    move-object/from16 v63, v65

    move-object/from16 v64, v66

    move-object/from16 v65, v67

    filled-new-array/range {v1 .. v65}, [LD0/e;

    move-result-object v0

    new-instance v1, Ljava/util/LinkedHashMap;

    const/16 v2, 0x41

    invoke-static {v2}, LE0/x;->g0(I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-static {v1, v0}, LE0/x;->i0(Ljava/util/LinkedHashMap;[LD0/e;)V

    sput-object v1, Lc0/h1;->h:Ljava/util/LinkedHashMap;

    return-void
.end method

.method public static a()V
    .locals 12

    const/4 v0, 0x1

    invoke-static {v0}, Lc0/h1;->i(Z)V

    new-instance v1, Ljava/io/File;

    const-string v2, "/storage/emulated/0/Android/media/com.tencent.mm/OKK"

    const-string v3, "achat_config.properties"

    invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v1}, LA0/p;->F(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    :cond_0
    move v1, v0

    goto :goto_0

    :cond_1
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->isFile()Z

    move-result v2

    if-eqz v2, :cond_2

    move v1, v3

    :goto_0
    sget-object v2, Lc0/h1;->h:Ljava/util/LinkedHashMap;

    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_3
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    sget-object v6, Lc0/h1;->b:Ljava/util/concurrent/ConcurrentHashMap;

    if-eqz v5, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_3

    invoke-virtual {v6, v7, v5}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move v1, v0

    goto :goto_1

    :cond_4
    const-string v4, "detail_template"

    invoke-virtual {v2, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, LQ0/g;->b(Ljava/lang/Object;)V

    check-cast v5, Ljava/lang/String;

    const-string v7, "detail_time_pattern"

    invoke-virtual {v2, v7}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, LQ0/g;->b(Ljava/lang/Object;)V

    check-cast v2, Ljava/lang/String;

    const-string v8, "${time}"

    const-string v9, "${time}|${relativeTime}"

    const-string v10, "${time} ${weekday} ${relativeTime}"

    filled-new-array {v9, v10, v8}, [Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, LA0/p;->W([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v8

    const-string v9, "yyyy-MM-dd HH:mm:ss"

    const-string v10, "MM-dd \u5468\u4e00 HH:mm:ss"

    const-string v11, "MM-dd HH:mm"

    filled-new-array {v10, v11, v9}, [Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, LA0/p;->W([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v9

    invoke-virtual {v6, v4}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    invoke-interface {v8, v10}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_5

    invoke-virtual {v6, v4}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/CharSequence;

    if-eqz v8, :cond_5

    invoke-static {v8}, LW0/j;->R0(Ljava/lang/CharSequence;)Z

    move-result v8

    if-eqz v8, :cond_6

    :cond_5
    invoke-virtual {v6, v4, v5}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move v1, v0

    :cond_6
    invoke-virtual {v6, v7}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v9, v4}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_8

    invoke-virtual {v6, v7}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/CharSequence;

    if-eqz v4, :cond_8

    invoke-static {v4}, LW0/j;->R0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_7

    goto :goto_2

    :cond_7
    move v0, v1

    goto :goto_3

    :cond_8
    :goto_2
    invoke-virtual {v6, v7, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_3
    if-eqz v0, :cond_9

    invoke-static {v3}, Lc0/h1;->b(Z)V

    :cond_9
    return-void
.end method

.method public static b(Z)V
    .locals 6

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "# OKK public config\n"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "updated="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    sget-object v2, Lc0/h1;->b:Ljava/util/concurrent/ConcurrentHashMap;

    const-string v3, "<this>"

    invoke-static {v2, v3}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Ljava/util/TreeMap;

    invoke-direct {v3, v2}, Ljava/util/TreeMap;-><init>(Ljava/util/Map;)V

    invoke-virtual {v3}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const-string v5, "updated"

    invoke-static {v4, v5}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_0

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "="

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "toString(...)"

    invoke-static {v0, v1}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljava/io/File;

    const-string v2, "/storage/emulated/0/Android/media/com.tencent.mm/OKK"

    const-string v3, "achat_config.properties"

    invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v1}, LA0/p;->F(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    if-eqz p0, :cond_2

    sget-object p0, Lc0/h1;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result p0

    sget-object v2, Lc0/h1;->f:Ljava/util/concurrent/ExecutorService;

    new-instance v3, LS/a;

    const/4 v4, 0x2

    invoke-direct {v3, p0, v1, v0, v4}, LS/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;I)V

    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_4

    :cond_2
    sget-object p0, Lc0/h1;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    sget-object p0, Lc0/h1;->e:Ljava/lang/Object;

    monitor-enter p0

    :try_start_0
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/io/File;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-virtual {v2}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v3

    if-eqz v3, :cond_3

    invoke-virtual {v3}, Ljava/io/File;->mkdirs()Z

    goto :goto_2

    :catchall_0
    move-exception v2

    goto :goto_3

    :cond_3
    :goto_2
    sget-object v3, LW0/a;->a:Ljava/nio/charset/Charset;

    invoke-static {v2, v0, v3}, LN0/k;->j0(Ljava/io/File;Ljava/lang/String;Ljava/nio/charset/Charset;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :goto_3
    :try_start_2
    invoke-static {v2}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    goto :goto_5

    :cond_4
    monitor-exit p0

    :goto_4
    return-void

    :goto_5
    monitor-exit p0

    throw v0
.end method

.method public static c(Ljava/lang/String;Z)Z
    .locals 2

    const-string v0, "key"

    invoke-static {p0, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lc0/h1;->b:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->isEmpty()Z

    move-result v1

    invoke-static {v1}, Lc0/h1;->i(Z)V

    invoke-virtual {v0, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    if-nez p0, :cond_0

    return p1

    :cond_0
    const-string p1, "true"

    invoke-virtual {p0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_2

    const-string p1, "1"

    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    const-string p1, "yes"

    invoke-virtual {p0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_2

    const-string p1, "on"

    invoke-virtual {p0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "default"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lc0/h1;->b:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->isEmpty()Z

    move-result v1

    invoke-static {v1}, Lc0/h1;->i(Z)V

    invoke-virtual {v0, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, p0

    :goto_0
    return-object p1
.end method

.method public static e(Ljava/lang/String;)Ljava/util/LinkedHashMap;
    .locals 3

    const-string v0, "\ufeff"

    invoke-static {p0, v0}, LW0/j;->U0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, LW0/j;->S0(Ljava/lang/CharSequence;)LV0/f;

    move-result-object p0

    new-instance v0, Lc0/A;

    const/16 v1, 0x11

    invoke-direct {v0, v1}, Lc0/A;-><init>(I)V

    new-instance v1, LV0/f;

    invoke-direct {v1, p0, v0}, LV0/f;-><init>(LV0/h;LP0/l;)V

    new-instance p0, Lc0/A;

    const/16 v0, 0x12

    invoke-direct {p0, v0}, Lc0/A;-><init>(I)V

    new-instance v0, LV0/e;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, p0}, LV0/e;-><init>(LV0/h;ZLP0/l;)V

    new-instance p0, Lc0/A;

    const/16 v1, 0x13

    invoke-direct {p0, v1}, Lc0/A;-><init>(I)V

    new-instance v1, LV0/f;

    invoke-direct {v1, v0, p0}, LV0/f;-><init>(LV0/h;LP0/l;)V

    new-instance p0, Lc0/A;

    const/16 v0, 0x14

    invoke-direct {p0, v0}, Lc0/A;-><init>(I)V

    new-instance v0, LV0/e;

    invoke-direct {v0, v1, v2, p0}, LV0/e;-><init>(LV0/h;ZLP0/l;)V

    new-instance p0, Ljava/util/LinkedHashMap;

    invoke-direct {p0}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v1, LV0/d;

    invoke-direct {v1, v0}, LV0/d;-><init>(LV0/e;)V

    :goto_0
    invoke-virtual {v1}, LV0/d;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v1}, LV0/d;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LD0/e;

    iget-object v2, v0, LD0/e;->a:Ljava/lang/Object;

    iget-object v0, v0, LD0/e;->b:Ljava/lang/Object;

    invoke-interface {p0, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method public static h(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x1

    invoke-static {v0}, Lc0/h1;->i(Z)V

    sget-object v0, Lc0/h1;->b:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p0, 0x0

    invoke-static {p0}, Lc0/h1;->b(Z)V

    return-void
.end method

.method public static i(Z)V
    .locals 10

    sget-boolean v0, Lc0/h1;->g:Z

    const-string v1, "achat_config.properties"

    const-string v2, "/storage/emulated/0/Android/media/com.tencent.mm/OKK"

    const/4 v3, 0x1

    if-eqz v0, :cond_0

    goto :goto_3

    :cond_0
    sput-boolean v3, Lc0/h1;->g:Z

    :try_start_0
    new-instance v0, Ljava/io/File;

    const-string v4, "/storage/emulated/0/Android/media/com.tencent.mm/AChat"

    invoke-direct {v0, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    new-instance v4, Ljava/io/File;

    invoke-direct {v4, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    move-result v5

    if-nez v5, :cond_1

    goto :goto_3

    :cond_1
    new-instance v5, Ljava/io/File;

    invoke-direct {v5, v4, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/io/File;->isFile()Z

    move-result v5

    if-eqz v5, :cond_2

    goto :goto_3

    :cond_2
    invoke-virtual {v4}, Ljava/io/File;->mkdirs()Z

    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_4

    array-length v5, v0

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_4

    aget-object v7, v0, v6

    invoke-virtual {v7}, Ljava/io/File;->isFile()Z

    move-result v8

    if-eqz v8, :cond_3

    new-instance v8, Ljava/io/File;

    invoke-virtual {v7}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-direct {v8, v4, v9}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v8}, Ljava/io/File;->isFile()Z

    move-result v9

    if-nez v9, :cond_3

    invoke-static {v7, v8}, LN0/k;->g0(Ljava/io/File;Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_3
    :goto_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :goto_2
    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    :cond_4
    :goto_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    if-nez p0, :cond_5

    sget-object p0, Lc0/h1;->c:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v6

    sub-long v6, v4, v6

    const-wide/16 v8, 0x7d0

    cmp-long p0, v6, v8

    if-gez p0, :cond_5

    sget-object p0, Lc0/h1;->b:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p0}, Ljava/util/concurrent/ConcurrentHashMap;->isEmpty()Z

    move-result p0

    xor-int/2addr p0, v3

    if-eqz p0, :cond_5

    return-void

    :cond_5
    new-instance p0, Ljava/util/LinkedHashMap;

    sget-object v0, Lc0/h1;->h:Ljava/util/LinkedHashMap;

    invoke-direct {p0, v0}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    new-instance v0, Ljava/io/File;

    invoke-direct {v0, v2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, LA0/p;->F(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_6
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->isFile()Z

    move-result v2

    if-eqz v2, :cond_6

    :try_start_1
    sget-object v2, LW0/a;->a:Ljava/nio/charset/Charset;

    invoke-static {v1, v2}, LN0/k;->i0(Ljava/io/File;Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lc0/h1;->e(Ljava/lang/String;)Ljava/util/LinkedHashMap;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {p0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_5

    :catchall_1
    move-exception v1

    invoke-static {v1}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    goto :goto_4

    :cond_7
    sget-object v0, Lc0/h1;->b:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    invoke-virtual {v0, p0}, Ljava/util/concurrent/ConcurrentHashMap;->putAll(Ljava/util/Map;)V

    sget-object p0, Lc0/h1;->c:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {p0, v4, v5}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-static {v0}, Lc0/h1;->i(Z)V

    sget-object v0, Lc0/h1;->b:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p3}, Lc0/h1;->b(Z)V

    return-void
.end method

.method public final g(Ljava/lang/String;ZZ)V
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2, p3}, Lc0/h1;->f(Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method
