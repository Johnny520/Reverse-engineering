.class public final Lh/Hchat/hooks/items/script/ScriptPluginRuntime;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh/Hchat/hooks/items/script/ScriptPluginRuntime$SendResult;
    }
.end annotation


# static fields
.field public static final $stable:I = 0x0

.field private static final AGENT_TRANSACTION_DIRECTORY:Log/k;

.field private static final IMAGE_DOWNLOAD_CALLBACK_QUEUE_CAPACITY:I = 0x20

.field private static final IMAGE_DOWNLOAD_DROP_LOG_COOLDOWN_MS:J = 0x2710L

.field private static final INFO_FILE:Ljava/lang/String; = "info.prop"

.field private static final INITIAL_LOAD_POLL_MAX_MS:J = 0x7d0L

.field private static final INITIAL_LOAD_POLL_MIN_MS:J = 0xfaL

.field private static final INITIAL_LOAD_READY_TIMEOUT_MS:J = 0x7530L

.field public static final INSTANCE:Lh/Hchat/hooks/items/script/ScriptPluginRuntime;

.field private static final MAIN_FILE:Ljava/lang/String; = "main.java"

.field private static final PROCESS_APPBRAND:Ljava/lang/String; = "appbrand"

.field private static final PROCESS_MAIN:Ljava/lang/String; = "main"

.field private static final PROTOBUF_CALLBACK_QUEUE_CAPACITY:I = 0x80

.field private static final PROTOBUF_DROP_LOG_COOLDOWN_MS:J = 0x2710L

.field private static final README_FILE:Ljava/lang/String; = "README.md"

.field private static final RELOAD_DEBOUNCE_MS:J = 0x1f4L

.field private static final SCRIPT_FUNCTION_NAME:Log/k;

.field private static final SEND_BUTTON_DIAGNOSTIC_LOG_COOLDOWN_MS:J = 0x2710L

.field private static final SEND_BUTTON_SLOW_CALLBACK_MS:J = 0x32L

.field private static final SNAPSHOT_SUFFIX:Ljava/lang/String; = ".bshs"

.field private static final SNS_PREPARE_QUEUE_CAPACITY:I = 0x20

.field private static final TAG:Ljava/lang/String; = "[Hchat:Script]"

.field private static volatile appContext:Landroid/content/Context;

.field private static volatile bridge:Lh/Hchat/hooks/items/script/ScriptPluginBridge;

.field private static final imageDownloadCallbackExecutor:Ljava/util/concurrent/ThreadPoolExecutor;

.field private static final imageDownloadDropLogAt:Ljava/util/concurrent/atomic/AtomicLong;

.field private static final imageDownloadDroppedCount:Ljava/util/concurrent/atomic/AtomicLong;

.field private static final initialLoadStarted:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private static final interpreterLocks:Ljava/util/WeakHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/WeakHashMap<",
            "Lbsh/Interpreter;",
            "Ljava/util/concurrent/locks/ReentrantLock;",
            ">;"
        }
    .end annotation
.end field

.field private static final invalidProcessWarnings:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap$KeySetView<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private static final loadedNativeLibraries:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Leb/z;",
            ">;"
        }
    .end annotation
.end field

.field private static final loadedPlugins:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Leb/a0;",
            ">;"
        }
    .end annotation
.end field

.field private static final mainHandler:Landroid/os/Handler;

.field private static final nativeLoadLock:Ljava/lang/Object;

.field private static final nativeLoadSequence:Ljava/util/concurrent/atomic/AtomicLong;

.field private static final pluginCatalogListeners:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Lfg/a;",
            ">;"
        }
    .end annotation
.end field

.field private static final pluginDirObservers:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Landroid/os/FileObserver;",
            ">;"
        }
    .end annotation
.end field

.field private static final protobufCallbackExecutor:Ljava/util/concurrent/ThreadPoolExecutor;

.field private static final protobufDropLogAt:Ljava/util/concurrent/atomic/AtomicLong;

.field private static final protobufDroppedPacketCount:Ljava/util/concurrent/atomic/AtomicLong;

.field private static final protobufListenerLock:Ljava/lang/Object;

.field private static final protobufListenerRegistered:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private static final protobufPacketListener:Lwa/i;

.field private static final reloadTasks:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field private static volatile runtimeProcess:Ljava/lang/String;

.field private static volatile runtimeProcessName:Ljava/lang/String;

.field private static volatile scriptRootObserver:Landroid/os/FileObserver;

.field private static final sendButtonDiagnosticLogAt:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private static final snsPrepareCancellations:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Ljava/util/concurrent/atomic/AtomicBoolean;",
            ">;"
        }
    .end annotation
.end field

.field private static final snsPrepareExecutor:Ljava/util/concurrent/ThreadPoolExecutor;

.field private static final snsPrepareSequence:Ljava/util/concurrent/atomic/AtomicLong;


# direct methods
.method static constructor <clinit>()V
    .locals 19

    .line 1
    new-instance v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;

    .line 2
    .line 3
    invoke-direct {v0}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->INSTANCE:Lh/Hchat/hooks/items/script/ScriptPluginRuntime;

    .line 7
    .line 8
    new-instance v0, Log/k;

    .line 9
    .line 10
    const-string v1, "^\\..+\\.agent-(?:new|old|copy)-[A-Za-z0-9]+$"

    .line 11
    .line 12
    invoke-direct {v0, v1}, Log/k;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->AGENT_TRANSACTION_DIRECTORY:Log/k;

    .line 16
    .line 17
    new-instance v0, Ljava/lang/Object;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    sput-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->nativeLoadLock:Ljava/lang/Object;

    .line 23
    .line 24
    new-instance v0, Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->loadedNativeLibraries:Ljava/util/ArrayList;

    .line 30
    .line 31
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    .line 32
    .line 33
    const-wide/16 v1, 0x0

    .line 34
    .line 35
    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    .line 36
    .line 37
    .line 38
    sput-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->nativeLoadSequence:Ljava/util/concurrent/atomic/AtomicLong;

    .line 39
    .line 40
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 41
    .line 42
    const/4 v3, 0x0

    .line 43
    invoke-direct {v0, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 44
    .line 45
    .line 46
    sput-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->initialLoadStarted:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 47
    .line 48
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    sput-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->invalidProcessWarnings:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 53
    .line 54
    new-instance v0, Log/k;

    .line 55
    .line 56
    const-string v4, "[A-Za-z_][A-Za-z0-9_]*"

    .line 57
    .line 58
    invoke-direct {v0, v4}, Log/k;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    sput-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->SCRIPT_FUNCTION_NAME:Log/k;

    .line 62
    .line 63
    const-string v0, "main"

    .line 64
    .line 65
    sput-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->runtimeProcess:Ljava/lang/String;

    .line 66
    .line 67
    const-string v0, ""

    .line 68
    .line 69
    sput-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->runtimeProcessName:Ljava/lang/String;

    .line 70
    .line 71
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 72
    .line 73
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 74
    .line 75
    .line 76
    sput-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->loadedPlugins:Ljava/util/concurrent/ConcurrentHashMap;

    .line 77
    .line 78
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 79
    .line 80
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 81
    .line 82
    .line 83
    sput-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->pluginDirObservers:Ljava/util/concurrent/ConcurrentHashMap;

    .line 84
    .line 85
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 86
    .line 87
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 88
    .line 89
    .line 90
    sput-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->pluginCatalogListeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 91
    .line 92
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 93
    .line 94
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 95
    .line 96
    .line 97
    sput-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->reloadTasks:Ljava/util/concurrent/ConcurrentHashMap;

    .line 98
    .line 99
    new-instance v0, Ljava/util/WeakHashMap;

    .line 100
    .line 101
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 102
    .line 103
    .line 104
    sput-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->interpreterLocks:Ljava/util/WeakHashMap;

    .line 105
    .line 106
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 107
    .line 108
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 109
    .line 110
    .line 111
    sput-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->sendButtonDiagnosticLogAt:Ljava/util/concurrent/ConcurrentHashMap;

    .line 112
    .line 113
    new-instance v0, Landroid/os/Handler;

    .line 114
    .line 115
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    invoke-direct {v0, v4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 120
    .line 121
    .line 122
    sput-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->mainHandler:Landroid/os/Handler;

    .line 123
    .line 124
    new-instance v0, Ljava/lang/Object;

    .line 125
    .line 126
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 127
    .line 128
    .line 129
    sput-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->protobufListenerLock:Ljava/lang/Object;

    .line 130
    .line 131
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 132
    .line 133
    invoke-direct {v0, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 134
    .line 135
    .line 136
    sput-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->protobufListenerRegistered:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 137
    .line 138
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    .line 139
    .line 140
    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    .line 141
    .line 142
    .line 143
    sput-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->protobufDroppedPacketCount:Ljava/util/concurrent/atomic/AtomicLong;

    .line 144
    .line 145
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    .line 146
    .line 147
    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    .line 148
    .line 149
    .line 150
    sput-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->protobufDropLogAt:Ljava/util/concurrent/atomic/AtomicLong;

    .line 151
    .line 152
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    .line 153
    .line 154
    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    .line 155
    .line 156
    .line 157
    sput-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->imageDownloadDroppedCount:Ljava/util/concurrent/atomic/AtomicLong;

    .line 158
    .line 159
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    .line 160
    .line 161
    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    .line 162
    .line 163
    .line 164
    sput-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->imageDownloadDropLogAt:Ljava/util/concurrent/atomic/AtomicLong;

    .line 165
    .line 166
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    .line 167
    .line 168
    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    .line 169
    .line 170
    .line 171
    sput-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->snsPrepareSequence:Ljava/util/concurrent/atomic/AtomicLong;

    .line 172
    .line 173
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 174
    .line 175
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 176
    .line 177
    .line 178
    sput-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->snsPrepareCancellations:Ljava/util/concurrent/ConcurrentHashMap;

    .line 179
    .line 180
    new-instance v1, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 181
    .line 182
    new-instance v7, Ljava/util/concurrent/ArrayBlockingQueue;

    .line 183
    .line 184
    const/16 v0, 0x20

    .line 185
    .line 186
    invoke-direct {v7, v0}, Ljava/util/concurrent/ArrayBlockingQueue;-><init>(I)V

    .line 187
    .line 188
    .line 189
    new-instance v8, Lc9/q;

    .line 190
    .line 191
    const/4 v2, 0x6

    .line 192
    invoke-direct {v8, v2}, Lc9/q;-><init>(I)V

    .line 193
    .line 194
    .line 195
    new-instance v9, Ljava/util/concurrent/ThreadPoolExecutor$AbortPolicy;

    .line 196
    .line 197
    invoke-direct {v9}, Ljava/util/concurrent/ThreadPoolExecutor$AbortPolicy;-><init>()V

    .line 198
    .line 199
    .line 200
    const/4 v2, 0x2

    .line 201
    const/4 v3, 0x2

    .line 202
    const-wide/16 v4, 0x0

    .line 203
    .line 204
    sget-object v15, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 205
    .line 206
    move-object v6, v15

    .line 207
    invoke-direct/range {v1 .. v9}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;Ljava/util/concurrent/RejectedExecutionHandler;)V

    .line 208
    .line 209
    .line 210
    sput-object v1, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->snsPrepareExecutor:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 211
    .line 212
    new-instance v10, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 213
    .line 214
    new-instance v1, Ljava/util/concurrent/ArrayBlockingQueue;

    .line 215
    .line 216
    const/16 v2, 0x80

    .line 217
    .line 218
    invoke-direct {v1, v2}, Ljava/util/concurrent/ArrayBlockingQueue;-><init>(I)V

    .line 219
    .line 220
    .line 221
    new-instance v2, Lc9/q;

    .line 222
    .line 223
    const/4 v3, 0x7

    .line 224
    invoke-direct {v2, v3}, Lc9/q;-><init>(I)V

    .line 225
    .line 226
    .line 227
    new-instance v18, Ljava/util/concurrent/ThreadPoolExecutor$AbortPolicy;

    .line 228
    .line 229
    invoke-direct/range {v18 .. v18}, Ljava/util/concurrent/ThreadPoolExecutor$AbortPolicy;-><init>()V

    .line 230
    .line 231
    .line 232
    const/4 v11, 0x1

    .line 233
    const/4 v12, 0x1

    .line 234
    const-wide/16 v13, 0x0

    .line 235
    .line 236
    move-object/from16 v16, v1

    .line 237
    .line 238
    move-object/from16 v17, v2

    .line 239
    .line 240
    invoke-direct/range {v10 .. v18}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;Ljava/util/concurrent/RejectedExecutionHandler;)V

    .line 241
    .line 242
    .line 243
    sput-object v10, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->protobufCallbackExecutor:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 244
    .line 245
    new-instance v10, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 246
    .line 247
    new-instance v1, Ljava/util/concurrent/ArrayBlockingQueue;

    .line 248
    .line 249
    invoke-direct {v1, v0}, Ljava/util/concurrent/ArrayBlockingQueue;-><init>(I)V

    .line 250
    .line 251
    .line 252
    new-instance v0, Lc9/q;

    .line 253
    .line 254
    const/16 v2, 0x8

    .line 255
    .line 256
    invoke-direct {v0, v2}, Lc9/q;-><init>(I)V

    .line 257
    .line 258
    .line 259
    new-instance v18, Ljava/util/concurrent/ThreadPoolExecutor$AbortPolicy;

    .line 260
    .line 261
    invoke-direct/range {v18 .. v18}, Ljava/util/concurrent/ThreadPoolExecutor$AbortPolicy;-><init>()V

    .line 262
    .line 263
    .line 264
    const/4 v11, 0x2

    .line 265
    const/4 v12, 0x2

    .line 266
    move-object/from16 v17, v0

    .line 267
    .line 268
    move-object/from16 v16, v1

    .line 269
    .line 270
    invoke-direct/range {v10 .. v18}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;Ljava/util/concurrent/RejectedExecutionHandler;)V

    .line 271
    .line 272
    .line 273
    sput-object v10, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->imageDownloadCallbackExecutor:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 274
    .line 275
    new-instance v0, Leb/x;

    .line 276
    .line 277
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 278
    .line 279
    .line 280
    sput-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->protobufPacketListener:Lwa/i;

    .line 281
    .line 282
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic a(Lh/Hchat/hooks/items/protobuf/ProtobufPacketRuntime$Packet;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->protobufPacketListener$lambda$0(Lh/Hchat/hooks/items/protobuf/ProtobufPacketRuntime$Packet;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$getPluginCatalogListeners$p()Ljava/util/concurrent/CopyOnWriteArrayList;
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->pluginCatalogListeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$isPluginDirectory(Lh/Hchat/hooks/items/script/ScriptPluginRuntime;Ljava/io/File;)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->isPluginDirectory(Ljava/io/File;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic access$notifyPluginCatalogChanged(Lh/Hchat/hooks/items/script/ScriptPluginRuntime;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->notifyPluginCatalogChanged()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$refreshPluginDirObservers(Lh/Hchat/hooks/items/script/ScriptPluginRuntime;Ljava/io/File;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->refreshPluginDirObservers(Ljava/io/File;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$schedulePluginReload(Lh/Hchat/hooks/items/script/ScriptPluginRuntime;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->schedulePluginReload(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final awaitScriptApiReady(Landroid/content/Context;)Z
    .locals 7

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide/16 v2, 0x7530

    .line 6
    .line 7
    add-long/2addr v0, v2

    .line 8
    const-wide/16 v2, 0xfa

    .line 9
    .line 10
    :cond_0
    :goto_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 11
    .line 12
    .line 13
    move-result-wide v4

    .line 14
    cmp-long v4, v4, v0

    .line 15
    .line 16
    const/4 v5, 0x0

    .line 17
    if-gez v4, :cond_3

    .line 18
    .line 19
    invoke-direct {p0, p1}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->isPluginRuntimeEnabled(Landroid/content/Context;)Z

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    if-nez v4, :cond_1

    .line 24
    .line 25
    return v5

    .line 26
    :cond_1
    invoke-direct {p0}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->isScriptApiReady()Z

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    if-eqz v4, :cond_2

    .line 31
    .line 32
    const/4 p1, 0x1

    .line 33
    return p1

    .line 34
    :cond_2
    invoke-static {v2, v3}, Landroid/os/SystemClock;->sleep(J)V

    .line 35
    .line 36
    .line 37
    const-wide/16 v4, 0x2

    .line 38
    .line 39
    mul-long/2addr v2, v4

    .line 40
    const-wide/16 v4, 0x7d0

    .line 41
    .line 42
    cmp-long v6, v2, v4

    .line 43
    .line 44
    if-lez v6, :cond_0

    .line 45
    .line 46
    move-wide v2, v4

    .line 47
    goto :goto_0

    .line 48
    :cond_3
    return v5
.end method

.method public static synthetic b(Leb/u;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Long;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->logSendButtonDiagnostic$lambda$1(Lfg/p;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Long;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic c(Ljava/lang/Runnable;)Ljava/lang/Thread;
    .locals 0

    .line 1
    invoke-static {p0}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->imageDownloadCallbackExecutor$lambda$0(Ljava/lang/Runnable;)Ljava/lang/Thread;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final callLifecycle(Lbsh/Interpreter;Ljava/lang/String;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-direct {p0, p1}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->interpreterLock(Lbsh/Interpreter;)Ljava/util/concurrent/locks/ReentrantLock;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    .line 8
    :try_start_1
    new-instance v1, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string p2, "();"

    .line 17
    .line 18
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    invoke-virtual {p1, p2}, Lbsh/Interpreter;->eval(Ljava/lang/String;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 29
    :try_start_2
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 30
    .line 31
    .line 32
    goto :goto_1

    .line 33
    :catchall_0
    move-exception p1

    .line 34
    goto :goto_0

    .line 35
    :catchall_1
    move-exception p1

    .line 36
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 37
    .line 38
    .line 39
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 40
    :goto_0
    new-instance p2, Lsf/f;

    .line 41
    .line 42
    invoke-direct {p2, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 43
    .line 44
    .line 45
    move-object p1, p2

    .line 46
    :goto_1
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    if-eqz p1, :cond_2

    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    if-nez p2, :cond_0

    .line 57
    .line 58
    const-string p2, ""

    .line 59
    .line 60
    :cond_0
    const-string v0, "Command not found"

    .line 61
    .line 62
    const/4 v1, 0x1

    .line 63
    invoke-static {p2, v0, v1}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-nez v0, :cond_2

    .line 68
    .line 69
    const-string v0, "undefined"

    .line 70
    .line 71
    invoke-static {p2, v0, v1}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-nez v0, :cond_2

    .line 76
    .line 77
    const-string v0, "not found"

    .line 78
    .line 79
    invoke-static {p2, v0, v1}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 80
    .line 81
    .line 82
    move-result p2

    .line 83
    if-eqz p2, :cond_1

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_1
    throw p1

    .line 87
    :cond_2
    :goto_2
    return-void
.end method

.method private final callbackWrapper(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->SCRIPT_FUNCTION_NAME:Log/k;

    .line 2
    .line 3
    invoke-virtual {v0, p2}, Log/k;->d(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    invoke-static {p1, p2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const-string v1, "(); }"

    .line 20
    .line 21
    sparse-switch v0, :sswitch_data_0

    .line 22
    .line 23
    .line 24
    goto/16 :goto_0

    .line 25
    .line 26
    :sswitch_0
    const-string v0, "onUnload"

    .line 27
    .line 28
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    const-string p1, "void onUnload() { "

    .line 35
    .line 36
    invoke-static {p1, p2, v1}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    return-object p1

    .line 41
    :sswitch_1
    const-string v0, "onMemberChange"

    .line 42
    .line 43
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_0

    .line 48
    .line 49
    const-string p1, "void onMemberChange(String type, String groupWxid, String userWxid, String userName) { "

    .line 50
    .line 51
    const-string v0, "(type, groupWxid, userWxid, userName); }"

    .line 52
    .line 53
    invoke-static {p1, p2, v0}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    return-object p1

    .line 58
    :sswitch_2
    const-string v0, "onClickSendBtn"

    .line 59
    .line 60
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_0

    .line 65
    .line 66
    const-string p1, "boolean onClickSendBtn(String text) { return Boolean.TRUE.equals("

    .line 67
    .line 68
    const-string v0, "(text)); }"

    .line 69
    .line 70
    invoke-static {p1, p2, v0}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    return-object p1

    .line 75
    :sswitch_3
    const-string v0, "onHandleMsg"

    .line 76
    .line 77
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-eqz v0, :cond_0

    .line 82
    .line 83
    const-string p1, "void onHandleMsg(Object msg) { "

    .line 84
    .line 85
    const-string v0, "(msg); }"

    .line 86
    .line 87
    invoke-static {p1, p2, v0}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    return-object p1

    .line 92
    :sswitch_4
    const-string v0, "openSettings"

    .line 93
    .line 94
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-eqz v0, :cond_0

    .line 99
    .line 100
    const-string p1, "void openSettings() { "

    .line 101
    .line 102
    invoke-static {p1, p2, v1}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    return-object p1

    .line 107
    :sswitch_5
    const-string v0, "onImageDownload"

    .line 108
    .line 109
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    if-eqz v0, :cond_0

    .line 114
    .line 115
    const-string p1, "void onImageDownload(Object msg, String imagePath, String talker, String senderWxid) { "

    .line 116
    .line 117
    const-string v0, "(msg, imagePath, talker, senderWxid); }"

    .line 118
    .line 119
    invoke-static {p1, p2, v0}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    return-object p1

    .line 124
    :sswitch_6
    const-string v0, "onProtobufPacket"

    .line 125
    .line 126
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    if-eqz v0, :cond_0

    .line 131
    .line 132
    const-string p1, "void onProtobufPacket(Object packet) { "

    .line 133
    .line 134
    const-string v0, "(packet); }"

    .line 135
    .line 136
    invoke-static {p1, p2, v0}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    return-object p1

    .line 141
    :sswitch_7
    const-string v0, "onNewFriend"

    .line 142
    .line 143
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v0

    .line 147
    if-eqz v0, :cond_0

    .line 148
    .line 149
    const-string p1, "void onNewFriend(String wxid, String ticket, int scene) { "

    .line 150
    .line 151
    const-string v0, "(wxid, ticket, scene); }"

    .line 152
    .line 153
    invoke-static {p1, p2, v0}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    return-object p1

    .line 158
    :sswitch_8
    const-string v0, "onLoad"

    .line 159
    .line 160
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result v0

    .line 164
    if-eqz v0, :cond_0

    .line 165
    .line 166
    const-string p1, "void onLoad() { "

    .line 167
    .line 168
    invoke-static {p1, p2, v1}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    return-object p1

    .line 173
    :cond_0
    :goto_0
    const-string p2, "\u4e0d\u652f\u6301\u7684\u56de\u8c03\u540d: "

    .line 174
    .line 175
    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    const/4 p1, 0x0

    .line 183
    return-object p1

    .line 184
    :cond_1
    const-string p2, "\u56de\u8c03\u522b\u540d\u4e0d\u80fd\u6307\u5411\u81ea\u8eab: "

    .line 185
    .line 186
    invoke-static {p2, p1}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    invoke-static {p1}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    const/4 p1, 0x0

    .line 194
    return-object p1

    .line 195
    :cond_2
    const-string p1, "\u975e\u6cd5\u51fd\u6570\u540d: "

    .line 196
    .line 197
    invoke-static {p1, p2}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    invoke-static {p1}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 202
    .line 203
    .line 204
    const/4 p1, 0x0

    .line 205
    return-object p1

    .line 206
    nop

    .line 207
    :sswitch_data_0
    .sparse-switch
        -0x3c63c09b -> :sswitch_8
        -0x3ba6dac1 -> :sswitch_7
        -0x3270a84e -> :sswitch_6
        -0x2666d09c -> :sswitch_5
        -0x162ca373 -> :sswitch_4
        0x1fc6d1a -> :sswitch_3
        0xc603e8b -> :sswitch_2
        0x42313a69 -> :sswitch_1
        0x5cdcb5be -> :sswitch_0
    .end sparse-switch
.end method

.method private final cancelSnsPrepareTasks(Ljava/lang/String;)V
    .locals 4

    .line 1
    const-string v0, ":"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lbc/e;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    sget-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->snsPrepareCancellations:Ljava/util/concurrent/ConcurrentHashMap;

    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Ljava/util/Map$Entry;

    .line 28
    .line 29
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    check-cast v2, Ljava/lang/String;

    .line 34
    .line 35
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    check-cast v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 40
    .line 41
    const/4 v3, 0x0

    .line 42
    invoke-static {v2, p1, v3}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-eqz v2, :cond_0

    .line 47
    .line 48
    const/4 v2, 0x1

    .line 49
    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    return-void
.end method

.method private final copyNativeLibrary(Ljava/io/File;Ljava/io/File;Ljava/lang/String;)V
    .locals 11

    .line 1
    const-string v0, "\u65e0\u6cd5\u5199\u5165Native\u7f13\u5b58: "

    .line 2
    .line 3
    const-string v1, "\u65e0\u6cd5\u66ff\u6362Native\u7f13\u5b58: "

    .line 4
    .line 5
    const-string v2, "Native\u7f13\u5b58\u590d\u5236\u6821\u9a8c\u5931\u8d25: "

    .line 6
    .line 7
    const-string v3, "Native\u7f13\u5b58\u590d\u5236\u4e0d\u5b8c\u6574: "

    .line 8
    .line 9
    new-instance v4, Ljava/io/File;

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 12
    .line 13
    .line 14
    move-result-object v5

    .line 15
    invoke-virtual {p2}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v6

    .line 19
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 20
    .line 21
    .line 22
    move-result v7

    .line 23
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 24
    .line 25
    .line 26
    move-result-object v8

    .line 27
    invoke-virtual {v8}, Ljava/lang/Thread;->getId()J

    .line 28
    .line 29
    .line 30
    move-result-wide v8

    .line 31
    const-string v10, "."

    .line 32
    .line 33
    invoke-static {v7, v10, v6, v10, v10}, Leh/a;->u(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    const-string v7, ".tmp"

    .line 38
    .line 39
    invoke-static {v6, v8, v9, v7}, Leh/a;->p(Ljava/lang/StringBuilder;JLjava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    invoke-direct {v4, v5, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    :try_start_0
    new-instance v5, Ljava/io/FileOutputStream;

    .line 47
    .line 48
    const/4 v6, 0x0

    .line 49
    invoke-direct {v5, v4, v6}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 50
    .line 51
    .line 52
    :try_start_1
    new-instance v6, Ljava/io/FileInputStream;

    .line 53
    .line 54
    invoke-direct {v6, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 55
    .line 56
    .line 57
    :try_start_2
    invoke-static {v6, v5}, Lg4/a;->j(Ljava/io/InputStream;Ljava/io/OutputStream;)J
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 58
    .line 59
    .line 60
    :try_start_3
    invoke-virtual {v6}, Ljava/io/FileInputStream;->close()V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v5}, Ljava/io/FileOutputStream;->getFD()Ljava/io/FileDescriptor;

    .line 64
    .line 65
    .line 66
    move-result-object v6

    .line 67
    invoke-virtual {v6}, Ljava/io/FileDescriptor;->sync()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 68
    .line 69
    .line 70
    :try_start_4
    invoke-virtual {v5}, Ljava/io/FileOutputStream;->close()V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v4}, Ljava/io/File;->length()J

    .line 74
    .line 75
    .line 76
    move-result-wide v5

    .line 77
    invoke-virtual {p1}, Ljava/io/File;->length()J

    .line 78
    .line 79
    .line 80
    move-result-wide v7

    .line 81
    cmp-long v5, v5, v7

    .line 82
    .line 83
    if-nez v5, :cond_4

    .line 84
    .line 85
    invoke-direct {p0, v4}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->sha256(Ljava/io/File;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    invoke-static {v3, p3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result p3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 93
    if-eqz p3, :cond_3

    .line 94
    .line 95
    :try_start_5
    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p3

    .line 103
    invoke-static {p1, p3}, Landroid/system/Os;->rename(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 104
    .line 105
    .line 106
    goto :goto_1

    .line 107
    :catchall_0
    move-exception p1

    .line 108
    :try_start_6
    invoke-virtual {p2}, Ljava/io/File;->exists()Z

    .line 109
    .line 110
    .line 111
    move-result p3

    .line 112
    if-eqz p3, :cond_1

    .line 113
    .line 114
    invoke-virtual {p2}, Ljava/io/File;->delete()Z

    .line 115
    .line 116
    .line 117
    move-result p3

    .line 118
    if-eqz p3, :cond_0

    .line 119
    .line 120
    goto :goto_0

    .line 121
    :cond_0
    new-instance p3, Ljava/lang/IllegalStateException;

    .line 122
    .line 123
    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object p2

    .line 127
    new-instance v0, Ljava/lang/StringBuilder;

    .line 128
    .line 129
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object p2

    .line 139
    invoke-direct {p3, p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 140
    .line 141
    .line 142
    throw p3

    .line 143
    :catchall_1
    move-exception p1

    .line 144
    goto :goto_3

    .line 145
    :cond_1
    :goto_0
    invoke-virtual {v4, p2}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 146
    .line 147
    .line 148
    move-result p3
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 149
    if-eqz p3, :cond_2

    .line 150
    .line 151
    :goto_1
    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    .line 152
    .line 153
    .line 154
    return-void

    .line 155
    :cond_2
    :try_start_7
    new-instance p3, Ljava/lang/IllegalStateException;

    .line 156
    .line 157
    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object p2

    .line 161
    new-instance v1, Ljava/lang/StringBuilder;

    .line 162
    .line 163
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object p2

    .line 173
    invoke-direct {p3, p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 174
    .line 175
    .line 176
    throw p3

    .line 177
    :cond_3
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    new-instance p2, Ljava/lang/StringBuilder;

    .line 182
    .line 183
    invoke-direct {p2, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 194
    .line 195
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    throw p2

    .line 203
    :cond_4
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    new-instance p2, Ljava/lang/StringBuilder;

    .line 208
    .line 209
    invoke-direct {p2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object p1

    .line 219
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 220
    .line 221
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object p1

    .line 225
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    throw p2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 229
    :catchall_2
    move-exception p1

    .line 230
    goto :goto_2

    .line 231
    :catchall_3
    move-exception p1

    .line 232
    :try_start_8
    throw p1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 233
    :catchall_4
    move-exception p2

    .line 234
    :try_start_9
    invoke-static {v6, p1}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 235
    .line 236
    .line 237
    throw p2
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 238
    :goto_2
    :try_start_a
    throw p1
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    .line 239
    :catchall_5
    move-exception p2

    .line 240
    :try_start_b
    invoke-static {v5, p1}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 241
    .line 242
    .line 243
    throw p2
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    .line 244
    :goto_3
    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    .line 245
    .line 246
    .line 247
    throw p1
.end method

.method private final currentBridge(Landroid/content/Context;)Lh/Hchat/hooks/items/script/ScriptPluginBridge;
    .locals 8

    .line 1
    sget-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->bridge:Lh/Hchat/hooks/items/script/ScriptPluginBridge;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    new-instance v1, Lh/Hchat/hooks/items/script/ScriptPluginBridge;

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    move-object v2, v0

    .line 15
    goto :goto_0

    .line 16
    :cond_1
    move-object v2, p1

    .line 17
    :goto_0
    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, p1}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->scriptDir(Landroid/content/Context;)Ljava/io/File;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    const/16 v6, 0x8

    .line 29
    .line 30
    const/4 v7, 0x0

    .line 31
    const/4 v5, 0x0

    .line 32
    invoke-direct/range {v1 .. v7}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;-><init>(Landroid/content/Context;Ljava/lang/ClassLoader;Ljava/io/File;Lh/Hchat/hooks/items/script/ScriptDexKitBridge;ILgg/g;)V

    .line 33
    .line 34
    .line 35
    sput-object v1, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->bridge:Lh/Hchat/hooks/items/script/ScriptPluginBridge;

    .line 36
    .line 37
    return-object v1
.end method

.method public static synthetic d(Landroid/content/Context;Lh/Hchat/hooks/items/script/ScriptPluginBridge;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->installAppBrandProcess$lambda$0(Landroid/content/Context;Lh/Hchat/hooks/items/script/ScriptPluginBridge;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final deliverProtobufSendResult(Ljava/util/function/Consumer;ZLjava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/function/Consumer<",
            "Lh/Hchat/hooks/items/script/ScriptPluginRuntime$SendResult;",
            ">;Z",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_3

    .line 4
    :cond_0
    :try_start_0
    new-instance v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime$SendResult;

    .line 5
    .line 6
    if-nez p3, :cond_1

    .line 7
    .line 8
    const-string p3, ""

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :catchall_0
    move-exception p1

    .line 12
    goto :goto_1

    .line 13
    :cond_1
    :goto_0
    invoke-direct {v0, p2, p3}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime$SendResult;-><init>(ZLjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p1, v0}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    sget-object p1, Lsf/n;->a:Lsf/n;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    goto :goto_2

    .line 22
    :goto_1
    new-instance p2, Lsf/f;

    .line 23
    .line 24
    invoke-direct {p2, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 25
    .line 26
    .line 27
    move-object p1, p2

    .line 28
    :goto_2
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    if-eqz p1, :cond_2

    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    const-string p3, "[Hchat:Script] \u6570\u636e\u5305\u53d1\u9001\u7ed3\u679c\u56de\u8c03\u5931\u8d25: "

    .line 39
    .line 40
    invoke-static {p3, p2, p1}, Leh/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 41
    .line 42
    .line 43
    :cond_2
    :goto_3
    return-void
.end method

.method private final detectCallbacks(Lbsh/Interpreter;)Leb/y;
    .locals 8

    .line 1
    :try_start_0
    invoke-virtual {p1}, Lbsh/Interpreter;->getNameSpace()Lbsh/NameSpace;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lbsh/NameSpace;->getMethods()[Lbsh/BshMethod;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    new-instance v0, Ljava/util/ArrayList;

    .line 13
    .line 14
    array-length v1, p1

    .line 15
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 16
    .line 17
    .line 18
    array-length v1, p1

    .line 19
    const/4 v2, 0x0

    .line 20
    :goto_0
    if-ge v2, v1, :cond_0

    .line 21
    .line 22
    aget-object v3, p1, v2

    .line 23
    .line 24
    invoke-virtual {v3}, Lbsh/BshMethod;->getName()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    add-int/lit8 v2, v2, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :catchall_0
    move-exception v0

    .line 35
    move-object p1, v0

    .line 36
    goto :goto_1

    .line 37
    :cond_0
    invoke-static {v0}, Ltf/m;->U1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 38
    .line 39
    .line 40
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    goto :goto_2

    .line 42
    :goto_1
    new-instance v0, Lsf/f;

    .line 43
    .line 44
    invoke-direct {v0, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 45
    .line 46
    .line 47
    move-object p1, v0

    .line 48
    :goto_2
    nop

    .line 49
    instance-of v0, p1, Lsf/f;

    .line 50
    .line 51
    if-eqz v0, :cond_1

    .line 52
    .line 53
    sget-object p1, Ltf/v;->g:Ltf/v;

    .line 54
    .line 55
    :cond_1
    check-cast p1, Ljava/util/Set;

    .line 56
    .line 57
    new-instance v0, Leb/y;

    .line 58
    .line 59
    const-string v1, "onClickSendBtn"

    .line 60
    .line 61
    invoke-interface {p1, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    const-string v2, "onHandleMsg"

    .line 66
    .line 67
    invoke-interface {p1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    const-string v3, "openSettings"

    .line 72
    .line 73
    invoke-interface {p1, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    const-string v4, "onMemberChange"

    .line 78
    .line 79
    invoke-interface {p1, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v4

    .line 83
    const-string v5, "onNewFriend"

    .line 84
    .line 85
    invoke-interface {p1, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v5

    .line 89
    const-string v6, "onProtobufPacket"

    .line 90
    .line 91
    invoke-interface {p1, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v6

    .line 95
    const-string v7, "onImageDownload"

    .line 96
    .line 97
    invoke-interface {p1, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v7

    .line 101
    invoke-direct/range {v0 .. v7}, Leb/y;-><init>(ZZZZZZZ)V

    .line 102
    .line 103
    .line 104
    return-object v0
.end method

.method private final detectCallbacks(Ljava/lang/String;)Leb/y;
    .locals 10

    .line 105
    const-string v0, "onClickSendBtn"

    const-string v1, "useOnClickSendBtn"

    invoke-direct {p0, p1, v0, v1}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->scriptHasCallback(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v3

    .line 106
    const-string v0, "onHandleMsg"

    const-string v1, "useOnHandleMsg"

    invoke-direct {p0, p1, v0, v1}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->scriptHasCallback(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v4

    .line 107
    const-string v0, "openSettings"

    const-string v1, "useOpenSettings"

    invoke-direct {p0, p1, v0, v1}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->scriptHasCallback(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v5

    .line 108
    const-string v0, "onMemberChange"

    const-string v1, "useOnMemberChange"

    invoke-direct {p0, p1, v0, v1}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->scriptHasCallback(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v6

    .line 109
    const-string v0, "onNewFriend"

    const-string v1, "useOnNewFriend"

    invoke-direct {p0, p1, v0, v1}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->scriptHasCallback(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v7

    .line 110
    const-string v0, "onProtobufPacket"

    const-string v1, "useOnProtobufPacket"

    invoke-direct {p0, p1, v0, v1}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->scriptHasCallback(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v8

    .line 111
    const-string v0, "onImageDownload"

    const-string v1, "useOnImageDownload"

    invoke-direct {p0, p1, v0, v1}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->scriptHasCallback(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v9

    .line 112
    new-instance v2, Leb/y;

    invoke-direct/range {v2 .. v9}, Leb/y;-><init>(ZZZZZZZ)V

    return-object v2
.end method

.method private static final dispatchOnClickSendBtn$lambda$0(Leb/a0;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-boolean p0, p0, Leb/a0;->c:Z

    .line 5
    .line 6
    return p0
.end method

.method private static final dispatchOnHandleMsg$lambda$0(Leb/a0;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-boolean p0, p0, Leb/a0;->d:Z

    .line 5
    .line 6
    return p0
.end method

.method private static final dispatchOnImageDownload$lambda$2(Lh/Hchat/hooks/items/script/ScriptPluginBridge;Lh/Hchat/hooks/items/script/ScriptMessageBean;Ljava/lang/Object;)V
    .locals 8

    .line 1
    sget-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->INSTANCE:Lh/Hchat/hooks/items/script/ScriptPluginRuntime;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->downloadCallbackImage(Lh/Hchat/hooks/items/script/ScriptPluginBridge;Lh/Hchat/hooks/items/script/ScriptMessageBean;Ljava/lang/Object;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-eqz p0, :cond_6

    .line 8
    .line 9
    sget-object p2, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->loadedPlugins:Ljava/util/concurrent/ConcurrentHashMap;

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    check-cast p2, Ljava/lang/Iterable;

    .line 19
    .line 20
    new-instance v0, Ldg/n;

    .line 21
    .line 22
    const/4 v1, 0x6

    .line 23
    invoke-direct {v0, p2, v1}, Ldg/n;-><init>(Ljava/lang/Object;I)V

    .line 24
    .line 25
    .line 26
    new-instance p2, Le9/h;

    .line 27
    .line 28
    const/16 v1, 0xe

    .line 29
    .line 30
    invoke-direct {p2, v1}, Le9/h;-><init>(I)V

    .line 31
    .line 32
    .line 33
    new-instance v1, Lng/i;

    .line 34
    .line 35
    const/4 v2, 0x1

    .line 36
    invoke-direct {v1, v0, v2, p2}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 37
    .line 38
    .line 39
    new-instance p2, La9/h;

    .line 40
    .line 41
    const/16 v0, 0xd

    .line 42
    .line 43
    invoke-direct {p2, v0}, La9/h;-><init>(I)V

    .line 44
    .line 45
    .line 46
    new-instance v0, Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 49
    .line 50
    .line 51
    invoke-static {v1, v0}, Lng/m;->a0(Lng/j;Ljava/util/AbstractCollection;)V

    .line 52
    .line 53
    .line 54
    invoke-static {v0, p2}, Ltf/q;->g1(Ljava/util/List;Ljava/util/Comparator;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-nez v0, :cond_0

    .line 66
    .line 67
    sget-object p2, Ltf/t;->g:Ltf/t;

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_0
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    if-nez v1, :cond_1

    .line 79
    .line 80
    invoke-static {v0}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    goto :goto_1

    .line 85
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    .line 86
    .line 87
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    if-eqz v0, :cond_2

    .line 98
    .line 99
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_2
    move-object p2, v1

    .line 108
    :goto_1
    invoke-virtual {p1}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->getTalker()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-virtual {p1}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->getSendTalker()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 117
    .line 118
    .line 119
    move-result-object p2

    .line 120
    :cond_3
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 121
    .line 122
    .line 123
    move-result v2

    .line 124
    if-eqz v2, :cond_6

    .line 125
    .line 126
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    check-cast v2, Leb/a0;

    .line 134
    .line 135
    sget-object v3, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->loadedPlugins:Ljava/util/concurrent/ConcurrentHashMap;

    .line 136
    .line 137
    iget-object v4, v2, Leb/a0;->a:Leb/c0;

    .line 138
    .line 139
    iget-object v4, v4, Leb/c0;->a:Ljava/lang/String;

    .line 140
    .line 141
    invoke-virtual {v3, v4}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v4

    .line 145
    if-eq v4, v2, :cond_4

    .line 146
    .line 147
    goto :goto_2

    .line 148
    :cond_4
    :try_start_0
    sget-object v4, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->INSTANCE:Lh/Hchat/hooks/items/script/ScriptPluginRuntime;

    .line 149
    .line 150
    iget-object v5, v2, Leb/a0;->b:Lbsh/Interpreter;

    .line 151
    .line 152
    invoke-direct {v4, v5}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->interpreterLock(Lbsh/Interpreter;)Ljava/util/concurrent/locks/ReentrantLock;

    .line 153
    .line 154
    .line 155
    move-result-object v4

    .line 156
    invoke-virtual {v4}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 157
    .line 158
    .line 159
    :try_start_1
    iget-object v5, v2, Leb/a0;->a:Leb/c0;

    .line 160
    .line 161
    iget-object v5, v5, Leb/c0;->a:Ljava/lang/String;

    .line 162
    .line 163
    invoke-virtual {v3, v5}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v3

    .line 167
    if-eq v3, v2, :cond_5

    .line 168
    .line 169
    goto :goto_3

    .line 170
    :cond_5
    iget-object v3, v2, Leb/a0;->b:Lbsh/Interpreter;

    .line 171
    .line 172
    const-string v5, "__hchat_image_msg_info"

    .line 173
    .line 174
    invoke-virtual {v3, v5, p1}, Lbsh/Interpreter;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    iget-object v3, v2, Leb/a0;->b:Lbsh/Interpreter;

    .line 178
    .line 179
    const-string v5, "__hchat_image_path"

    .line 180
    .line 181
    invoke-virtual {v3, v5, p0}, Lbsh/Interpreter;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    iget-object v3, v2, Leb/a0;->b:Lbsh/Interpreter;

    .line 185
    .line 186
    const-string v5, "__hchat_image_talker"

    .line 187
    .line 188
    invoke-virtual {v3, v5, v0}, Lbsh/Interpreter;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    iget-object v3, v2, Leb/a0;->b:Lbsh/Interpreter;

    .line 192
    .line 193
    const-string v5, "__hchat_image_sender"

    .line 194
    .line 195
    invoke-virtual {v3, v5, v1}, Lbsh/Interpreter;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    iget-object v3, v2, Leb/a0;->b:Lbsh/Interpreter;

    .line 199
    .line 200
    const-string v5, "onImageDownload(__hchat_image_msg_info, __hchat_image_path, __hchat_image_talker, __hchat_image_sender);"

    .line 201
    .line 202
    invoke-virtual {v3, v5}, Lbsh/Interpreter;->eval(Ljava/lang/String;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 203
    .line 204
    .line 205
    :goto_3
    :try_start_2
    invoke-virtual {v4}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 206
    .line 207
    .line 208
    goto :goto_2

    .line 209
    :catchall_0
    move-exception v3

    .line 210
    goto :goto_4

    .line 211
    :catchall_1
    move-exception v3

    .line 212
    invoke-virtual {v4}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 213
    .line 214
    .line 215
    throw v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 216
    :goto_4
    sget-object v4, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->INSTANCE:Lh/Hchat/hooks/items/script/ScriptPluginRuntime;

    .line 217
    .line 218
    const-string v5, "onImageDownload"

    .line 219
    .line 220
    invoke-direct {v4, v3, v5}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->isMissingCallbackError(Ljava/lang/Throwable;Ljava/lang/String;)Z

    .line 221
    .line 222
    .line 223
    move-result v4

    .line 224
    if-nez v4, :cond_3

    .line 225
    .line 226
    iget-object v4, v2, Leb/a0;->a:Leb/c0;

    .line 227
    .line 228
    iget-object v4, v4, Leb/c0;->b:Ljava/lang/String;

    .line 229
    .line 230
    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v5

    .line 234
    const-string v6, "[Hchat:Script] \u56fe\u7247\u4e0b\u8f7d\u56de\u8c03\u5931\u8d25: "

    .line 235
    .line 236
    const-string v7, " "

    .line 237
    .line 238
    invoke-static {v6, v4, v7, v5, v3}, Leh/a;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 239
    .line 240
    .line 241
    sget-object v4, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->bridge:Lh/Hchat/hooks/items/script/ScriptPluginBridge;

    .line 242
    .line 243
    if-eqz v4, :cond_3

    .line 244
    .line 245
    iget-object v2, v2, Leb/a0;->a:Leb/c0;

    .line 246
    .line 247
    iget-object v5, v2, Leb/c0;->b:Ljava/lang/String;

    .line 248
    .line 249
    iget-object v2, v2, Leb/c0;->c:Ljava/io/File;

    .line 250
    .line 251
    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v3

    .line 255
    new-instance v6, Ljava/lang/StringBuilder;

    .line 256
    .line 257
    const-string v7, "\u56fe\u7247\u4e0b\u8f7d\u56de\u8c03\u5931\u8d25: "

    .line 258
    .line 259
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 263
    .line 264
    .line 265
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v3

    .line 269
    invoke-virtual {v4, v5, v2, v3}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->log(Ljava/lang/String;Ljava/io/File;Ljava/lang/Object;)V

    .line 270
    .line 271
    .line 272
    goto/16 :goto_2

    .line 273
    .line 274
    :cond_6
    return-void
.end method

.method private static final dispatchOnImageDownload$lambda$2$0(Leb/a0;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-boolean p0, p0, Leb/a0;->i:Z

    .line 5
    .line 6
    return p0
.end method

.method private static final dispatchOnMemberChange$lambda$0(Leb/a0;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-boolean p0, p0, Leb/a0;->f:Z

    .line 5
    .line 6
    return p0
.end method

.method private static final dispatchOnNewFriend$lambda$0(Leb/a0;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-boolean p0, p0, Leb/a0;->g:Z

    .line 5
    .line 6
    return p0
.end method

.method private static final dispatchOnProtobufPacket$lambda$1(Lh/Hchat/hooks/items/protobuf/ProtobufPacketRuntime$Packet;)V
    .locals 7

    .line 1
    sget-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->loadedPlugins:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    check-cast v0, Ljava/lang/Iterable;

    .line 11
    .line 12
    new-instance v1, Ldg/n;

    .line 13
    .line 14
    const/4 v2, 0x6

    .line 15
    invoke-direct {v1, v0, v2}, Ldg/n;-><init>(Ljava/lang/Object;I)V

    .line 16
    .line 17
    .line 18
    new-instance v0, Le9/h;

    .line 19
    .line 20
    const/16 v2, 0x12

    .line 21
    .line 22
    invoke-direct {v0, v2}, Le9/h;-><init>(I)V

    .line 23
    .line 24
    .line 25
    new-instance v2, Lng/i;

    .line 26
    .line 27
    const/4 v3, 0x1

    .line 28
    invoke-direct {v2, v1, v3, v0}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 29
    .line 30
    .line 31
    new-instance v0, La9/h;

    .line 32
    .line 33
    const/16 v1, 0x10

    .line 34
    .line 35
    invoke-direct {v0, v1}, La9/h;-><init>(I)V

    .line 36
    .line 37
    .line 38
    new-instance v1, Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-static {v2, v1}, Lng/m;->a0(Lng/j;Ljava/util/AbstractCollection;)V

    .line 44
    .line 45
    .line 46
    invoke-static {v1, v0}, Ltf/q;->g1(Ljava/util/List;Ljava/util/Comparator;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-nez v1, :cond_0

    .line 58
    .line 59
    sget-object v0, Ltf/t;->g:Ltf/t;

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-nez v2, :cond_1

    .line 71
    .line 72
    invoke-static {v1}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    goto :goto_1

    .line 77
    :cond_1
    new-instance v2, Ljava/util/ArrayList;

    .line 78
    .line 79
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    if-eqz v1, :cond_2

    .line 90
    .line 91
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_2
    move-object v0, v2

    .line 100
    :goto_1
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    :cond_3
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    if-eqz v1, :cond_5

    .line 109
    .line 110
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    check-cast v1, Leb/a0;

    .line 118
    .line 119
    sget-object v2, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->loadedPlugins:Ljava/util/concurrent/ConcurrentHashMap;

    .line 120
    .line 121
    iget-object v3, v1, Leb/a0;->a:Leb/c0;

    .line 122
    .line 123
    iget-object v3, v3, Leb/c0;->a:Ljava/lang/String;

    .line 124
    .line 125
    invoke-virtual {v2, v3}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    if-eq v2, v1, :cond_4

    .line 130
    .line 131
    goto :goto_2

    .line 132
    :cond_4
    :try_start_0
    sget-object v2, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->INSTANCE:Lh/Hchat/hooks/items/script/ScriptPluginRuntime;

    .line 133
    .line 134
    iget-object v3, v1, Leb/a0;->b:Lbsh/Interpreter;

    .line 135
    .line 136
    invoke-direct {v2, v3}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->interpreterLock(Lbsh/Interpreter;)Ljava/util/concurrent/locks/ReentrantLock;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 141
    .line 142
    .line 143
    :try_start_1
    iget-object v3, v1, Leb/a0;->b:Lbsh/Interpreter;

    .line 144
    .line 145
    const-string v4, "__hchat_protobuf_packet"

    .line 146
    .line 147
    invoke-virtual {v3, v4, p0}, Lbsh/Interpreter;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    iget-object v3, v1, Leb/a0;->b:Lbsh/Interpreter;

    .line 151
    .line 152
    const-string v4, "onProtobufPacket(__hchat_protobuf_packet);"

    .line 153
    .line 154
    invoke-virtual {v3, v4}, Lbsh/Interpreter;->eval(Ljava/lang/String;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 155
    .line 156
    .line 157
    :try_start_2
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 158
    .line 159
    .line 160
    goto :goto_2

    .line 161
    :catchall_0
    move-exception v2

    .line 162
    goto :goto_3

    .line 163
    :catchall_1
    move-exception v3

    .line 164
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 165
    .line 166
    .line 167
    throw v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 168
    :goto_3
    sget-object v3, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->INSTANCE:Lh/Hchat/hooks/items/script/ScriptPluginRuntime;

    .line 169
    .line 170
    const-string v4, "onProtobufPacket"

    .line 171
    .line 172
    invoke-direct {v3, v2, v4}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->isMissingCallbackError(Ljava/lang/Throwable;Ljava/lang/String;)Z

    .line 173
    .line 174
    .line 175
    move-result v3

    .line 176
    if-nez v3, :cond_3

    .line 177
    .line 178
    iget-object v3, v1, Leb/a0;->a:Leb/c0;

    .line 179
    .line 180
    iget-object v3, v3, Leb/c0;->b:Ljava/lang/String;

    .line 181
    .line 182
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v4

    .line 186
    const-string v5, "[Hchat:Script] \u6570\u636e\u5305\u76d1\u542c\u56de\u8c03\u5931\u8d25: "

    .line 187
    .line 188
    const-string v6, " "

    .line 189
    .line 190
    invoke-static {v5, v3, v6, v4, v2}, Leh/a;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 191
    .line 192
    .line 193
    sget-object v3, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->bridge:Lh/Hchat/hooks/items/script/ScriptPluginBridge;

    .line 194
    .line 195
    if-eqz v3, :cond_3

    .line 196
    .line 197
    iget-object v1, v1, Leb/a0;->a:Leb/c0;

    .line 198
    .line 199
    iget-object v4, v1, Leb/c0;->b:Ljava/lang/String;

    .line 200
    .line 201
    iget-object v1, v1, Leb/c0;->c:Ljava/io/File;

    .line 202
    .line 203
    new-instance v5, Ljava/lang/StringBuilder;

    .line 204
    .line 205
    const-string v6, "\u6570\u636e\u5305\u76d1\u542c\u56de\u8c03\u5931\u8d25: "

    .line 206
    .line 207
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v2

    .line 217
    invoke-virtual {v3, v4, v1, v2}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->log(Ljava/lang/String;Ljava/io/File;Ljava/lang/Object;)V

    .line 218
    .line 219
    .line 220
    goto :goto_2

    .line 221
    :cond_5
    return-void
.end method

.method private static final dispatchOnProtobufPacket$lambda$1$0(Leb/a0;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-boolean p0, p0, Leb/a0;->h:Z

    .line 5
    .line 6
    return p0
.end method

.method private final downloadCallbackImage(Lh/Hchat/hooks/items/script/ScriptPluginBridge;Lh/Hchat/hooks/items/script/ScriptMessageBean;Ljava/lang/Object;)Ljava/lang/String;
    .locals 14

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    invoke-virtual {p1}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->getScriptDir()Ljava/io/File;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {p1}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->getScriptDir()Ljava/io/File;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    :goto_0
    const-string v2, "Cache"

    .line 19
    .line 20
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_1

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 30
    .line 31
    .line 32
    :cond_1
    invoke-virtual/range {p2 .. p2}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->getMsgId()J

    .line 33
    .line 34
    .line 35
    move-result-wide v1

    .line 36
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 41
    .line 42
    .line 43
    move-result-wide v2

    .line 44
    const-wide/16 v4, 0x0

    .line 45
    .line 46
    cmp-long v2, v2, v4

    .line 47
    .line 48
    const/4 v3, 0x0

    .line 49
    const/4 v6, 0x1

    .line 50
    if-lez v2, :cond_2

    .line 51
    .line 52
    move v2, v6

    .line 53
    goto :goto_1

    .line 54
    :cond_2
    move v2, v3

    .line 55
    :goto_1
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    const/4 v7, 0x0

    .line 64
    if-eqz v2, :cond_3

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_3
    move-object v1, v7

    .line 68
    :goto_2
    if-eqz v1, :cond_4

    .line 69
    .line 70
    :goto_3
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 71
    .line 72
    .line 73
    move-result-wide v1

    .line 74
    goto :goto_6

    .line 75
    :cond_4
    invoke-virtual/range {p2 .. p2}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->getCreateTime()J

    .line 76
    .line 77
    .line 78
    move-result-wide v1

    .line 79
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 84
    .line 85
    .line 86
    move-result-wide v8

    .line 87
    cmp-long v2, v8, v4

    .line 88
    .line 89
    if-lez v2, :cond_5

    .line 90
    .line 91
    move v2, v6

    .line 92
    goto :goto_4

    .line 93
    :cond_5
    move v2, v3

    .line 94
    :goto_4
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    if-eqz v2, :cond_6

    .line 103
    .line 104
    goto :goto_5

    .line 105
    :cond_6
    move-object v1, v7

    .line 106
    :goto_5
    if-eqz v1, :cond_7

    .line 107
    .line 108
    goto :goto_3

    .line 109
    :cond_7
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 110
    .line 111
    .line 112
    move-result-wide v1

    .line 113
    :goto_6
    invoke-virtual/range {p2 .. p2}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->getSendTalker()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v8

    .line 117
    invoke-static {v8}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 118
    .line 119
    .line 120
    move-result v9

    .line 121
    if-eqz v9, :cond_8

    .line 122
    .line 123
    invoke-virtual/range {p2 .. p2}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->getSender()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v8

    .line 127
    :cond_8
    invoke-direct {p0, v8}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->safeCallbackFilePart(Ljava/lang/String;)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v8

    .line 131
    new-instance v9, Ljava/io/File;

    .line 132
    .line 133
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 134
    .line 135
    .line 136
    move-result-wide v10

    .line 137
    const-string v12, "Hchat_ImageCallback_"

    .line 138
    .line 139
    const-string v13, "_"

    .line 140
    .line 141
    invoke-static {v12, v8, v13, v1, v2}, Leh/a;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v1, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    const-string v2, ".jpg"

    .line 152
    .line 153
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    invoke-direct {v9, v0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    new-instance v0, Lh/Hchat/hooks/items/script/ScriptWaBridge;

    .line 164
    .line 165
    invoke-direct {v0, p1}, Lh/Hchat/hooks/items/script/ScriptWaBridge;-><init>(Lh/Hchat/hooks/items/script/ScriptPluginBridge;)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v9}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    move-object/from16 v2, p3

    .line 173
    .line 174
    invoke-virtual {v0, v2, v1}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->downloadImg(Ljava/lang/Object;Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v9}, Ljava/io/File;->isFile()Z

    .line 178
    .line 179
    .line 180
    move-result v0

    .line 181
    if-eqz v0, :cond_9

    .line 182
    .line 183
    invoke-virtual {v9}, Ljava/io/File;->length()J

    .line 184
    .line 185
    .line 186
    move-result-wide v0

    .line 187
    cmp-long v0, v0, v4

    .line 188
    .line 189
    if-lez v0, :cond_9

    .line 190
    .line 191
    move v3, v6

    .line 192
    :cond_9
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 197
    .line 198
    .line 199
    move-result v0

    .line 200
    if-eqz v0, :cond_a

    .line 201
    .line 202
    goto :goto_7

    .line 203
    :cond_a
    move-object v9, v7

    .line 204
    :goto_7
    if-eqz v9, :cond_b

    .line 205
    .line 206
    invoke-virtual {v9}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    return-object v0

    .line 211
    :cond_b
    return-object v7
.end method

.method public static synthetic e(Leb/a0;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->dispatchOnProtobufPacket$lambda$1$0(Leb/a0;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic f(Ljava/util/function/Consumer;ZLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->sendProtobufPacket$lambda$1(Ljava/util/function/Consumer;ZLjava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic g(Leb/a0;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->dispatchOnClickSendBtn$lambda$0(Leb/a0;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic h(Leb/a0;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->dispatchOnNewFriend$lambda$0(Leb/a0;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic i(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->loadEnabledPluginsWhenReady$lambda$0(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final imageDownloadCallbackExecutor$lambda$0(Ljava/lang/Runnable;)Ljava/lang/Thread;
    .locals 2

    .line 1
    const-string v0, "Hchat-Script-ImageDownload"

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {v0, v1, p0}, Lj8/b;->n(Ljava/lang/String;ZLjava/lang/Runnable;)Ljava/lang/Thread;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    return-object p0
.end method

.method public static final installAppBrandProcess(Landroid/content/Context;Ljava/lang/ClassLoader;Ljava/lang/String;)V
    .locals 9

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    move-object v2, v0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object v2, p0

    .line 16
    :goto_0
    sget-object p0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->INSTANCE:Lh/Hchat/hooks/items/script/ScriptPluginRuntime;

    .line 17
    .line 18
    invoke-direct {p0, v2}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->isPluginRuntimeEnabled(Landroid/content/Context;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_1
    sget-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->initialLoadStarted:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    const/4 v8, 0x1

    .line 29
    invoke-virtual {v0, v1, v8}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_2

    .line 34
    .line 35
    :goto_1
    return-void

    .line 36
    :cond_2
    sput-object v2, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->appContext:Landroid/content/Context;

    .line 37
    .line 38
    const-string v0, "appbrand"

    .line 39
    .line 40
    sput-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->runtimeProcess:Ljava/lang/String;

    .line 41
    .line 42
    if-nez p2, :cond_3

    .line 43
    .line 44
    const-string p2, ""

    .line 45
    .line 46
    :cond_3
    sput-object p2, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->runtimeProcessName:Ljava/lang/String;

    .line 47
    .line 48
    new-instance v1, Lh/Hchat/hooks/items/script/ScriptPluginBridge;

    .line 49
    .line 50
    invoke-virtual {p0, v2}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->scriptDir(Landroid/content/Context;)Ljava/io/File;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    const/16 v6, 0x8

    .line 55
    .line 56
    const/4 v7, 0x0

    .line 57
    const/4 v5, 0x0

    .line 58
    move-object v3, p1

    .line 59
    invoke-direct/range {v1 .. v7}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;-><init>(Landroid/content/Context;Ljava/lang/ClassLoader;Ljava/io/File;Lh/Hchat/hooks/items/script/ScriptDexKitBridge;ILgg/g;)V

    .line 60
    .line 61
    .line 62
    sput-object v1, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->bridge:Lh/Hchat/hooks/items/script/ScriptPluginBridge;

    .line 63
    .line 64
    new-instance p0, Ljava/lang/Thread;

    .line 65
    .line 66
    new-instance p1, La1/d;

    .line 67
    .line 68
    const/16 p2, 0x8

    .line 69
    .line 70
    invoke-direct {p1, v2, p2, v1}, La1/d;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    const-string p2, "Hchat-Script-AppBrand"

    .line 74
    .line 75
    invoke-direct {p0, p1, p2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0, v8}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0}, Ljava/lang/Thread;->start()V

    .line 82
    .line 83
    .line 84
    return-void
.end method

.method private static final installAppBrandProcess$lambda$0(Landroid/content/Context;Lh/Hchat/hooks/items/script/ScriptPluginBridge;)V
    .locals 4

    .line 1
    const-string v0, " "

    .line 2
    .line 3
    const-string v1, "[Hchat:Script] \u5c0f\u7a0b\u5e8f\u8fdb\u7a0b\u63d2\u4ef6\u52a0\u8f7d\u5931\u8d25: "

    .line 4
    .line 5
    :try_start_0
    sget-object v2, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->INSTANCE:Lh/Hchat/hooks/items/script/ScriptPluginRuntime;

    .line 6
    .line 7
    invoke-direct {v2, p0, p1}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->loadEnabledAppBrandPlugins-gIAlu-s(Landroid/content/Context;Lh/Hchat/hooks/items/script/ScriptPluginBridge;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    instance-of p1, p0, Lsf/f;

    .line 12
    .line 13
    if-eqz p1, :cond_1

    .line 14
    .line 15
    sget-object p1, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->runtimeProcessName:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {p0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception p0

    .line 29
    goto :goto_1

    .line 30
    :cond_0
    const/4 v2, 0x0

    .line 31
    :goto_0
    new-instance v3, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-static {p0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-static {p1, p0}, Lfb/v0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    .line 55
    .line 56
    :cond_1
    return-void

    .line 57
    :goto_1
    sget-object p1, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->runtimeProcessName:Ljava/lang/String;

    .line 58
    .line 59
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    const-string v2, "[Hchat:Script] \u5c0f\u7a0b\u5e8f\u8fdb\u7a0b\u63d2\u4ef6\u52a0\u8f7d\u7ebf\u7a0b\u5f02\u5e38: "

    .line 64
    .line 65
    invoke-static {v2, p1, v0, v1, p0}, Leh/a;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 66
    .line 67
    .line 68
    return-void
.end method

.method private final interpreterLock(Lbsh/Interpreter;)Ljava/util/concurrent/locks/ReentrantLock;
    .locals 2

    .line 1
    sget-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->interpreterLocks:Ljava/util/WeakHashMap;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    new-instance v1, Ljava/util/concurrent/locks/ReentrantLock;

    .line 11
    .line 12
    invoke-direct {v1}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception p1

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    :goto_0
    check-cast v1, Ljava/util/concurrent/locks/ReentrantLock;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    monitor-exit v0

    .line 24
    return-object v1

    .line 25
    :goto_1
    monitor-exit v0

    .line 26
    throw p1
.end method

.method private final isMissingCallbackError(Ljava/lang/Throwable;Ljava/lang/String;)Z
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    const-string v1, ""

    .line 13
    .line 14
    :cond_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    const/16 v1, 0xa

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    const/4 v0, 0x1

    .line 42
    invoke-static {p1, p2, v0}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 43
    .line 44
    .line 45
    move-result p2

    .line 46
    const/4 v1, 0x0

    .line 47
    if-nez p2, :cond_2

    .line 48
    .line 49
    return v1

    .line 50
    :cond_2
    const-string p2, "Command not found"

    .line 51
    .line 52
    invoke-static {p1, p2, v0}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 53
    .line 54
    .line 55
    move-result p2

    .line 56
    if-nez p2, :cond_4

    .line 57
    .line 58
    const-string p2, "undefined"

    .line 59
    .line 60
    invoke-static {p1, p2, v0}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 61
    .line 62
    .line 63
    move-result p2

    .line 64
    if-nez p2, :cond_4

    .line 65
    .line 66
    const-string p2, "not found"

    .line 67
    .line 68
    invoke-static {p1, p2, v0}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    if-eqz p1, :cond_3

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_3
    return v1

    .line 76
    :cond_4
    :goto_0
    return v0
.end method

.method private final isPluginDirectory(Ljava/io/File;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/io/File;->isDirectory()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->AGENT_TRANSACTION_DIRECTORY:Log/k;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1}, Log/k;->d(Ljava/lang/String;)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-nez p1, :cond_0

    .line 21
    .line 22
    const/4 p1, 0x1

    .line 23
    return p1

    .line 24
    :cond_0
    const/4 p1, 0x0

    .line 25
    return p1
.end method

.method private final isPluginRuntimeEnabled(Landroid/content/Context;)Z
    .locals 2

    .line 1
    const-string v0, "Hchat_script_plugin_config"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const-string v0, "script_plugin_enable"

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    return p1
.end method

.method private final isScriptApiReady()Z
    .locals 5

    .line 1
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->database()Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const-string v2, "SELECT name FROM sqlite_master WHERE type=\'table\' AND name IN (\'rcontact\',\'chatroom\')"

    .line 9
    .line 10
    invoke-virtual {v0, v2, v1}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->query(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object v0, v1

    .line 16
    :goto_0
    if-nez v0, :cond_1

    .line 17
    .line 18
    sget-object v0, Ltf/t;->g:Ltf/t;

    .line 19
    .line 20
    :cond_1
    new-instance v2, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-eqz v3, :cond_4

    .line 34
    .line 35
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    check-cast v3, Ljava/util/Map;

    .line 40
    .line 41
    const-string v4, "name"

    .line 42
    .line 43
    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    if-eqz v3, :cond_3

    .line 48
    .line 49
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    goto :goto_2

    .line 54
    :cond_3
    move-object v3, v1

    .line 55
    :goto_2
    if-eqz v3, :cond_2

    .line 56
    .line 57
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_4
    invoke-static {v2}, Ltf/m;->U1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    const-string v1, "rcontact"

    .line 66
    .line 67
    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-eqz v1, :cond_5

    .line 72
    .line 73
    const-string v1, "chatroom"

    .line 74
    .line 75
    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-eqz v0, :cond_5

    .line 80
    .line 81
    const/4 v0, 0x1

    .line 82
    return v0

    .line 83
    :cond_5
    const/4 v0, 0x0

    .line 84
    return v0
.end method

.method public static synthetic j(Ljava/util/function/Consumer;ZLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->sendProtobufPacket$lambda$0(Ljava/util/function/Consumer;ZLjava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic k(Lh/Hchat/hooks/items/script/ScriptPluginBridge;Lh/Hchat/hooks/items/script/ScriptMessageBean;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->dispatchOnImageDownload$lambda$2(Lh/Hchat/hooks/items/script/ScriptPluginBridge;Lh/Hchat/hooks/items/script/ScriptMessageBean;Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic l(Ljava/io/File;)Leb/c0;
    .locals 0

    .line 1
    invoke-static {p0}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->listPlugins$lambda$0(Ljava/io/File;)Leb/c0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final listPlugins$lambda$0(Ljava/io/File;)Leb/c0;
    .locals 11

    .line 1
    new-instance v4, Ljava/io/File;

    .line 2
    .line 3
    const-string v0, "main.java"

    .line 4
    .line 5
    invoke-direct {v4, p0, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v4}, Ljava/io/File;->isFile()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x0

    .line 13
    if-eqz v0, :cond_6

    .line 14
    .line 15
    sget-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->INSTANCE:Lh/Hchat/hooks/items/script/ScriptPluginRuntime;

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-direct {v0, p0}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->readPluginMeta(Ljava/io/File;)Ljava/util/Properties;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    move-object v3, v1

    .line 25
    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    const-string v5, "name"

    .line 33
    .line 34
    invoke-virtual {v2, v5}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v6

    .line 38
    if-eqz v6, :cond_1

    .line 39
    .line 40
    invoke-static {v6}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 41
    .line 42
    .line 43
    move-result v7

    .line 44
    if-nez v7, :cond_0

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    move-object v6, v3

    .line 48
    :goto_0
    if-eqz v6, :cond_1

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    :goto_1
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    const-string v7, "author"

    .line 59
    .line 60
    invoke-virtual {v2, v7}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v7

    .line 64
    const-string v8, ""

    .line 65
    .line 66
    if-nez v7, :cond_2

    .line 67
    .line 68
    move-object v7, v8

    .line 69
    :cond_2
    const-string v9, "version"

    .line 70
    .line 71
    invoke-virtual {v2, v9}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v9

    .line 75
    if-nez v9, :cond_3

    .line 76
    .line 77
    move-object v9, v8

    .line 78
    :cond_3
    const-string v10, "updateTime"

    .line 79
    .line 80
    invoke-virtual {v2, v10}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v10

    .line 84
    if-nez v10, :cond_4

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_4
    move-object v8, v10

    .line 88
    :goto_2
    invoke-virtual {v2, v5}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    if-eqz v5, :cond_5

    .line 93
    .line 94
    invoke-static {v5}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 95
    .line 96
    .line 97
    move-result v10

    .line 98
    if-nez v10, :cond_5

    .line 99
    .line 100
    move-object v3, v5

    .line 101
    :cond_5
    move-object v5, v7

    .line 102
    move-object v7, v8

    .line 103
    move-object v8, v3

    .line 104
    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    const-string v10, "process"

    .line 112
    .line 113
    invoke-virtual {v2, v10}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    invoke-direct {v0, v3, v2}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->parseProcessScope(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Set;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    move-object v2, v6

    .line 122
    move-object v6, v9

    .line 123
    move-object v9, v0

    .line 124
    new-instance v0, Leb/c0;

    .line 125
    .line 126
    move-object v3, p0

    .line 127
    invoke-direct/range {v0 .. v9}, Leb/c0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)V

    .line 128
    .line 129
    .line 130
    return-object v0

    .line 131
    :cond_6
    move-object v3, v1

    .line 132
    return-object v3
.end method

.method private final declared-synchronized loadEnabledAppBrandPlugins-gIAlu-s(Landroid/content/Context;Lh/Hchat/hooks/items/script/ScriptPluginBridge;)Ljava/lang/Object;
    .locals 10

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    const-string v0, "Hchat_script_plugin_config"

    .line 3
    .line 4
    invoke-static {p1, v0}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const-string v1, "script_plugin_enable"

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_1

    .line 16
    .line 17
    :cond_0
    move-object v4, p0

    .line 18
    goto/16 :goto_3

    .line 19
    .line 20
    :cond_1
    invoke-virtual {p0, p1}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->listPlugins(Landroid/content/Context;)Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_0

    .line 33
    .line 34
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    move-object v7, v3

    .line 39
    check-cast v7, Leb/c0;

    .line 40
    .line 41
    const-string v3, "appbrand"

    .line 42
    .line 43
    invoke-direct {p0, v7, v3}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->supportsProcess(Leb/c0;Ljava/lang/String;)Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-nez v3, :cond_2

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    iget-object v3, v7, Leb/c0;->a:Ljava/lang/String;

    .line 51
    .line 52
    const-string v4, "script_plugin_item_"

    .line 53
    .line 54
    invoke-virtual {v4, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    invoke-interface {v0, v3, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 59
    .line 60
    .line 61
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 62
    if-nez v3, :cond_3

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_3
    const/4 v8, 0x0

    .line 66
    const/4 v9, 0x0

    .line 67
    move-object v4, p0

    .line 68
    move-object v5, p1

    .line 69
    move-object v6, p2

    .line 70
    :try_start_1
    invoke-direct/range {v4 .. v9}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->loadPlugin-yxL6bBk(Landroid/content/Context;Lh/Hchat/hooks/items/script/ScriptPluginBridge;Leb/c0;ZZ)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    instance-of p2, p1, Lsf/f;

    .line 75
    .line 76
    if-eqz p2, :cond_5

    .line 77
    .line 78
    iget-object p2, v7, Leb/c0;->b:Ljava/lang/String;

    .line 79
    .line 80
    sget-object v3, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->runtimeProcessName:Ljava/lang/String;

    .line 81
    .line 82
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 83
    .line 84
    .line 85
    move-result-object v7

    .line 86
    if-eqz v7, :cond_4

    .line 87
    .line 88
    invoke-virtual {v7}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v7

    .line 92
    goto :goto_2

    .line 93
    :catchall_0
    move-exception v0

    .line 94
    :goto_1
    move-object p1, v0

    .line 95
    goto :goto_4

    .line 96
    :cond_4
    const/4 v7, 0x0

    .line 97
    :goto_2
    new-instance v8, Ljava/lang/StringBuilder;

    .line 98
    .line 99
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 100
    .line 101
    .line 102
    const-string v9, "[Hchat:Script] \u5c0f\u7a0b\u5e8f\u8fdb\u7a0b\u63d2\u4ef6\u52a0\u8f7d\u5931\u8d25: "

    .line 103
    .line 104
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v8, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    const-string p2, " process="

    .line 111
    .line 112
    invoke-virtual {v8, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    const-string p2, " "

    .line 119
    .line 120
    invoke-virtual {v8, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object p2

    .line 130
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    invoke-static {p2, p1}, Lfb/v0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 135
    .line 136
    .line 137
    :cond_5
    move-object p1, v5

    .line 138
    move-object p2, v6

    .line 139
    goto :goto_0

    .line 140
    :catchall_1
    move-exception v0

    .line 141
    move-object v4, p0

    .line 142
    goto :goto_1

    .line 143
    :goto_3
    sget-object p1, Lsf/n;->a:Lsf/n;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 144
    .line 145
    goto :goto_5

    .line 146
    :goto_4
    :try_start_2
    new-instance p2, Lsf/f;

    .line 147
    .line 148
    invoke-direct {p2, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 149
    .line 150
    .line 151
    move-object p1, p2

    .line 152
    :goto_5
    monitor-exit p0

    .line 153
    return-object p1

    .line 154
    :goto_6
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 155
    throw p1

    .line 156
    :catchall_2
    move-exception v0

    .line 157
    move-object p1, v0

    .line 158
    goto :goto_6
.end method

.method private final declared-synchronized loadEnabledPlugins-gIAlu-s(Landroid/content/Context;Lh/Hchat/hooks/items/script/ScriptPluginBridge;)Ljava/lang/Object;
    .locals 13

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p0, p1}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->ensureDirs(Landroid/content/Context;)Ljava/io/File;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0, p1}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->startPluginObservers(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    const-string v0, "Hchat_script_plugin_config"

    .line 9
    .line 10
    invoke-static {p1, v0}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-string v1, "script_plugin_enable"

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    move-object v5, p0

    .line 24
    goto/16 :goto_4

    .line 25
    .line 26
    :cond_0
    invoke-virtual {p0, p1}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->listPlugins(Landroid/content/Context;)Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    const/4 v3, 0x0

    .line 35
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-eqz v4, :cond_5

    .line 40
    .line 41
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    move-object v8, v4

    .line 46
    check-cast v8, Leb/c0;

    .line 47
    .line 48
    const-string v4, "main"

    .line 49
    .line 50
    invoke-direct {p0, v8, v4}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->supportsProcess(Leb/c0;Ljava/lang/String;)Z

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    if-nez v4, :cond_1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    iget-object v4, v8, Leb/c0;->a:Ljava/lang/String;

    .line 58
    .line 59
    const-string v5, "script_plugin_item_"

    .line 60
    .line 61
    invoke-virtual {v5, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    invoke-interface {v0, v4, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 66
    .line 67
    .line 68
    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 69
    if-nez v4, :cond_2

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_2
    const/16 v11, 0x10

    .line 73
    .line 74
    const/4 v12, 0x0

    .line 75
    const/4 v9, 0x0

    .line 76
    const/4 v10, 0x0

    .line 77
    move-object v5, p0

    .line 78
    move-object v6, p1

    .line 79
    move-object v7, p2

    .line 80
    :try_start_1
    invoke-static/range {v5 .. v12}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->loadPlugin-yxL6bBk$default(Lh/Hchat/hooks/items/script/ScriptPluginRuntime;Landroid/content/Context;Lh/Hchat/hooks/items/script/ScriptPluginBridge;Leb/c0;ZZILjava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    instance-of p2, p1, Lsf/f;

    .line 85
    .line 86
    if-eqz p2, :cond_4

    .line 87
    .line 88
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    iget-object v4, v8, Leb/c0;->a:Ljava/lang/String;

    .line 93
    .line 94
    const-string v9, "script_plugin_item_"

    .line 95
    .line 96
    invoke-virtual {v9, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    invoke-interface {p2, v4, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 101
    .line 102
    .line 103
    move-result-object p2

    .line 104
    invoke-interface {p2}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 105
    .line 106
    .line 107
    if-nez v3, :cond_4

    .line 108
    .line 109
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    if-eqz p1, :cond_3

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 117
    .line 118
    iget-object p2, v8, Leb/c0;->b:Ljava/lang/String;

    .line 119
    .line 120
    new-instance v3, Ljava/lang/StringBuilder;

    .line 121
    .line 122
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 123
    .line 124
    .line 125
    const-string v4, "\u63d2\u4ef6\u52a0\u8f7d\u5931\u8d25: "

    .line 126
    .line 127
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object p2

    .line 137
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    :goto_1
    move-object v3, p1

    .line 141
    goto :goto_3

    .line 142
    :catchall_0
    move-exception v0

    .line 143
    :goto_2
    move-object p1, v0

    .line 144
    goto :goto_5

    .line 145
    :cond_4
    :goto_3
    move-object p1, v6

    .line 146
    move-object p2, v7

    .line 147
    goto :goto_0

    .line 148
    :catchall_1
    move-exception v0

    .line 149
    move-object v5, p0

    .line 150
    goto :goto_2

    .line 151
    :cond_5
    move-object v5, p0

    .line 152
    if-nez v3, :cond_6

    .line 153
    .line 154
    :goto_4
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 155
    .line 156
    goto :goto_6

    .line 157
    :cond_6
    throw v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 158
    :goto_5
    :try_start_2
    new-instance p2, Lsf/f;

    .line 159
    .line 160
    invoke-direct {p2, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 161
    .line 162
    .line 163
    move-object p1, p2

    .line 164
    :goto_6
    monitor-exit p0

    .line 165
    return-object p1

    .line 166
    :goto_7
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 167
    throw p1

    .line 168
    :catchall_2
    move-exception v0

    .line 169
    move-object p1, v0

    .line 170
    goto :goto_7
.end method

.method private static final loadEnabledPluginsWhenReady$lambda$0(Landroid/content/Context;)V
    .locals 3

    .line 1
    const-string v0, "[Hchat:Script] \u81ea\u52a8\u52a0\u8f7d\u5df2\u542f\u7528\u63d2\u4ef6\u5931\u8d25: "

    .line 2
    .line 3
    :try_start_0
    sget-object v1, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->INSTANCE:Lh/Hchat/hooks/items/script/ScriptPluginRuntime;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->awaitScriptApiReady(Landroid/content/Context;)Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    invoke-direct {v1, p0}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->isPluginRuntimeEnabled(Landroid/content/Context;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eqz p0, :cond_2

    .line 16
    .line 17
    const-string p0, "[Hchat:Script] \u7b49\u5f85\u8054\u7cfb\u4eba\u6570\u636e\u5e93\u5c31\u7eea\u8d85\u65f6\uff0c\u8df3\u8fc7\u672c\u6b21\u81ea\u52a8\u52a0\u8f7d"

    .line 18
    .line 19
    invoke-static {p0}, Lfb/v0;->m(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    invoke-direct {v1, p0}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->currentBridge(Landroid/content/Context;)Lh/Hchat/hooks/items/script/ScriptPluginBridge;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-direct {v1, p0, v2}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->loadEnabledPlugins-gIAlu-s(Landroid/content/Context;Lh/Hchat/hooks/items/script/ScriptPluginBridge;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    instance-of v1, p0, Lsf/f;

    .line 32
    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    invoke-static {p0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    if-eqz v1, :cond_1

    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    goto :goto_0

    .line 46
    :cond_1
    const/4 v1, 0x0

    .line 47
    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-static {p0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-static {v0, p0}, Lfb/v0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    .line 65
    .line 66
    :cond_2
    return-void

    .line 67
    :catchall_0
    move-exception p0

    .line 68
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    const-string v1, "[Hchat:Script] \u81ea\u52a8\u52a0\u8f7d\u7ebf\u7a0b\u5f02\u5e38: "

    .line 73
    .line 74
    invoke-static {v1, v0, p0}, Leh/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 75
    .line 76
    .line 77
    return-void
.end method

.method private final loadNativeLibrary(Ljava/io/File;Ljava/lang/ClassLoader;)V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    const/16 v2, 0x1d

    .line 5
    .line 6
    const-class v3, Ljava/lang/ClassLoader;

    .line 7
    .line 8
    const-string v4, "nativeLoad"

    .line 9
    .line 10
    const-class v5, Ljava/lang/String;

    .line 11
    .line 12
    const-class v6, Ljava/lang/Runtime;

    .line 13
    .line 14
    if-lt v1, v2, :cond_1

    .line 15
    .line 16
    :try_start_1
    const-class v1, Ljava/lang/Class;

    .line 17
    .line 18
    filled-new-array {v5, v3, v1}, [Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-static {v6, v4, v1}, Lh/Hchat/utils/KavaReflector;->findDeclaredMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    filled-new-array {v2, p2, v0}, [Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    invoke-static {v1, v0, p2}, Lh/Hchat/utils/KavaReflector;->invokeOrThrow(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    goto :goto_1

    .line 41
    :catchall_0
    move-exception p1

    .line 42
    goto/16 :goto_4

    .line 43
    .line 44
    :cond_0
    new-instance p1, Ljava/lang/NoSuchMethodException;

    .line 45
    .line 46
    const-string p2, "Runtime.nativeLoad(String, ClassLoader, Class)"

    .line 47
    .line 48
    invoke-direct {p1, p2}, Ljava/lang/NoSuchMethodException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw p1

    .line 52
    :cond_1
    const/16 v2, 0x1c

    .line 53
    .line 54
    if-lt v1, v2, :cond_3

    .line 55
    .line 56
    filled-new-array {v5, v3}, [Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-static {v6, v4, v1}, Lh/Hchat/utils/KavaReflector;->findDeclaredMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    if-eqz v1, :cond_2

    .line 65
    .line 66
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    filled-new-array {v2, p2}, [Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    invoke-static {v1, v0, p2}, Lh/Hchat/utils/KavaReflector;->invokeOrThrow(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    goto :goto_1

    .line 79
    :cond_2
    new-instance p1, Ljava/lang/NoSuchMethodException;

    .line 80
    .line 81
    const-string p2, "Runtime.nativeLoad(String, ClassLoader)"

    .line 82
    .line 83
    invoke-direct {p1, p2}, Ljava/lang/NoSuchMethodException;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw p1

    .line 87
    :cond_3
    filled-new-array {v5, v3, v5}, [Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-static {v6, v4, v1}, Lh/Hchat/utils/KavaReflector;->findDeclaredMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    if-eqz v1, :cond_9

    .line 96
    .line 97
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    invoke-virtual {p1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    if-eqz v3, :cond_4

    .line 106
    .line 107
    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    goto :goto_0

    .line 112
    :cond_4
    move-object v3, v0

    .line 113
    :goto_0
    filled-new-array {v2, p2, v3}, [Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p2

    .line 117
    invoke-static {v1, v0, p2}, Lh/Hchat/utils/KavaReflector;->invokeOrThrow(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 121
    :goto_1
    instance-of v1, p2, Ljava/lang/String;

    .line 122
    .line 123
    if-eqz v1, :cond_5

    .line 124
    .line 125
    move-object v0, p2

    .line 126
    check-cast v0, Ljava/lang/String;

    .line 127
    .line 128
    :cond_5
    if-eqz v0, :cond_8

    .line 129
    .line 130
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 131
    .line 132
    .line 133
    move-result p2

    .line 134
    if-eqz p2, :cond_6

    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_6
    invoke-static {}, Landroid/os/Process;->is64Bit()Z

    .line 138
    .line 139
    .line 140
    move-result p2

    .line 141
    if-eqz p2, :cond_7

    .line 142
    .line 143
    const-string p2, "arm64-v8a"

    .line 144
    .line 145
    goto :goto_2

    .line 146
    :cond_7
    const-string p2, "armeabi-v7a"

    .line 147
    .line 148
    :goto_2
    new-instance v1, Ljava/lang/UnsatisfiedLinkError;

    .line 149
    .line 150
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    const-string v2, "): "

    .line 155
    .line 156
    const-string v3, ": "

    .line 157
    .line 158
    const-string v4, "SO\u52a0\u8f7d\u5931\u8d25("

    .line 159
    .line 160
    invoke-static {v4, p2, v2, p1, v3}, Lbc/e;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    invoke-direct {v1, p1}, Ljava/lang/UnsatisfiedLinkError;-><init>(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    throw v1

    .line 175
    :cond_8
    :goto_3
    return-void

    .line 176
    :cond_9
    :try_start_2
    new-instance p1, Ljava/lang/NoSuchMethodException;

    .line 177
    .line 178
    const-string p2, "Runtime.nativeLoad(String, ClassLoader, String)"

    .line 179
    .line 180
    invoke-direct {p1, p2}, Ljava/lang/NoSuchMethodException;-><init>(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 184
    :goto_4
    instance-of p2, p1, Ljava/lang/reflect/InvocationTargetException;

    .line 185
    .line 186
    if-eqz p2, :cond_a

    .line 187
    .line 188
    move-object v0, p1

    .line 189
    check-cast v0, Ljava/lang/reflect/InvocationTargetException;

    .line 190
    .line 191
    :cond_a
    if-eqz v0, :cond_b

    .line 192
    .line 193
    invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;

    .line 194
    .line 195
    .line 196
    move-result-object p2

    .line 197
    if-eqz p2, :cond_b

    .line 198
    .line 199
    move-object p1, p2

    .line 200
    :cond_b
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 201
    .line 202
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    const-string v1, "\u65e0\u6cd5\u8c03\u7528Android Native\u52a0\u8f7d\u5165\u53e3: "

    .line 207
    .line 208
    invoke-static {v1, v0}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    invoke-direct {p2, v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 213
    .line 214
    .line 215
    throw p2
.end method

.method private final declared-synchronized loadPlugin-yxL6bBk(Landroid/content/Context;Lh/Hchat/hooks/items/script/ScriptPluginBridge;Leb/c0;ZZ)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p2

    .line 4
    .line 5
    move-object/from16 v4, p3

    .line 6
    .line 7
    const-string v13, "[Hchat:Script] \u63d2\u4ef6\u52a0\u8f7d\u5931\u8d25: "

    .line 8
    .line 9
    const-string v3, "\u8bfb\u53d6\u811a\u672c\u5931\u8d25: "

    .line 10
    .line 11
    monitor-enter p0

    .line 12
    if-eqz p5, :cond_0

    .line 13
    .line 14
    :try_start_0
    invoke-direct {v1}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->isScriptApiReady()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 21
    .line 22
    const-string v2, "\u5fae\u4fe1\u8054\u7cfb\u4eba\u6570\u636e\u5e93\u5c1a\u672a\u5c31\u7eea\uff0c\u8bf7\u7a0d\u540e\u91cd\u8bd5"

    .line 23
    .line 24
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    new-instance v2, Lsf/f;

    .line 28
    .line 29
    invoke-direct {v2, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    .line 32
    monitor-exit p0

    .line 33
    return-object v2

    .line 34
    :catchall_0
    move-exception v0

    .line 35
    goto/16 :goto_3

    .line 36
    .line 37
    :cond_0
    if-eqz p4, :cond_1

    .line 38
    .line 39
    :try_start_1
    iget-object v0, v4, Leb/c0;->a:Ljava/lang/String;

    .line 40
    .line 41
    invoke-direct {v1, v0}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->unloadPlugin-IoAF18A(Ljava/lang/String;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    :cond_1
    sget-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->loadedPlugins:Ljava/util/concurrent/ConcurrentHashMap;

    .line 45
    .line 46
    iget-object v5, v4, Leb/c0;->a:Ljava/lang/String;

    .line 47
    .line 48
    invoke-virtual {v0, v5}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-eqz v0, :cond_2

    .line 53
    .line 54
    sget-object v0, Lsf/n;->a:Lsf/n;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 55
    .line 56
    monitor-exit p0

    .line 57
    return-object v0

    .line 58
    :cond_2
    :try_start_2
    const-string v0, "Hchat_script_plugin_config"

    .line 59
    .line 60
    move-object/from16 v5, p1

    .line 61
    .line 62
    invoke-static {v5, v0}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    const-string v5, "script_plugin_enable"

    .line 67
    .line 68
    const/4 v6, 0x0

    .line 69
    invoke-interface {v0, v5, v6}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 70
    .line 71
    .line 72
    move-result v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 73
    if-eqz v0, :cond_4

    .line 74
    .line 75
    :try_start_3
    iget-object v0, v4, Leb/c0;->d:Ljava/io/File;

    .line 76
    .line 77
    sget-object v5, Log/a;->a:Ljava/nio/charset/Charset;

    .line 78
    .line 79
    invoke-static {v0, v5}, Ldg/l;->h0(Ljava/io/File;Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 83
    goto :goto_0

    .line 84
    :catchall_1
    move-exception v0

    .line 85
    :try_start_4
    new-instance v5, Lsf/f;

    .line 86
    .line 87
    invoke-direct {v5, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 88
    .line 89
    .line 90
    move-object v0, v5

    .line 91
    :goto_0
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    if-nez v5, :cond_3

    .line 96
    .line 97
    check-cast v0, Ljava/lang/String;

    .line 98
    .line 99
    invoke-direct {v1, v2, v4}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->newInterpreter(Lh/Hchat/hooks/items/script/ScriptPluginBridge;Leb/c0;)Lbsh/Interpreter;

    .line 100
    .line 101
    .line 102
    move-result-object v5

    .line 103
    invoke-direct {v1, v5}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->interpreterLock(Lbsh/Interpreter;)Ljava/util/concurrent/locks/ReentrantLock;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 108
    .line 109
    .line 110
    :try_start_5
    iget-object v6, v4, Leb/c0;->d:Ljava/io/File;

    .line 111
    .line 112
    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v6

    .line 116
    invoke-virtual {v5, v6}, Lbsh/Interpreter;->source(Ljava/lang/String;)Ljava/lang/Object;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 117
    .line 118
    .line 119
    :try_start_6
    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 120
    .line 121
    .line 122
    const-string v3, "onLoad"

    .line 123
    .line 124
    invoke-direct {v1, v5, v3}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->callLifecycle(Lbsh/Interpreter;Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    invoke-direct {v1, v0}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->detectCallbacks(Ljava/lang/String;)Leb/y;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-direct {v1, v5}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->detectCallbacks(Lbsh/Interpreter;)Leb/y;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    invoke-virtual {v0, v3}, Leb/y;->a(Leb/y;)Leb/y;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    sget-object v14, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->loadedPlugins:Ljava/util/concurrent/ConcurrentHashMap;

    .line 140
    .line 141
    iget-object v15, v4, Leb/c0;->a:Ljava/lang/String;

    .line 142
    .line 143
    new-instance v3, Leb/a0;

    .line 144
    .line 145
    iget-boolean v6, v0, Leb/y;->a:Z

    .line 146
    .line 147
    iget-boolean v7, v0, Leb/y;->b:Z

    .line 148
    .line 149
    iget-boolean v8, v0, Leb/y;->c:Z

    .line 150
    .line 151
    iget-boolean v9, v0, Leb/y;->d:Z

    .line 152
    .line 153
    iget-boolean v10, v0, Leb/y;->e:Z

    .line 154
    .line 155
    iget-boolean v11, v0, Leb/y;->f:Z

    .line 156
    .line 157
    iget-boolean v12, v0, Leb/y;->g:Z

    .line 158
    .line 159
    invoke-direct/range {v3 .. v12}, Leb/a0;-><init>(Leb/c0;Lbsh/Interpreter;ZZZZZZZ)V

    .line 160
    .line 161
    .line 162
    invoke-interface {v14, v15, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    invoke-direct {v1}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->updateProtobufPacketListener()V

    .line 166
    .line 167
    .line 168
    iget-object v0, v4, Leb/c0;->a:Ljava/lang/String;

    .line 169
    .line 170
    invoke-virtual {v1, v0, v5}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->refreshCallbacks(Ljava/lang/String;Lbsh/Interpreter;)V

    .line 171
    .line 172
    .line 173
    invoke-direct {v1}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->notifyPluginCatalogChanged()V

    .line 174
    .line 175
    .line 176
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 177
    .line 178
    goto :goto_2

    .line 179
    :catchall_2
    move-exception v0

    .line 180
    goto :goto_1

    .line 181
    :catchall_3
    move-exception v0

    .line 182
    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 183
    .line 184
    .line 185
    throw v0

    .line 186
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 187
    .line 188
    invoke-virtual {v5}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v6

    .line 192
    new-instance v7, Ljava/lang/StringBuilder;

    .line 193
    .line 194
    invoke-direct {v7, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v3

    .line 204
    invoke-direct {v0, v3, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 205
    .line 206
    .line 207
    throw v0

    .line 208
    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 209
    .line 210
    const-string v3, "\u811a\u672c\u63d2\u4ef6\u603b\u5f00\u5173\u672a\u5f00\u542f"

    .line 211
    .line 212
    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 216
    :goto_1
    :try_start_7
    new-instance v3, Lsf/f;

    .line 217
    .line 218
    invoke-direct {v3, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 219
    .line 220
    .line 221
    move-object v0, v3

    .line 222
    :goto_2
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 223
    .line 224
    .line 225
    move-result-object v3

    .line 226
    if-eqz v3, :cond_5

    .line 227
    .line 228
    iget-object v5, v4, Leb/c0;->a:Ljava/lang/String;

    .line 229
    .line 230
    invoke-virtual {v2, v5}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->unhookPlugin(Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    iget-object v2, v4, Leb/c0;->b:Ljava/lang/String;

    .line 234
    .line 235
    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v5

    .line 239
    new-instance v6, Ljava/lang/StringBuilder;

    .line 240
    .line 241
    invoke-direct {v6, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    const-string v2, " "

    .line 248
    .line 249
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 253
    .line 254
    .line 255
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v2

    .line 259
    invoke-static {v2, v3}, Lfb/v0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 260
    .line 261
    .line 262
    sget-object v2, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->INSTANCE:Lh/Hchat/hooks/items/script/ScriptPluginRuntime;

    .line 263
    .line 264
    invoke-direct {v2, v4, v3}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->writePluginLoadError(Leb/c0;Ljava/lang/Throwable;)V

    .line 265
    .line 266
    .line 267
    invoke-direct {v2}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->notifyPluginCatalogChanged()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 268
    .line 269
    .line 270
    :cond_5
    monitor-exit p0

    .line 271
    return-object v0

    .line 272
    :goto_3
    :try_start_8
    monitor-exit p0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 273
    throw v0
.end method

.method public static synthetic loadPlugin-yxL6bBk$default(Lh/Hchat/hooks/items/script/ScriptPluginRuntime;Landroid/content/Context;Lh/Hchat/hooks/items/script/ScriptPluginBridge;Leb/c0;ZZILjava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    and-int/lit8 p6, p6, 0x10

    .line 2
    .line 3
    if-eqz p6, :cond_0

    .line 4
    .line 5
    const/4 p5, 0x1

    .line 6
    :cond_0
    move-object v0, p0

    .line 7
    move-object v1, p1

    .line 8
    move-object v2, p2

    .line 9
    move-object v3, p3

    .line 10
    move v4, p4

    .line 11
    move v5, p5

    .line 12
    invoke-direct/range {v0 .. v5}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->loadPlugin-yxL6bBk(Landroid/content/Context;Lh/Hchat/hooks/items/script/ScriptPluginBridge;Leb/c0;ZZ)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method private final logBusySendButtonPlugin(Leb/a0;)V
    .locals 2

    .line 1
    iget-object v0, p1, Leb/a0;->a:Leb/c0;

    .line 2
    .line 3
    iget-object v0, v0, Leb/c0;->a:Ljava/lang/String;

    .line 4
    .line 5
    const-string v1, "busy:"

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object p1, p1, Leb/a0;->a:Leb/c0;

    .line 12
    .line 13
    iget-object p1, p1, Leb/c0;->b:Ljava/lang/String;

    .line 14
    .line 15
    const-string v1, "\u53d1\u9001\u6309\u94ae\u8df3\u8fc7\u5fd9\u788c\u63d2\u4ef6: "

    .line 16
    .line 17
    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-direct {p0, v0, p1}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->logSendButtonDiagnostic(Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method private final logDroppedImageDownload()V
    .locals 12

    .line 1
    sget-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->imageDownloadDroppedCount:Ljava/util/concurrent/atomic/AtomicLong;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->incrementAndGet()J

    .line 4
    .line 5
    .line 6
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 7
    .line 8
    .line 9
    move-result-wide v1

    .line 10
    sget-object v3, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->imageDownloadDropLogAt:Ljava/util/concurrent/atomic/AtomicLong;

    .line 11
    .line 12
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 13
    .line 14
    .line 15
    move-result-wide v4

    .line 16
    const-wide/16 v6, 0x0

    .line 17
    .line 18
    cmp-long v8, v4, v6

    .line 19
    .line 20
    if-eqz v8, :cond_0

    .line 21
    .line 22
    sub-long v8, v1, v4

    .line 23
    .line 24
    const-wide/16 v10, 0x2710

    .line 25
    .line 26
    cmp-long v8, v8, v10

    .line 27
    .line 28
    if-gez v8, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-virtual {v3, v4, v5, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;->compareAndSet(JJ)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-nez v1, :cond_1

    .line 36
    .line 37
    :goto_0
    return-void

    .line 38
    :cond_1
    invoke-virtual {v0, v6, v7}, Ljava/util/concurrent/atomic/AtomicLong;->getAndSet(J)J

    .line 39
    .line 40
    .line 41
    move-result-wide v0

    .line 42
    new-instance v2, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    const-string v3, "[Hchat:Script] \u56fe\u7247\u4e0b\u8f7d\u56de\u8c03\u961f\u5217\u5df2\u6ee1\uff0c\u5df2\u4e22\u5f03 "

    .line 45
    .line 46
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string v0, " \u4e2a\u4e8b\u4ef6"

    .line 53
    .line 54
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-static {v0}, Lfb/v0;->m(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method private final logDroppedProtobufPacket()V
    .locals 12

    .line 1
    sget-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->protobufDroppedPacketCount:Ljava/util/concurrent/atomic/AtomicLong;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->incrementAndGet()J

    .line 4
    .line 5
    .line 6
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 7
    .line 8
    .line 9
    move-result-wide v1

    .line 10
    sget-object v3, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->protobufDropLogAt:Ljava/util/concurrent/atomic/AtomicLong;

    .line 11
    .line 12
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 13
    .line 14
    .line 15
    move-result-wide v4

    .line 16
    const-wide/16 v6, 0x0

    .line 17
    .line 18
    cmp-long v8, v4, v6

    .line 19
    .line 20
    if-eqz v8, :cond_0

    .line 21
    .line 22
    sub-long v8, v1, v4

    .line 23
    .line 24
    const-wide/16 v10, 0x2710

    .line 25
    .line 26
    cmp-long v8, v8, v10

    .line 27
    .line 28
    if-gez v8, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-virtual {v3, v4, v5, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;->compareAndSet(JJ)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-nez v1, :cond_1

    .line 36
    .line 37
    :goto_0
    return-void

    .line 38
    :cond_1
    invoke-virtual {v0, v6, v7}, Ljava/util/concurrent/atomic/AtomicLong;->getAndSet(J)J

    .line 39
    .line 40
    .line 41
    move-result-wide v0

    .line 42
    new-instance v2, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    const-string v3, "[Hchat:Script] \u6570\u636e\u5305\u56de\u8c03\u961f\u5217\u5df2\u6ee1\uff0c\u5df2\u4e22\u5f03 "

    .line 45
    .line 46
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string v0, " \u4e2a\u4e8b\u4ef6"

    .line 53
    .line 54
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-static {v0}, Lfb/v0;->m(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method private final logSendButtonDiagnostic(Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    new-instance v2, Lgg/q;

    .line 6
    .line 7
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    sget-object v3, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->sendButtonDiagnosticLogAt:Ljava/util/concurrent/ConcurrentHashMap;

    .line 11
    .line 12
    new-instance v4, Leb/u;

    .line 13
    .line 14
    const/4 v5, 0x0

    .line 15
    invoke-direct {v4, v0, v1, v2, v5}, Leb/u;-><init>(JLjava/lang/Object;I)V

    .line 16
    .line 17
    .line 18
    new-instance v0, Leb/v;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-direct {v0, v1, v4}, Leb/v;-><init>(ILfg/p;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v3, p1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    iget-boolean p1, v2, Lgg/q;->g:Z

    .line 28
    .line 29
    if-eqz p1, :cond_0

    .line 30
    .line 31
    new-instance p1, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    const-string v0, "[Hchat:Script] "

    .line 34
    .line 35
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-static {p1}, Lfb/v0;->m(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    :cond_0
    return-void
.end method

.method private static final logSendButtonDiagnostic$lambda$0(JLgg/q;Ljava/lang/String;Ljava/lang/Long;)Ljava/lang/Long;
    .locals 4

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-eqz p4, :cond_1

    .line 5
    .line 6
    invoke-virtual {p4}, Ljava/lang/Long;->longValue()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    sub-long v0, p0, v0

    .line 11
    .line 12
    const-wide/16 v2, 0x2710

    .line 13
    .line 14
    cmp-long p3, v0, v2

    .line 15
    .line 16
    if-ltz p3, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    return-object p4

    .line 20
    :cond_1
    :goto_0
    const/4 p3, 0x1

    .line 21
    iput-boolean p3, p2, Lgg/q;->g:Z

    .line 22
    .line 23
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
.end method

.method private static final logSendButtonDiagnostic$lambda$1(Lfg/p;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Long;
    .locals 0

    .line 1
    invoke-interface {p0, p1, p2}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/lang/Long;

    .line 6
    .line 7
    return-object p0
.end method

.method public static synthetic m(Ljava/lang/Runnable;)Ljava/lang/Thread;
    .locals 0

    .line 1
    invoke-static {p0}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->protobufCallbackExecutor$lambda$0(Ljava/lang/Runnable;)Ljava/lang/Thread;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic n(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->reloadPluginFromFileChange$lambda$0(Landroid/content/Context;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final newInterpreter(Lh/Hchat/hooks/items/script/ScriptPluginBridge;Leb/c0;)Lbsh/Interpreter;
    .locals 12

    .line 1
    iget-object v0, p2, Leb/c0;->c:Ljava/io/File;

    .line 2
    .line 3
    new-instance v1, Ljava/io/File;

    .line 4
    .line 5
    invoke-virtual {p1}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->getScriptDir()Ljava/io/File;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-virtual {v2}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {p1}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->getScriptDir()Ljava/io/File;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    :goto_0
    const-string v3, "Cache"

    .line 21
    .line 22
    invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    new-instance v2, Lh/Hchat/hooks/items/script/ScriptWaBridge;

    .line 26
    .line 27
    invoke-direct {v2, p1}, Lh/Hchat/hooks/items/script/ScriptWaBridge;-><init>(Lh/Hchat/hooks/items/script/ScriptPluginBridge;)V

    .line 28
    .line 29
    .line 30
    iget-object v3, p2, Leb/c0;->b:Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {v2, v3, v0}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->bindPluginLog(Ljava/lang/String;Ljava/io/File;)V

    .line 33
    .line 34
    .line 35
    new-instance v3, Lh/Hchat/hooks/items/script/ScriptAudioBridge;

    .line 36
    .line 37
    invoke-direct {v3, p1}, Lh/Hchat/hooks/items/script/ScriptAudioBridge;-><init>(Lh/Hchat/hooks/items/script/ScriptPluginBridge;)V

    .line 38
    .line 39
    .line 40
    const/4 v4, 0x0

    .line 41
    :try_start_0
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->version()Lo8/k;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    if-eqz v5, :cond_1

    .line 46
    .line 47
    invoke-virtual {v5}, Lo8/k;->b()Ll8/i;

    .line 48
    .line 49
    .line 50
    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    goto :goto_2

    .line 52
    :catchall_0
    move-exception v5

    .line 53
    goto :goto_1

    .line 54
    :cond_1
    move-object v5, v4

    .line 55
    goto :goto_2

    .line 56
    :goto_1
    new-instance v6, Lsf/f;

    .line 57
    .line 58
    invoke-direct {v6, v5}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 59
    .line 60
    .line 61
    move-object v5, v6

    .line 62
    :goto_2
    nop

    .line 63
    instance-of v6, v5, Lsf/f;

    .line 64
    .line 65
    if-eqz v6, :cond_2

    .line 66
    .line 67
    move-object v5, v4

    .line 68
    :cond_2
    check-cast v5, Ll8/i;

    .line 69
    .line 70
    if-eqz v5, :cond_3

    .line 71
    .line 72
    goto :goto_4

    .line 73
    :cond_3
    :try_start_1
    invoke-virtual {p1}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->getHostContext()Landroid/content/Context;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    invoke-virtual {p1}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->getClassLoader()Ljava/lang/ClassLoader;

    .line 78
    .line 79
    .line 80
    move-result-object v6

    .line 81
    invoke-static {v5, v6}, Lo8/k;->a(Landroid/content/Context;Ljava/lang/ClassLoader;)Ll8/i;

    .line 82
    .line 83
    .line 84
    move-result-object v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 85
    goto :goto_3

    .line 86
    :catchall_1
    move-exception v5

    .line 87
    new-instance v6, Lsf/f;

    .line 88
    .line 89
    invoke-direct {v6, v5}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 90
    .line 91
    .line 92
    move-object v5, v6

    .line 93
    :goto_3
    nop

    .line 94
    instance-of v6, v5, Lsf/f;

    .line 95
    .line 96
    if-eqz v6, :cond_4

    .line 97
    .line 98
    move-object v5, v4

    .line 99
    :cond_4
    check-cast v5, Ll8/i;

    .line 100
    .line 101
    :goto_4
    if-eqz v5, :cond_5

    .line 102
    .line 103
    iget-object v6, v5, Ll8/i;->d:Ljava/lang/String;

    .line 104
    .line 105
    goto :goto_5

    .line 106
    :cond_5
    move-object v6, v4

    .line 107
    :goto_5
    const-string v7, ""

    .line 108
    .line 109
    if-nez v6, :cond_6

    .line 110
    .line 111
    move-object v6, v7

    .line 112
    :cond_6
    if-eqz v5, :cond_7

    .line 113
    .line 114
    iget-wide v8, v5, Ll8/i;->a:J

    .line 115
    .line 116
    goto :goto_6

    .line 117
    :cond_7
    const-wide/16 v8, 0x0

    .line 118
    .line 119
    :goto_6
    if-eqz v5, :cond_8

    .line 120
    .line 121
    iget-object v5, v5, Ll8/i;->e:Ljava/lang/String;

    .line 122
    .line 123
    goto :goto_7

    .line 124
    :cond_8
    move-object v5, v4

    .line 125
    :goto_7
    if-nez v5, :cond_9

    .line 126
    .line 127
    goto :goto_8

    .line 128
    :cond_9
    move-object v7, v5

    .line 129
    :goto_8
    new-instance v5, Lbsh/Interpreter;

    .line 130
    .line 131
    invoke-direct {v5}, Lbsh/Interpreter;-><init>()V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p1}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->getClassLoader()Ljava/lang/ClassLoader;

    .line 135
    .line 136
    .line 137
    move-result-object v10

    .line 138
    invoke-virtual {v5, v10}, Lbsh/Interpreter;->addClassLoader(Ljava/lang/ClassLoader;)V

    .line 139
    .line 140
    .line 141
    const-string v10, "context"

    .line 142
    .line 143
    invoke-virtual {p1}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->getHostContext()Landroid/content/Context;

    .line 144
    .line 145
    .line 146
    move-result-object v11

    .line 147
    invoke-virtual {v5, v10, v11}, Lbsh/Interpreter;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    const-string v10, "hostContext"

    .line 151
    .line 152
    invoke-virtual {p1}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->getHostContext()Landroid/content/Context;

    .line 153
    .line 154
    .line 155
    move-result-object v11

    .line 156
    invoke-virtual {v5, v10, v11}, Lbsh/Interpreter;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    const-string v10, "classLoader"

    .line 160
    .line 161
    invoke-virtual {p1}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->getClassLoader()Ljava/lang/ClassLoader;

    .line 162
    .line 163
    .line 164
    move-result-object v11

    .line 165
    invoke-virtual {v5, v10, v11}, Lbsh/Interpreter;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {p1}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->getScriptDir()Ljava/io/File;

    .line 169
    .line 170
    .line 171
    move-result-object v10

    .line 172
    invoke-virtual {v10}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v10

    .line 176
    const-string v11, "scriptDir"

    .line 177
    .line 178
    invoke-virtual {v5, v11, v10}, Lbsh/Interpreter;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    const-string v10, "scriptDirFile"

    .line 182
    .line 183
    invoke-virtual {p1}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->getScriptDir()Ljava/io/File;

    .line 184
    .line 185
    .line 186
    move-result-object v11

    .line 187
    invoke-virtual {v5, v10, v11}, Lbsh/Interpreter;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    const-string v10, "pluginDir"

    .line 191
    .line 192
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v11

    .line 196
    invoke-virtual {v5, v10, v11}, Lbsh/Interpreter;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    const-string v10, "pluginDirFile"

    .line 200
    .line 201
    invoke-virtual {v5, v10, v0}, Lbsh/Interpreter;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 202
    .line 203
    .line 204
    const-string v0, "cacheDir"

    .line 205
    .line 206
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v10

    .line 210
    invoke-virtual {v5, v0, v10}, Lbsh/Interpreter;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 211
    .line 212
    .line 213
    const-string v0, "cacheDirFile"

    .line 214
    .line 215
    invoke-virtual {v5, v0, v1}, Lbsh/Interpreter;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 216
    .line 217
    .line 218
    const-string v0, "pluginId"

    .line 219
    .line 220
    iget-object v1, p2, Leb/c0;->a:Ljava/lang/String;

    .line 221
    .line 222
    invoke-virtual {v5, v0, v1}, Lbsh/Interpreter;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    const-string v0, "pluginName"

    .line 226
    .line 227
    iget-object v1, p2, Leb/c0;->b:Ljava/lang/String;

    .line 228
    .line 229
    invoke-virtual {v5, v0, v1}, Lbsh/Interpreter;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 230
    .line 231
    .line 232
    const-string v0, "pluginAuthor"

    .line 233
    .line 234
    iget-object v1, p2, Leb/c0;->e:Ljava/lang/String;

    .line 235
    .line 236
    invoke-virtual {v5, v0, v1}, Lbsh/Interpreter;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 237
    .line 238
    .line 239
    const-string v0, "pluginVersion"

    .line 240
    .line 241
    iget-object v1, p2, Leb/c0;->f:Ljava/lang/String;

    .line 242
    .line 243
    invoke-virtual {v5, v0, v1}, Lbsh/Interpreter;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 244
    .line 245
    .line 246
    const-string v0, "pluginUpdateTime"

    .line 247
    .line 248
    iget-object p2, p2, Leb/c0;->g:Ljava/lang/String;

    .line 249
    .line 250
    invoke-virtual {v5, v0, p2}, Lbsh/Interpreter;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 251
    .line 252
    .line 253
    const-string p2, "processName"

    .line 254
    .line 255
    sget-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->runtimeProcessName:Ljava/lang/String;

    .line 256
    .line 257
    invoke-virtual {v5, p2, v0}, Lbsh/Interpreter;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 258
    .line 259
    .line 260
    const-string p2, "pluginProcess"

    .line 261
    .line 262
    sget-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->runtimeProcess:Ljava/lang/String;

    .line 263
    .line 264
    invoke-virtual {v5, p2, v0}, Lbsh/Interpreter;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 265
    .line 266
    .line 267
    sget-object p2, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->runtimeProcess:Ljava/lang/String;

    .line 268
    .line 269
    const-string v0, "main"

    .line 270
    .line 271
    invoke-static {p2, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 272
    .line 273
    .line 274
    move-result p2

    .line 275
    const-string v0, "isMainProcess"

    .line 276
    .line 277
    invoke-virtual {v5, v0, p2}, Lbsh/Interpreter;->set(Ljava/lang/String;Z)V

    .line 278
    .line 279
    .line 280
    sget-object p2, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->runtimeProcess:Ljava/lang/String;

    .line 281
    .line 282
    const-string v0, "appbrand"

    .line 283
    .line 284
    invoke-static {p2, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 285
    .line 286
    .line 287
    move-result p2

    .line 288
    const-string v0, "isAppBrandProcess"

    .line 289
    .line 290
    invoke-virtual {v5, v0, p2}, Lbsh/Interpreter;->set(Ljava/lang/String;Z)V

    .line 291
    .line 292
    .line 293
    const-string p2, "hostVerName"

    .line 294
    .line 295
    invoke-virtual {v5, p2, v6}, Lbsh/Interpreter;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 296
    .line 297
    .line 298
    const-string p2, "hostVerCode"

    .line 299
    .line 300
    invoke-virtual {v5, p2, v8, v9}, Lbsh/Interpreter;->set(Ljava/lang/String;J)V

    .line 301
    .line 302
    .line 303
    const-string p2, "hostVerClient"

    .line 304
    .line 305
    invoke-virtual {v5, p2, v7}, Lbsh/Interpreter;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 306
    .line 307
    .line 308
    const-string p2, "moduleVer"

    .line 309
    .line 310
    const-string v0, "5.5.6"

    .line 311
    .line 312
    invoke-virtual {v5, p2, v0}, Lbsh/Interpreter;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 313
    .line 314
    .line 315
    const-string p2, "bridge"

    .line 316
    .line 317
    invoke-virtual {v5, p2, p1}, Lbsh/Interpreter;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 318
    .line 319
    .line 320
    const-string p2, "wa"

    .line 321
    .line 322
    invoke-virtual {v5, p2, v2}, Lbsh/Interpreter;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 323
    .line 324
    .line 325
    const-string p2, "waBridge"

    .line 326
    .line 327
    invoke-virtual {v5, p2, v2}, Lbsh/Interpreter;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 328
    .line 329
    .line 330
    const-string p2, "audio"

    .line 331
    .line 332
    invoke-virtual {v5, p2, v3}, Lbsh/Interpreter;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 333
    .line 334
    .line 335
    const-string p2, "audioBridge"

    .line 336
    .line 337
    invoke-virtual {v5, p2, v3}, Lbsh/Interpreter;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 338
    .line 339
    .line 340
    const-string p2, "http"

    .line 341
    .line 342
    invoke-virtual {v5, p2, v2}, Lbsh/Interpreter;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 343
    .line 344
    .line 345
    const-string p2, "httpClient"

    .line 346
    .line 347
    invoke-virtual {v5, p2, v2}, Lbsh/Interpreter;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 348
    .line 349
    .line 350
    const-string p2, "__hchat_runtime"

    .line 351
    .line 352
    sget-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->INSTANCE:Lh/Hchat/hooks/items/script/ScriptPluginRuntime;

    .line 353
    .line 354
    invoke-virtual {v5, p2, v0}, Lbsh/Interpreter;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 355
    .line 356
    .line 357
    const-string p2, "__hchat_interpreter"

    .line 358
    .line 359
    invoke-virtual {v5, p2, v5}, Lbsh/Interpreter;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 360
    .line 361
    .line 362
    const-string p2, "apis"

    .line 363
    .line 364
    invoke-virtual {p1}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->getApis()Ljava/lang/Class;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    invoke-virtual {v5, p2, v0}, Lbsh/Interpreter;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 369
    .line 370
    .line 371
    const-string p2, "dexKit"

    .line 372
    .line 373
    invoke-virtual {p1}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->getDexKit()Lh/Hchat/hooks/items/script/ScriptDexKitBridge;

    .line 374
    .line 375
    .line 376
    move-result-object v0

    .line 377
    invoke-virtual {v5, p2, v0}, Lbsh/Interpreter;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 378
    .line 379
    .line 380
    invoke-virtual {p1}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->getDexKit()Lh/Hchat/hooks/items/script/ScriptDexKitBridge;

    .line 381
    .line 382
    .line 383
    move-result-object p2

    .line 384
    if-eqz p2, :cond_a

    .line 385
    .line 386
    invoke-virtual {p2}, Lh/Hchat/hooks/items/script/ScriptDexKitBridge;->bridge()Lorg/luckypray/dexkit/DexKitBridge;

    .line 387
    .line 388
    .line 389
    move-result-object p2

    .line 390
    goto :goto_9

    .line 391
    :cond_a
    move-object p2, v4

    .line 392
    :goto_9
    const-string v0, "dexKitBridge"

    .line 393
    .line 394
    invoke-virtual {v5, v0, p2}, Lbsh/Interpreter;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 395
    .line 396
    .line 397
    invoke-virtual {p1}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->getDexKit()Lh/Hchat/hooks/items/script/ScriptDexKitBridge;

    .line 398
    .line 399
    .line 400
    move-result-object p2

    .line 401
    if-eqz p2, :cond_b

    .line 402
    .line 403
    invoke-virtual {p2}, Lh/Hchat/hooks/items/script/ScriptDexKitBridge;->holder()Lh/Hchat/dexkit/DexBridgeHolder;

    .line 404
    .line 405
    .line 406
    move-result-object p2

    .line 407
    if-eqz p2, :cond_b

    .line 408
    .line 409
    invoke-virtual {p2}, Lh/Hchat/dexkit/DexBridgeHolder;->getDexFinder()Lh/Hchat/dexkit/DexFinder;

    .line 410
    .line 411
    .line 412
    move-result-object p2

    .line 413
    goto :goto_a

    .line 414
    :cond_b
    move-object p2, v4

    .line 415
    :goto_a
    const-string v0, "dexFinder"

    .line 416
    .line 417
    invoke-virtual {v5, v0, p2}, Lbsh/Interpreter;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 418
    .line 419
    .line 420
    invoke-virtual {p1}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->getDexKit()Lh/Hchat/hooks/items/script/ScriptDexKitBridge;

    .line 421
    .line 422
    .line 423
    move-result-object p1

    .line 424
    if-eqz p1, :cond_c

    .line 425
    .line 426
    invoke-virtual {p1}, Lh/Hchat/hooks/items/script/ScriptDexKitBridge;->holder()Lh/Hchat/dexkit/DexBridgeHolder;

    .line 427
    .line 428
    .line 429
    move-result-object v4

    .line 430
    :cond_c
    const-string p1, "dexBridgeHolder"

    .line 431
    .line 432
    invoke-virtual {v5, p1, v4}, Lbsh/Interpreter;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 433
    .line 434
    .line 435
    const-string p1, "WeChatApisClass"

    .line 436
    .line 437
    const-class p2, Lh/Hchat/hooks/api/core/WeChatApis;

    .line 438
    .line 439
    invoke-virtual {v5, p1, p2}, Lbsh/Interpreter;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 440
    .line 441
    .line 442
    const-string p1, "XposedBridgeClass"

    .line 443
    .line 444
    const-class p2, Lde/robv/android/xposed/XposedBridge;

    .line 445
    .line 446
    invoke-virtual {v5, p1, p2}, Lbsh/Interpreter;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 447
    .line 448
    .line 449
    const-string p1, "XposedHelpersClass"

    .line 450
    .line 451
    const-class p2, Lde/robv/android/xposed/XposedHelpers;

    .line 452
    .line 453
    invoke-virtual {v5, p1, p2}, Lbsh/Interpreter;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 454
    .line 455
    .line 456
    const-string p1, "XC_MethodHookClass"

    .line 457
    .line 458
    const-class p2, Lde/robv/android/xposed/XC_MethodHook;

    .line 459
    .line 460
    invoke-virtual {v5, p1, p2}, Lbsh/Interpreter;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 461
    .line 462
    .line 463
    const-string p1, "DexKitBridgeClass"

    .line 464
    .line 465
    const-class p2, Lorg/luckypray/dexkit/DexKitBridge;

    .line 466
    .line 467
    invoke-virtual {v5, p1, p2}, Lbsh/Interpreter;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 468
    .line 469
    .line 470
    const-string p1, "DexFinderClass"

    .line 471
    .line 472
    const-class p2, Lh/Hchat/dexkit/DexFinder;

    .line 473
    .line 474
    invoke-virtual {v5, p1, p2}, Lbsh/Interpreter;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 475
    .line 476
    .line 477
    const-string p1, "DexBridgeHolderClass"

    .line 478
    .line 479
    const-class p2, Lh/Hchat/dexkit/DexBridgeHolder;

    .line 480
    .line 481
    invoke-virtual {v5, p1, p2}, Lbsh/Interpreter;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 482
    .line 483
    .line 484
    const-string p1, "KavaReflectorClass"

    .line 485
    .line 486
    const-class p2, Lh/Hchat/utils/KavaReflector;

    .line 487
    .line 488
    invoke-virtual {v5, p1, p2}, Lbsh/Interpreter;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 489
    .line 490
    .line 491
    const-string p1, "ScriptAudioBridgeClass"

    .line 492
    .line 493
    const-class p2, Lh/Hchat/hooks/items/script/ScriptAudioBridge;

    .line 494
    .line 495
    invoke-virtual {v5, p1, p2}, Lbsh/Interpreter;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 496
    .line 497
    .line 498
    const-string p1, "SilkCodecClass"

    .line 499
    .line 500
    const-class p2, Lme/yun/silk/SilkCodec;

    .line 501
    .line 502
    invoke-virtual {v5, p1, p2}, Lbsh/Interpreter;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 503
    .line 504
    .line 505
    const-string p1, "AacCodecClass"

    .line 506
    .line 507
    const-class p2, Lme/yun/silk/AacCodec;

    .line 508
    .line 509
    invoke-virtual {v5, p1, p2}, Lbsh/Interpreter;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 510
    .line 511
    .line 512
    const-string p1, "ConversionClass"

    .line 513
    .line 514
    const-class p2, Lme/yun/silk/utils/Conversion;

    .line 515
    .line 516
    invoke-virtual {v5, p1, p2}, Lbsh/Interpreter;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 517
    .line 518
    .line 519
    const-string p1, "FieldClass"

    .line 520
    .line 521
    const-class p2, Ljava/lang/reflect/Field;

    .line 522
    .line 523
    invoke-virtual {v5, p1, p2}, Lbsh/Interpreter;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 524
    .line 525
    .line 526
    const-string p1, "MethodClass"

    .line 527
    .line 528
    const-class p2, Ljava/lang/reflect/Method;

    .line 529
    .line 530
    invoke-virtual {v5, p1, p2}, Lbsh/Interpreter;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 531
    .line 532
    .line 533
    const-string p1, "ConstructorClass"

    .line 534
    .line 535
    const-class p2, Ljava/lang/reflect/Constructor;

    .line 536
    .line 537
    invoke-virtual {v5, p1, p2}, Lbsh/Interpreter;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 538
    .line 539
    .line 540
    new-instance p1, Ljava/text/SimpleDateFormat;

    .line 541
    .line 542
    const-string p2, "yyyy-MM-dd HH:mm:ss"

    .line 543
    .line 544
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 545
    .line 546
    invoke-direct {p1, p2, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 547
    .line 548
    .line 549
    new-instance p2, Ljava/util/Date;

    .line 550
    .line 551
    invoke-direct {p2}, Ljava/util/Date;-><init>()V

    .line 552
    .line 553
    .line 554
    invoke-virtual {p1, p2}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 555
    .line 556
    .line 557
    move-result-object p1

    .line 558
    const-string p2, "startedAt"

    .line 559
    .line 560
    invoke-virtual {v5, p2, p1}, Lbsh/Interpreter;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 561
    .line 562
    .line 563
    const-string p1, "import de.robv.android.xposed.XC_MethodHook;\nimport de.robv.android.xposed.XposedBridge;\nimport de.robv.android.xposed.XposedHelpers;\nimport h.Hchat.dexkit.DexBridgeHolder;\nimport h.Hchat.dexkit.DexFinder;\nimport h.Hchat.hooks.api.core.WeChatApis;\nimport h.Hchat.hooks.items.script.ScriptDexKitBridge;\nimport h.Hchat.hooks.items.script.ScriptPluginBridge;\nimport h.Hchat.hooks.items.script.ScriptAudioBridge;\nimport h.Hchat.hooks.items.script.ScriptWaBridge;\nimport h.Hchat.hooks.api.model.ContactLabelBean;\nimport h.Hchat.utils.KavaReflector;\nimport java.io.File;\nimport java.io.InputStream;\nimport java.lang.reflect.Constructor;\nimport java.lang.reflect.Field;\nimport org.luckypray.dexkit.DexKitBridge;\nimport java.lang.reflect.Member;\nimport java.lang.reflect.Method;\nimport java.util.Map;\nimport java.util.List;\nimport java.util.Set;\nimport java.util.function.Consumer;\nimport java.util.function.Function;\nimport android.content.ContentValues;\nimport android.database.Cursor;\nimport android.view.View;\nimport me.hd.wauxv.data.bean.MsgInfoBean;\nimport me.hd.wauxv.plugin.api.callback.PluginCallBack;\nimport me.yun.silk.AacCodec;\nimport me.yun.silk.SilkCodec;\nimport me.yun.silk.utils.Conversion;\nvoid log(Object msg) { bridge.log(pluginName, pluginDirFile, msg); }\nvoid toast(Object msg) { bridge.toast(pluginName, msg); }\nboolean showModuleDialog(String title, String message) { return bridge.showModuleDialog(title, message); }\nboolean showModuleDialog(String title, String message, String position) { return bridge.showModuleDialog(title, message, position); }\nboolean showModuleConfirmDialog(String title, String message, Consumer callback) { return bridge.showModuleConfirmDialog(title, message, callback); }\nboolean showModuleConfirmDialog(String title, String message, String position, Consumer callback) { return bridge.showModuleConfirmDialog(title, message, position, callback); }\nboolean showModuleInputDialog(String title, String summary, String initialValue, String placeholder, Consumer callback) { return bridge.showModuleInputDialog(title, summary, initialValue, placeholder, callback); }\nboolean showModuleInputDialog(String title, String summary, String initialValue, String placeholder, String position, Consumer callback) { return bridge.showModuleInputDialog(title, summary, initialValue, placeholder, position, callback); }\nboolean showModuleChoiceDialog(String title, String summary, List choices, Consumer callback) { return bridge.showModuleChoiceDialog(title, summary, choices, callback); }\nboolean showModuleChoiceDialog(String title, String summary, List choices, String position, Consumer callback) { return bridge.showModuleChoiceDialog(title, summary, choices, position, callback); }\nboolean showModuleMultiChoiceDialog(String title, String summary, List choices, Set initialSelected, Consumer callback) { return bridge.showModuleMultiChoiceDialog(title, summary, choices, initialSelected, callback); }\nboolean showModuleMultiChoiceDialog(String title, String summary, List choices, Set initialSelected, String position, Consumer callback) { return bridge.showModuleMultiChoiceDialog(title, summary, choices, initialSelected, position, callback); }\nObject applyModuleFloatingGlassBar(View bottomBar) { return bridge.applyModuleFloatingGlassBar(pluginId, bottomBar); }\nObject applyModuleFloatingGlassBar(View bottomBar, Map options) { return bridge.applyModuleFloatingGlassBar(pluginId, bottomBar, options); }\nString getString(String key, String __hchat_default_string) { return bridge.getString(pluginDirFile, key, __hchat_default_string); }\nSet getStringSet(String key, Set __hchat_default_set) { return bridge.getStringSet(pluginDirFile, key, __hchat_default_set); }\nboolean getBoolean(String key, boolean __hchat_default_boolean) { return bridge.getBoolean(pluginDirFile, key, __hchat_default_boolean); }\nint getInt(String key, int __hchat_default_int) { return bridge.getInt(pluginDirFile, key, __hchat_default_int); }\nfloat getFloat(String key, float __hchat_default_float) { return bridge.getFloat(pluginDirFile, key, __hchat_default_float); }\nlong getLong(String key, long __hchat_default_long) { return bridge.getLong(pluginDirFile, key, __hchat_default_long); }\nvoid putString(String key, String value) { bridge.putString(pluginDirFile, key, value); }\nvoid putStringSet(String key, Set value) { bridge.putStringSet(pluginDirFile, key, value); }\nvoid putBoolean(String key, boolean value) { bridge.putBoolean(pluginDirFile, key, value); }\nvoid putInt(String key, int value) { bridge.putInt(pluginDirFile, key, value); }\nvoid putFloat(String key, float value) { bridge.putFloat(pluginDirFile, key, value); }\nvoid putLong(String key, long value) { bridge.putLong(pluginDirFile, key, value); }\nClass findClass(String className) { return bridge.findClass(className); }\nObject findClassList(String usingString) { return dexKit == null ? new java.util.ArrayList() : dexKit.findClassList(usingString); }\nObject findClassList(String[] usingStrings) { return dexKit == null ? new java.util.ArrayList() : dexKit.findClassList(usingStrings); }\nObject findClassList(Object[] usingStrings) { return dexKit == null ? new java.util.ArrayList() : dexKit.findClassList(usingStrings); }\nObject findClassList(List usingStrings) { return dexKit == null ? new java.util.ArrayList() : dexKit.findClassList(usingStrings); }\nObject findClassList(Object usingStrings) { return dexKit == null ? new java.util.ArrayList() : dexKit.findClassList(usingStrings); }\nObject findMemberList(String usingString) { return dexKit == null ? new java.util.ArrayList() : dexKit.findMemberList(usingString); }\nObject findMemberList(String[] usingStrings) { return dexKit == null ? new java.util.ArrayList() : dexKit.findMemberList(usingStrings); }\nObject findMemberList(Object[] usingStrings) { return dexKit == null ? new java.util.ArrayList() : dexKit.findMemberList(usingStrings); }\nObject findMemberList(List usingStrings) { return dexKit == null ? new java.util.ArrayList() : dexKit.findMemberList(usingStrings); }\nObject findMemberList(Object usingStrings) { return dexKit == null ? new java.util.ArrayList() : dexKit.findMemberList(usingStrings); }\nMethod firstMethod(Object instance, String methodName) { return bridge.firstMethod(instance, methodName); }\nMethod firstMethod(Object instance, String methodName, int paramCount) { return bridge.firstMethod(instance, methodName, paramCount); }\nConstructor firstConstructor(Object instance, int paramCount) { return bridge.firstConstructor(instance, paramCount); }\nField firstField(Object instance, String fieldName) { return bridge.firstField(instance, fieldName); }\nObject invokeMethod(Object instance, String methodName) { return bridge.invokeMethod(instance, methodName); }\nObject invokeMethod(Object instance, String methodName, Object[] params) { return bridge.invokeMethod(instance, methodName, params); }\nObject invokeMethod(Object instance, String methodName, int paramCount) { return bridge.invokeMethod(instance, methodName, paramCount); }\nObject invokeMethod(Object instance, String methodName, int paramCount, Object[] params) { return bridge.invokeMethod(instance, methodName, paramCount, params); }\nObject createInstance(Object instance, int paramCount) { return bridge.createInstance(instance, paramCount); }\nObject createInstance(Object instance, int paramCount, Object[] params) { return bridge.createInstance(instance, paramCount, params); }\nObject getField(Object instance, String fieldName) { return bridge.getField(instance, fieldName); }\nvoid setField(Object instance, String fieldName, Object value) { bridge.setField(instance, fieldName, value); }\nObject hookBefore(Member member, Consumer callback) { return bridge.hookBefore(pluginId, member, callback); }\nObject hookAfter(Member member, Consumer callback) { return bridge.hookAfter(pluginId, member, callback); }\nObject hookReplace(Member member, Function callback) { return bridge.hookReplace(pluginId, member, callback); }\nvoid unhook(Object handle) { bridge.unhook(pluginId, handle); }\nvoid reloadPlugin() { __hchat_runtime.reloadPluginAsync(hostContext, pluginId); }\nString compileSnapshot(String path) { return __hchat_runtime.compileSnapshot(pluginId, pluginDirFile, __hchat_interpreter, path); }\nObject evalSnapshot(String path) { return __hchat_runtime.evalSnapshot(pluginId, pluginDirFile, __hchat_interpreter, path); }\nObject evalSnapshot(InputStream inputStream) { return __hchat_runtime.evalSnapshot(pluginId, __hchat_interpreter, inputStream); }\nObject evalSnapshot(byte[] data) { return __hchat_runtime.evalSnapshot(pluginId, __hchat_interpreter, data); }\nvoid eval(String code) { __hchat_runtime.evalCode(pluginId, __hchat_interpreter, code); }\nvoid loadJava(String path) { __hchat_runtime.loadJava(pluginId, pluginDirFile, __hchat_interpreter, path); }\nvoid useCallback(String callbackName, String methodName) { __hchat_runtime.useCallback(pluginId, __hchat_interpreter, callbackName, methodName); }\nvoid useOnLoad(String methodName) { __hchat_runtime.useCallback(pluginId, __hchat_interpreter, \"onLoad\", methodName); }\nvoid useOnUnload(String methodName) { __hchat_runtime.useCallback(pluginId, __hchat_interpreter, \"onUnload\", methodName); }\nvoid useOpenSettings(String methodName) { __hchat_runtime.useCallback(pluginId, __hchat_interpreter, \"openSettings\", methodName); }\nvoid useOnClickSendBtn(String methodName) { __hchat_runtime.useCallback(pluginId, __hchat_interpreter, \"onClickSendBtn\", methodName); }\nvoid useOnHandleMsg(String methodName) { __hchat_runtime.useCallback(pluginId, __hchat_interpreter, \"onHandleMsg\", methodName); }\nvoid useOnImageDownload(String methodName) { __hchat_runtime.useCallback(pluginId, __hchat_interpreter, \"onImageDownload\", methodName); }\nvoid useOnMemberChange(String methodName) { __hchat_runtime.useCallback(pluginId, __hchat_interpreter, \"onMemberChange\", methodName); }\nvoid useOnNewFriend(String methodName) { __hchat_runtime.useCallback(pluginId, __hchat_interpreter, \"onNewFriend\", methodName); }\nvoid useOnProtobufPacket(String methodName) { __hchat_runtime.useCallback(pluginId, __hchat_interpreter, \"onProtobufPacket\", methodName); }\nClassLoader loadDex(String path) { return __hchat_runtime.loadDex(pluginId, pluginDirFile, __hchat_interpreter, classLoader, path); }\nvoid loadSo(String path) { __hchat_runtime.loadSo(pluginId, pluginDirFile, classLoader, path); }\nvoid loadSo(String path, ClassLoader loader) { __hchat_runtime.loadSo(pluginId, pluginDirFile, loader, path); }\nString getLoginWxid() { return wa.getLoginWxid(); }\nString getLoginAlias() { return wa.getLoginAlias(); }\nString getTargetTalker() { return wa.getTargetTalker(); }\nandroid.app.Activity getTopActivity() { return wa.getTopActivity(); }\nObject getDatabaseApi() { return wa.getDatabaseApi(); }\nObject getOfficialList() { return wa.getOfficialList(); }\nObject getFriendList() { return wa.getFriendList(); }\nObject getFriendListInfo() { return wa.getFriendListInfo(); }\nObject getGroupList() { return wa.getGroupList(); }\nObject getGroupListInfo() { return wa.getGroupListInfo(); }\nObject getGroupMemberListInfo(String groupWxid) { return wa.getGroupMemberListInfo(groupWxid); }\nList getContactLabelList() { return wa.getContactLabelList(); }\nList getContactLabelListInfo() { return wa.getContactLabelListInfo(); }\nList getContactByLabelId(String labelId) { return wa.getContactByLabelId(labelId); }\nList getContactByLabelName(String labelName) { return wa.getContactByLabelName(labelName); }\nString addContactLabel(String labelName) { return wa.addContactLabel(labelName); }\nvoid modifyContactLabelList(String username, String labelName) { wa.modifyContactLabelList(username, labelName); }\nvoid modifyContactLabelList(String username, List labelNames) { wa.modifyContactLabelList(username, labelNames); }\nvoid verifyUser(String wxid, String ticket, int scene) { wa.verifyUser(wxid, ticket, scene); }\nvoid verifyUser(String wxid, String ticket, int scene, int privacy) { wa.verifyUser(wxid, ticket, scene, privacy); }\nObject getGroupMemberList(String groupWxid) { return wa.getGroupMemberList(groupWxid); }\nint getGroupMemberCount(String groupWxid) { return wa.getGroupMemberCount(groupWxid); }\nString getGroupName(String groupWxid) { return wa.getGroupName(groupWxid); }\nString getChatroomName(String chatroomId) { return wa.getChatroomName(chatroomId); }\nString getGroupRemarkName(String groupWxid) { return wa.getGroupRemarkName(groupWxid); }\nString getGroupMemberName(String groupWxid, String memberWxid) { return wa.getGroupMemberName(groupWxid, memberWxid); }\nString getGroupNickName(String groupWxid, String memberWxid) { return wa.getGroupNickName(groupWxid, memberWxid); }\nString getFriendNickName(String friendWxid) { return wa.getFriendNickName(friendWxid); }\nString getFriendRemarkName(String friendWxid) { return wa.getFriendRemarkName(friendWxid); }\nint getFriendGender(String friendWxid) { return wa.getFriendGender(friendWxid); }\nString getFriendProvince(String friendWxid) { return wa.getFriendProvince(friendWxid); }\nString getFriendCity(String friendWxid) { return wa.getFriendCity(friendWxid); }\nString getFriendRegion(String friendWxid) { return wa.getFriendRegion(friendWxid); }\nString getFriendDisplayName(String friendWxid, String roomId) { return wa.getFriendDisplayName(friendWxid, roomId); }\nString getFriendName(String friendWxid) { return wa.getFriendName(friendWxid); }\nString getFriendName(String friendWxid, String roomId) { return wa.getFriendName(friendWxid, roomId); }\nint getGroupMemberGender(String groupWxid, String memberWxid) { return wa.getGroupMemberGender(groupWxid, memberWxid); }\nString getGroupMemberProvince(String groupWxid, String memberWxid) { return wa.getGroupMemberProvince(groupWxid, memberWxid); }\nString getGroupMemberCity(String groupWxid, String memberWxid) { return wa.getGroupMemberCity(groupWxid, memberWxid); }\nString getGroupMemberRegion(String groupWxid, String memberWxid) { return wa.getGroupMemberRegion(groupWxid, memberWxid); }\nvoid addChatroomMember(String chatroomId, String addMember) { wa.addChatroomMember(chatroomId, addMember); }\nvoid addChatroomMember(String chatroomId, List addMemberList) { wa.addChatroomMember(chatroomId, addMemberList); }\nvoid inviteChatroomMember(String chatroomId, String inviteMember) { wa.inviteChatroomMember(chatroomId, inviteMember); }\nvoid inviteChatroomMember(String chatroomId, List inviteMemberList) { wa.inviteChatroomMember(chatroomId, inviteMemberList); }\nvoid delChatroomMember(String chatroomId, String delMember) { wa.delChatroomMember(chatroomId, delMember); }\nvoid delChatroomMember(String chatroomId, List delMemberList) { wa.delChatroomMember(chatroomId, delMemberList); }\nString getAvatarUrl(String username) { return wa.getAvatarUrl(username); }\nString getAvatarUrl(String username, boolean isBigHeadImg) { return wa.getAvatarUrl(username, isBigHeadImg); }\nvoid sendText(String talker, String content) { wa.sendText(talker, content); }\nvoid sendText(String talker, String content, Consumer callback) { wa.sendText(talker, content, callback); }\nboolean sendProtobufPacket(String uri, int cgiId, String json) { return __hchat_runtime.sendProtobufPacket(uri, cgiId, json, null); }\nboolean sendProtobufPacket(String uri, int cgiId, String json, Consumer callback) { return __hchat_runtime.sendProtobufPacket(uri, cgiId, json, callback); }\nboolean sendProtobufPacket(String uri, int cgiId, JSONObject json) { return __hchat_runtime.sendProtobufPacket(uri, cgiId, json == null ? \"{}\" : json.toString(), null); }\nboolean sendProtobufPacket(String uri, int cgiId, JSONObject json, Consumer callback) { return __hchat_runtime.sendProtobufPacket(uri, cgiId, json == null ? \"{}\" : json.toString(), callback); }\nboolean sendProtobufPacket(String uri, int cgiId, int funcId, int routeId, String json) { return __hchat_runtime.sendProtobufPacket(uri, cgiId, funcId, routeId, json, null); }\nboolean sendProtobufPacket(String uri, int cgiId, int funcId, int routeId, String json, Consumer callback) { return __hchat_runtime.sendProtobufPacket(uri, cgiId, funcId, routeId, json, callback); }\nboolean sendProtobufPacket(String uri, int cgiId, int funcId, int routeId, JSONObject json) { return __hchat_runtime.sendProtobufPacket(uri, cgiId, funcId, routeId, json == null ? \"{}\" : json.toString(), null); }\nboolean sendProtobufPacket(String uri, int cgiId, int funcId, int routeId, JSONObject json, Consumer callback) { return __hchat_runtime.sendProtobufPacket(uri, cgiId, funcId, routeId, json == null ? \"{}\" : json.toString(), callback); }\nvoid sendQuoteMsg(String talker, long msgId, String content) { wa.sendQuoteMsg(talker, msgId, content); }\nvoid sendQuoteMsg(String talker, String content, long msgId) { wa.sendQuoteMsg(talker, content, msgId); }\nvoid revokeMsg(long msgId) { wa.revokeMsg(msgId); }\nvoid uploadDeviceStep(long step) { wa.uploadDeviceStep(step); }\nObject getSnsPostList() { return wa.getSnsPostList(); }\nObject getSnsPostList(int limit) { return wa.getSnsPostList(limit); }\nObject getSnsPostList(String userName, int limit) { return wa.getSnsPostList(userName, limit); }\nObject getSnsPost(String snsId) { return wa.getSnsPost(snsId); }\nboolean prepareSnsPostMedia(String snsId, Consumer callback) { return __hchat_runtime.prepareSnsPostMedia(pluginId, __hchat_interpreter, snsId, callback); }\nboolean publishSnsPost(Object prepared) { return wa.publishSnsPost(prepared); }\nboolean refreshSnsTimeline() { return wa.refreshSnsTimeline(); }\nvoid uploadText(String content) { wa.uploadText(content); }\nvoid uploadText(String content, String sdkId, String sdkAppName) { wa.uploadText(content, sdkId, sdkAppName); }\nvoid uploadText(JSONObject jsonObj) { wa.uploadText(jsonObj); }\nvoid uploadTextAndPicList(String content, String picPath) { wa.uploadTextAndPicList(content, picPath); }\nvoid uploadTextAndPicList(String content, String picPath, String sdkId, String sdkAppName) { wa.uploadTextAndPicList(content, picPath, sdkId, sdkAppName); }\nvoid uploadTextAndPicList(String content, List picPathList) { wa.uploadTextAndPicList(content, picPathList); }\nvoid uploadTextAndPicList(String content, List picPathList, String sdkId, String sdkAppName) { wa.uploadTextAndPicList(content, picPathList, sdkId, sdkAppName); }\nvoid uploadTextAndPicList(JSONObject jsonObj) { wa.uploadTextAndPicList(jsonObj); }\nvoid uploadLivePhoto(String livePhotoPath) { wa.uploadLivePhoto(livePhotoPath); }\nvoid uploadLivePhoto(String imagePath, String videoPath) { wa.uploadLivePhoto(imagePath, videoPath); }\nvoid uploadLivePhoto(JSONObject jsonObj) { wa.uploadLivePhoto(jsonObj); }\nvoid uploadTextAndLivePhoto(String content, String livePhotoPath) { wa.uploadTextAndLivePhoto(content, livePhotoPath); }\nvoid uploadTextAndLivePhoto(String content, String livePhotoPath, String sdkId, String sdkAppName) { wa.uploadTextAndLivePhoto(content, livePhotoPath, sdkId, sdkAppName); }\nvoid uploadTextAndLivePhoto(String content, String imagePath, String videoPath) { wa.uploadTextAndLivePhoto(content, imagePath, videoPath); }\nvoid uploadTextAndLivePhoto(String content, String imagePath, String videoPath, String sdkId, String sdkAppName) { wa.uploadTextAndLivePhoto(content, imagePath, videoPath, sdkId, sdkAppName); }\nvoid uploadTextAndLivePhoto(JSONObject jsonObj) { wa.uploadTextAndLivePhoto(jsonObj); }\nvoid uploadVideo(String videoPath) { wa.uploadVideo(videoPath); }\nvoid uploadVideo(JSONObject jsonObj) { wa.uploadVideo(jsonObj); }\nvoid uploadTextAndVideo(String content, String videoPath) { wa.uploadTextAndVideo(content, videoPath); }\nvoid uploadTextAndVideo(String content, String videoPath, String sdkId, String sdkAppName) { wa.uploadTextAndVideo(content, videoPath, sdkId, sdkAppName); }\nvoid uploadTextAndVideo(JSONObject jsonObj) { wa.uploadTextAndVideo(jsonObj); }\nvoid sendPat(String talker, String pattedUser) { wa.sendPat(talker, pattedUser); }\nvoid sendShareCard(String talker, String wxid) { wa.sendShareCard(talker, wxid); }\nboolean sendImage(String talker, String sendPath) { return wa.sendImage(talker, sendPath); }\nboolean sendImage(String talker, String sendPath, String appId) { return wa.sendImage(talker, sendPath, appId); }\nboolean sendOriginalImage(String talker, String sendPath) { return wa.sendOriginalImage(talker, sendPath); }\nboolean sendVoice(String talker, String sendPath) { return wa.sendVoice(talker, sendPath); }\nboolean sendVoice(String talker, String sendPath, int duration) { return wa.sendVoice(talker, sendPath, duration); }\nboolean sendVideo(String talker, String sendPath) { return wa.sendVideo(talker, sendPath); }\nboolean sendEmoji(String talker, String sendPath) { return wa.sendEmoji(talker, sendPath); }\nboolean sendFile(String talker, String sendPath) { return wa.sendFile(talker, sendPath); }\nboolean sendFile(String talker, String sendPath, String title) { return wa.sendFile(talker, sendPath, title); }\nObject getFavoriteList(int limit) { return wa.getFavoriteList(limit); }\nObject getFavorite(long localId) { return wa.getFavorite(localId); }\nboolean sendFavorite(String talker, long localId) { return wa.sendFavorite(talker, localId); }\nboolean sendFavorite(String talker, String localId) { return wa.sendFavorite(talker, localId); }\nvoid sendMediaMsg(String talker, Object mediaMessage, String appId) { wa.sendMediaMsg(talker, mediaMessage, appId); }\nvoid shareFile(String talker, String title, String filePath, String appId) { wa.shareFile(talker, title, filePath, appId); }\nvoid shareMiniProgram(String talker, String title, String description, String userName, String path, byte[] thumbData, String appId) { wa.shareMiniProgram(talker, title, description, userName, path, thumbData, appId); }\nvoid sendAppBrandMsg(String talker, String title, String pagePath, String ghName) { wa.sendAppBrandMsg(talker, title, pagePath, ghName); }\nvoid shareMusic(String talker, String title, String description, String musicUrl, String musicDataUrl, byte[] thumbData, String appId) { wa.shareMusic(talker, title, description, musicUrl, musicDataUrl, thumbData, appId); }\nvoid shareMusicVideo(String talker, String title, String description, String musicUrl, String musicDataUrl, String singerName, int duration, String songLyric, byte[] thumbData, String appId) { wa.shareMusicVideo(talker, title, description, musicUrl, musicDataUrl, singerName, duration, songLyric, thumbData, appId); }\nvoid shareText(String talker, String text, String appId) { wa.shareText(talker, text, appId); }\nvoid shareVideo(String talker, String title, String description, String videoUrl, byte[] thumbData, String appId) { wa.shareVideo(talker, title, description, videoUrl, thumbData, appId); }\nvoid shareWebpage(String talker, String title, String description, String webpageUrl, byte[] thumbData, String appId) { wa.shareWebpage(talker, title, description, webpageUrl, thumbData, appId); }\nvoid sendXmlMsg(String talker, String content) { wa.sendXmlMsg(talker, content); }\nvoid sendLocation(String talker, String poiName, String label, String x, String y, String scale) { wa.sendLocation(talker, poiName, label, x, y, scale); }\nvoid sendLocation(String talker, JSONObject jsonObj) { wa.sendLocation(talker, jsonObj); }\nlong insertSystemMsg(String talker, String content, long createTime) { return wa.insertSystemMsg(talker, content, createTime); }\nList queryHistoryMsg(String talker, long startTime, int count) { return wa.queryHistoryMsg(talker, startTime, count); }\nint getUnreadCount(String talker) { return wa.getUnreadCount(talker); }\nboolean deleteConversation(String talker) { return wa.deleteConversation(talker); }\nint getAllUnreadCount() { return wa.getAllUnreadCount(); }\nboolean clearUnread(String talker) { return wa.clearUnread(talker); }\nboolean clearAllUnread() { return wa.clearAllUnread(); }\nvoid delay(long millis, Runnable action) { wa.delay(millis, action); }\nvoid notify(String title, String text) { wa.notify(title, text); }\nint getFileType(String filePath) { return audio.getFileType(filePath); }\nint mp3ToSilk(String mp3Path, String silkPath) { return audio.mp3ToSilk(mp3Path, silkPath); }\nint mp3ToSilk(String mp3Path, String silkPath, int hz) { return audio.mp3ToSilk(mp3Path, silkPath, hz); }\nint wavToSilk(String wavPath, String silkPath, int hz) { return audio.wavToSilk(wavPath, silkPath, hz); }\nint flacToSilk(String flacPath, String silkPath, int hz) { return audio.flacToSilk(flacPath, silkPath, hz); }\nint oggToSilk(String oggPath, String silkPath, int hz) { return audio.oggToSilk(oggPath, silkPath, hz); }\nint pcmToSilk(String pcmPath, String silkPath, int hz, int pcmHz, int channels) { return audio.pcmToSilk(pcmPath, silkPath, hz, pcmHz, channels); }\nint autoToSilk(String audioPath, String silkPath, int hz) { return audio.autoToSilk(audioPath, silkPath, hz); }\nint silkToMp3(String silkPath, String mp3Path) { return audio.silkToMp3(silkPath, mp3Path); }\nint silkToMp3(String silkPath, String mp3Path, int hz) { return audio.silkToMp3(silkPath, mp3Path, hz); }\nint silkToPcm(String silkPath, String pcmPath, int hz) { return audio.silkToPcm(silkPath, pcmPath, hz); }\nint mp3ToPcm(String mp3Path, String pcmPath) { return audio.mp3ToPcm(mp3Path, pcmPath); }\nint wavToPcm(String wavPath, String pcmPath) { return audio.wavToPcm(wavPath, pcmPath); }\nint flacToPcm(String flacPath, String pcmPath) { return audio.flacToPcm(flacPath, pcmPath); }\nint oggToPcm(String oggPath, String pcmPath) { return audio.oggToPcm(oggPath, pcmPath); }\nint autoToPcm(String audioPath, String pcmPath) { return audio.autoToPcm(audioPath, pcmPath); }\nMap getAudioInfo(String filePath) { return audio.getAudioInfo(filePath); }\nint decodeAacFile(String aacPath, String pcmPath) { return audio.decodeAacFile(aacPath, pcmPath); }\nint encodePcmToAac(String pcmPath, String aacPath, int sampleRate, int channels) { return audio.encodePcmToAac(pcmPath, aacPath, sampleRate, channels); }\nint encodePcmToM4a(String pcmPath, String m4aPath, int sampleRate, int channels) { return audio.encodePcmToM4a(pcmPath, m4aPath, sampleRate, channels); }\nint mp4ToSilk(String mp4Path, String silkPath, int hz) { return audio.mp4ToSilk(mp4Path, silkPath, hz); }\nint silkToM4a(String silkPath, String m4aPath, int hz) { return audio.silkToM4a(silkPath, m4aPath, hz); }\nint mp4ToM4a(String mp4Path, String m4aPath, int hz) { return audio.mp4ToM4a(mp4Path, m4aPath, hz); }\nint mp4ToAac(String mp4Path, String aacPath, int hz) { return audio.mp4ToAac(mp4Path, aacPath, hz); }\nint m4aToSilk(String m4aPath, String silkPath, int hz) { return audio.m4aToSilk(m4aPath, silkPath, hz); }\nint aacToSilk(String aacPath, String silkPath, int hz) { return audio.aacToSilk(aacPath, silkPath, hz); }\nint m4aToAac(String m4aPath, String aacPath, int hz) { return audio.m4aToAac(m4aPath, aacPath, hz); }\nint m4aToM4a(String m4aPath, String m4aPathOut, int hz) { return audio.m4aToM4a(m4aPath, m4aPathOut, hz); }\nint autoToAac(String inputPath, String aacPath, int hz) { return audio.autoToAac(inputPath, aacPath, hz); }\nint autoToM4a(String inputPath, String m4aPath, int hz) { return audio.autoToM4a(inputPath, m4aPath, hz); }\nint autoAacToSilk(String inputPath, String silkPath, int hz) { return audio.autoAacToSilk(inputPath, silkPath, hz); }\nint silkToAac(String silkPath, String aacPath, int hz) { return audio.silkToAac(silkPath, aacPath, hz); }\nint aacToPcm(String aacPath, String pcmPath) { return audio.aacToPcm(aacPath, pcmPath); }\nint pcmToAac(String pcmPath, String aacPath, int sampleRate, int channels) { return audio.pcmToAac(pcmPath, aacPath, sampleRate, channels); }\nint pcmToM4a(String pcmPath, String m4aPath, int sampleRate, int channels) { return audio.pcmToM4a(pcmPath, m4aPath, sampleRate, channels); }\nint m4aToPcm(String m4aPath, String pcmPath) { return audio.m4aToPcm(m4aPath, pcmPath); }\nint decodeM4aFile(String m4aPath, String pcmPath) { return audio.decodeM4aFile(m4aPath, pcmPath); }\nlong getDuration(String filePath) { return audio.getDuration(filePath); }\nlong getDurationLimited(String filePath) { return audio.getDurationLimited(filePath); }\nString getErrorMessage(int code) { return audio.getErrorMessage(code); }\nvoid startTransform(int type, String inputPath, String outputPath, int sampleRate, Consumer callback) { audio.startTransform(type, inputPath, outputPath, sampleRate, callback); }\nvoid get(String url, Map headerMap, Consumer callback) { wa.get(url, headerMap, callback); }\nvoid get(String url, Map headerMap, long timeout, Consumer callback) { wa.get(url, headerMap, timeout, callback); }\nvoid get(String url, Map headerMap, PluginCallBack.HttpCallback callback) {\n    wa.get(url, headerMap, new Consumer() {\n        public void accept(Object body) {\n            if (body != null) callback.onSuccess(200, String.valueOf(body));\n            else callback.onError(new Exception(\"GET failed: \" + url));\n        }\n    });\n}\nvoid get(String url, Map headerMap, long timeout, PluginCallBack.HttpCallback callback) {\n    wa.get(url, headerMap, timeout, new Consumer() {\n        public void accept(Object body) {\n            if (body != null) callback.onSuccess(200, String.valueOf(body));\n            else callback.onError(new Exception(\"GET failed: \" + url));\n        }\n    });\n}\nvoid post(String url, Map paramMap, Map headerMap, Consumer callback) { wa.post(url, paramMap, headerMap, callback); }\nvoid post(String url, Map paramMap, Map headerMap, long timeout, Consumer callback) { wa.post(url, paramMap, headerMap, timeout, callback); }\nvoid post(String url, Map paramMap, Map headerMap, PluginCallBack.HttpCallback callback) {\n    wa.post(url, paramMap, headerMap, new Consumer() {\n        public void accept(Object body) {\n            if (body != null) callback.onSuccess(200, String.valueOf(body));\n            else callback.onError(new Exception(\"POST failed: \" + url));\n        }\n    });\n}\nvoid post(String url, Map paramMap, Map headerMap, long timeout, PluginCallBack.HttpCallback callback) {\n    wa.post(url, paramMap, headerMap, timeout, new Consumer() {\n        public void accept(Object body) {\n            if (body != null) callback.onSuccess(200, String.valueOf(body));\n            else callback.onError(new Exception(\"POST failed: \" + url));\n        }\n    });\n}\nvoid download(String url, String path, Map headerMap, Consumer callback) { wa.download(url, path, headerMap, callback); }\nvoid download(String url, String path, Map headerMap, long timeout, Consumer callback) { wa.download(url, path, headerMap, timeout, callback); }\nvoid download(String url, String path, Map headerMap, PluginCallBack.DownloadCallback callback) {\n    wa.download(url, path, headerMap, new Consumer() {\n        public void accept(Object file) {\n            if (file instanceof File) callback.onSuccess((File) file);\n            else callback.onError(new Exception(\"Download failed: \" + url));\n        }\n    });\n}\nvoid download(String url, String path, Map headerMap, long timeout, PluginCallBack.DownloadCallback callback) {\n    wa.download(url, path, headerMap, timeout, new Consumer() {\n        public void accept(Object file) {\n            if (file instanceof File) callback.onSuccess((File) file);\n            else callback.onError(new Exception(\"Download failed: \" + url));\n        }\n    });\n}\nvoid downloadImage(String url, Consumer callback) { wa.downloadImage(url, callback); }\nvoid downloadImage(String url, String fileName, Consumer callback) { wa.downloadImage(url, fileName, callback); }\nvoid downloadImg(String md5, String cdnUrl, String aesKey, String savePath) { wa.downloadImg(md5, cdnUrl, aesKey, savePath); }\nvoid downloadImg(Object imageMsg, String savePath) { wa.downloadImg(imageMsg, savePath); }\nvoid downloadImg(Object imageMsg, String savePath, PluginCallBack.DownloadCallback callback) { wa.downloadImg(imageMsg, savePath, callback); }\nvoid downloadImages(List urlList, Consumer callback) { wa.downloadImages(urlList, callback); }\nvoid downloadImages(List urlList, String prefix, Consumer callback) { wa.downloadImages(urlList, prefix, callback); }\nvoid downloadVideo(String md5, String cdnUrl, String aesKey, String savePath, PluginCallBack.DownloadCallback callback) { wa.downloadVideo(md5, cdnUrl, aesKey, savePath, callback); }\nvoid downloadVideo(Object videoMessage, String savePath, PluginCallBack.DownloadCallback callback) { wa.downloadVideo(videoMessage, savePath, callback); }"

    .line 564
    .line 565
    invoke-virtual {v5, p1}, Lbsh/Interpreter;->eval(Ljava/lang/String;)Ljava/lang/Object;

    .line 566
    .line 567
    .line 568
    return-object v5
.end method

.method private final notifyPluginCatalogChanged()V
    .locals 2

    .line 1
    sget-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->pluginCatalogListeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    :catchall_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Lfg/a;

    .line 25
    .line 26
    :try_start_0
    invoke-interface {v1}, Lfg/a;->invoke()Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    :goto_1
    return-void
.end method

.method public static synthetic o(Leb/a0;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->dispatchOnMemberChange$lambda$0(Leb/a0;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic p(JLgg/q;Ljava/lang/String;Ljava/lang/Long;)Ljava/lang/Long;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->logSendButtonDiagnostic$lambda$0(JLgg/q;Ljava/lang/String;Ljava/lang/Long;)Ljava/lang/Long;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final parseProcessScope(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Set;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    const-string v0, "main"

    .line 2
    .line 3
    if-eqz p2, :cond_13

    .line 4
    .line 5
    invoke-static {p2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    goto/16 :goto_6

    .line 12
    .line 13
    :cond_0
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 14
    .line 15
    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 16
    .line 17
    .line 18
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 19
    .line 20
    invoke-static {v2, p2, v2}, Lj8/b;->l(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    const-string v3, "[,;|\\s]+"

    .line 25
    .line 26
    invoke-static {v3}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    invoke-static {v4}, Log/m;->D0(I)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v3, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-virtual {v3}, Ljava/util/regex/Matcher;->find()Z

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    if-nez v5, :cond_1

    .line 46
    .line 47
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-static {v2}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    goto :goto_0

    .line 56
    :cond_1
    new-instance v5, Ljava/util/ArrayList;

    .line 57
    .line 58
    const/16 v6, 0xa

    .line 59
    .line 60
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 61
    .line 62
    .line 63
    move v6, v4

    .line 64
    :cond_2
    invoke-virtual {v3}, Ljava/util/regex/Matcher;->start()I

    .line 65
    .line 66
    .line 67
    move-result v7

    .line 68
    invoke-virtual {v2, v6, v7}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v6

    .line 76
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    invoke-virtual {v3}, Ljava/util/regex/Matcher;->end()I

    .line 80
    .line 81
    .line 82
    move-result v6

    .line 83
    invoke-virtual {v3}, Ljava/util/regex/Matcher;->find()Z

    .line 84
    .line 85
    .line 86
    move-result v7

    .line 87
    if-nez v7, :cond_2

    .line 88
    .line 89
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    invoke-virtual {v2, v6, v3}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-object v2, v5

    .line 105
    :goto_0
    new-instance v3, Ljava/util/ArrayList;

    .line 106
    .line 107
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 108
    .line 109
    .line 110
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    :cond_3
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 115
    .line 116
    .line 117
    move-result v5

    .line 118
    if-eqz v5, :cond_4

    .line 119
    .line 120
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v5

    .line 124
    move-object v6, v5

    .line 125
    check-cast v6, Ljava/lang/String;

    .line 126
    .line 127
    invoke-static {v6}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 128
    .line 129
    .line 130
    move-result v6

    .line 131
    if-nez v6, :cond_3

    .line 132
    .line 133
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_4
    new-instance v2, Ljava/util/ArrayList;

    .line 138
    .line 139
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 143
    .line 144
    .line 145
    move-result-object v5

    .line 146
    :cond_5
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 147
    .line 148
    .line 149
    move-result v6

    .line 150
    const-string v7, "all"

    .line 151
    .line 152
    const-string v8, "appbrand"

    .line 153
    .line 154
    if-eqz v6, :cond_8

    .line 155
    .line 156
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v6

    .line 160
    move-object v9, v6

    .line 161
    check-cast v9, Ljava/lang/String;

    .line 162
    .line 163
    invoke-static {v9, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result v10

    .line 167
    if-nez v10, :cond_7

    .line 168
    .line 169
    invoke-static {v9, v8}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v8

    .line 173
    if-nez v8, :cond_7

    .line 174
    .line 175
    invoke-static {v9, v7}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result v7

    .line 179
    if-eqz v7, :cond_6

    .line 180
    .line 181
    goto :goto_3

    .line 182
    :cond_6
    move v7, v4

    .line 183
    goto :goto_4

    .line 184
    :cond_7
    :goto_3
    const/4 v7, 0x1

    .line 185
    :goto_4
    if-nez v7, :cond_5

    .line 186
    .line 187
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    goto :goto_2

    .line 191
    :cond_8
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 192
    .line 193
    .line 194
    move-result v2

    .line 195
    if-nez v2, :cond_a

    .line 196
    .line 197
    invoke-static {p2}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    const-string v1, ":"

    .line 206
    .line 207
    invoke-static {p1, v1, v0}, Lwb/en;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    sget-object v1, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->invalidProcessWarnings:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 212
    .line 213
    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    move-result v0

    .line 217
    if-eqz v0, :cond_9

    .line 218
    .line 219
    invoke-static {p2}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 220
    .line 221
    .line 222
    move-result-object p2

    .line 223
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object p2

    .line 227
    new-instance v0, Ljava/lang/StringBuilder;

    .line 228
    .line 229
    const-string v1, "[Hchat:Script] \u63d2\u4ef6\u8fdb\u7a0b\u914d\u7f6e\u65e0\u6548\uff0c\u5df2\u62d2\u7edd\u52a0\u8f7d: plugin="

    .line 230
    .line 231
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 235
    .line 236
    .line 237
    const-string p1, " process="

    .line 238
    .line 239
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 240
    .line 241
    .line 242
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object p1

    .line 249
    invoke-static {p1}, Lfb/v0;->m(Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    :cond_9
    sget-object p1, Ltf/v;->g:Ltf/v;

    .line 253
    .line 254
    return-object p1

    .line 255
    :cond_a
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 256
    .line 257
    .line 258
    move-result-object p1

    .line 259
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 260
    .line 261
    .line 262
    move-result p2

    .line 263
    if-eqz p2, :cond_11

    .line 264
    .line 265
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object p2

    .line 269
    check-cast p2, Ljava/lang/String;

    .line 270
    .line 271
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 272
    .line 273
    .line 274
    move-result v2

    .line 275
    const v3, 0x179a1

    .line 276
    .line 277
    .line 278
    if-eq v2, v3, :cond_f

    .line 279
    .line 280
    const v3, 0x3305b9

    .line 281
    .line 282
    .line 283
    if-eq v2, v3, :cond_d

    .line 284
    .line 285
    const v3, 0x45c4fe06

    .line 286
    .line 287
    .line 288
    if-eq v2, v3, :cond_b

    .line 289
    .line 290
    goto :goto_5

    .line 291
    :cond_b
    invoke-virtual {p2, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 292
    .line 293
    .line 294
    move-result p2

    .line 295
    if-nez p2, :cond_c

    .line 296
    .line 297
    goto :goto_5

    .line 298
    :cond_c
    invoke-interface {v1, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 299
    .line 300
    .line 301
    goto :goto_5

    .line 302
    :cond_d
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 303
    .line 304
    .line 305
    move-result p2

    .line 306
    if-nez p2, :cond_e

    .line 307
    .line 308
    goto :goto_5

    .line 309
    :cond_e
    invoke-interface {v1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 310
    .line 311
    .line 312
    goto :goto_5

    .line 313
    :cond_f
    invoke-virtual {p2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 314
    .line 315
    .line 316
    move-result p2

    .line 317
    if-nez p2, :cond_10

    .line 318
    .line 319
    goto :goto_5

    .line 320
    :cond_10
    invoke-interface {v1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 321
    .line 322
    .line 323
    invoke-interface {v1, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 324
    .line 325
    .line 326
    goto :goto_5

    .line 327
    :cond_11
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 328
    .line 329
    .line 330
    move-result p1

    .line 331
    if-eqz p1, :cond_12

    .line 332
    .line 333
    invoke-static {v0}, Lac/p;->N(Ljava/lang/Object;)Ljava/util/Set;

    .line 334
    .line 335
    .line 336
    move-result-object p1

    .line 337
    return-object p1

    .line 338
    :cond_12
    return-object v1

    .line 339
    :cond_13
    :goto_6
    invoke-static {v0}, Lac/p;->N(Ljava/lang/Object;)Ljava/util/Set;

    .line 340
    .line 341
    .line 342
    move-result-object p1

    .line 343
    return-object p1
.end method

.method private static final prepareSnsPostMedia$lambda$0(Lp8/d0;Ljava/lang/String;Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/lang/String;Lbsh/Interpreter;Ljava/lang/String;Ljava/util/function/Consumer;)V
    .locals 3

    .line 1
    const-string v0, "[Hchat:Script] \u670b\u53cb\u5708\u5a92\u4f53\u51c6\u5907\u56de\u8c03\u5931\u8d25: "

    .line 2
    .line 3
    :try_start_0
    invoke-virtual {p0, p1, p2}, Lp8/d0;->p(Ljava/lang/String;Ljava/util/concurrent/atomic/AtomicBoolean;)Lh/Hchat/hooks/api/model/WeChatSnsPrepareResult;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-nez p1, :cond_2

    .line 12
    .line 13
    sget-object p1, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->loadedPlugins:Ljava/util/concurrent/ConcurrentHashMap;

    .line 14
    .line 15
    invoke-virtual {p1, p3}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Leb/a0;

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    iget-object v2, v1, Leb/a0;->b:Lbsh/Interpreter;

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception p0

    .line 27
    goto :goto_5

    .line 28
    :cond_0
    const/4 v2, 0x0

    .line 29
    :goto_0
    if-ne v2, p4, :cond_2

    .line 30
    .line 31
    sget-object v2, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->INSTANCE:Lh/Hchat/hooks/items/script/ScriptPluginRuntime;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    .line 33
    :try_start_1
    invoke-direct {v2, p4}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->interpreterLock(Lbsh/Interpreter;)Ljava/util/concurrent/locks/ReentrantLock;

    .line 34
    .line 35
    .line 36
    move-result-object p4

    .line 37
    invoke-virtual {p4}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 38
    .line 39
    .line 40
    :try_start_2
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-nez v2, :cond_1

    .line 45
    .line 46
    invoke-virtual {p1, p3}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    if-ne p1, v1, :cond_1

    .line 51
    .line 52
    invoke-interface {p6, p0}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :catchall_1
    move-exception p0

    .line 57
    goto :goto_2

    .line 58
    :cond_1
    :goto_1
    :try_start_3
    invoke-virtual {p4}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 59
    .line 60
    .line 61
    sget-object p0, Lsf/n;->a:Lsf/n;

    .line 62
    .line 63
    goto :goto_4

    .line 64
    :catchall_2
    move-exception p0

    .line 65
    goto :goto_3

    .line 66
    :goto_2
    invoke-virtual {p4}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 67
    .line 68
    .line 69
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 70
    :goto_3
    :try_start_4
    new-instance p1, Lsf/f;

    .line 71
    .line 72
    invoke-direct {p1, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 73
    .line 74
    .line 75
    move-object p0, p1

    .line 76
    :goto_4
    invoke-static {p0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    if-eqz p0, :cond_2

    .line 81
    .line 82
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    new-instance p4, Ljava/lang/StringBuilder;

    .line 87
    .line 88
    invoke-direct {p4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    const-string p3, " "

    .line 95
    .line 96
    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    invoke-static {p1, p0}, Lfb/v0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 107
    .line 108
    .line 109
    :cond_2
    sget-object p0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->snsPrepareCancellations:Ljava/util/concurrent/ConcurrentHashMap;

    .line 110
    .line 111
    invoke-virtual {p0, p5, p2}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    return-void

    .line 115
    :goto_5
    sget-object p1, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->snsPrepareCancellations:Ljava/util/concurrent/ConcurrentHashMap;

    .line 116
    .line 117
    invoke-virtual {p1, p5, p2}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    throw p0
.end method

.method private final processScopedCacheRoot(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;
    .locals 2

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/content/Context;->getCodeCacheDir()Ljava/io/File;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-direct {v0, p1, p2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    sget-object p1, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->runtimeProcess:Ljava/lang/String;

    .line 11
    .line 12
    const-string p2, "appbrand"

    .line 13
    .line 14
    invoke-static {p1, p2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    if-nez p1, :cond_0

    .line 19
    .line 20
    return-object v0

    .line 21
    :cond_0
    sget-object p1, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->runtimeProcessName:Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    move-object p2, p1

    .line 31
    :goto_0
    invoke-direct {p0, p2}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->safeFileName(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    new-instance p2, Ljava/io/File;

    .line 36
    .line 37
    invoke-direct {p2, v0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    return-object p2
.end method

.method private static final protobufCallbackExecutor$lambda$0(Ljava/lang/Runnable;)Ljava/lang/Thread;
    .locals 2

    .line 1
    const-string v0, "Hchat-Script-Protobuf"

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {v0, v1, p0}, Lj8/b;->n(Ljava/lang/String;ZLjava/lang/Runnable;)Ljava/lang/Thread;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    return-object p0
.end method

.method private static final protobufPacketListener$lambda$0(Lh/Hchat/hooks/items/protobuf/ProtobufPacketRuntime$Packet;)V
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->INSTANCE:Lh/Hchat/hooks/items/script/ScriptPluginRuntime;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->dispatchOnProtobufPacket(Lh/Hchat/hooks/items/protobuf/ProtobufPacketRuntime$Packet;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static synthetic q(Ljava/lang/Runnable;)Ljava/lang/Thread;
    .locals 0

    .line 1
    invoke-static {p0}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->snsPrepareExecutor$lambda$0(Ljava/lang/Runnable;)Ljava/lang/Thread;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic r(Leb/a0;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->dispatchOnHandleMsg$lambda$0(Leb/a0;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private final readPluginMeta(Ljava/io/File;)Ljava/util/Properties;
    .locals 5

    .line 1
    new-instance v0, Ljava/util/Properties;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/Properties;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/io/File;

    .line 7
    .line 8
    const-string v2, "info.prop"

    .line 9
    .line 10
    invoke-direct {v1, p1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/io/File;->isFile()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-nez v2, :cond_0

    .line 18
    .line 19
    goto :goto_2

    .line 20
    :cond_0
    :try_start_0
    sget-object v2, Log/a;->a:Ljava/nio/charset/Charset;

    .line 21
    .line 22
    new-instance v3, Ljava/io/InputStreamReader;

    .line 23
    .line 24
    new-instance v4, Ljava/io/FileInputStream;

    .line 25
    .line 26
    invoke-direct {v4, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 27
    .line 28
    .line 29
    invoke-direct {v3, v4, v2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    .line 32
    :try_start_1
    invoke-virtual {v0, v3}, Ljava/util/Properties;->load(Ljava/io/Reader;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 33
    .line 34
    .line 35
    :try_start_2
    invoke-virtual {v3}, Ljava/io/InputStreamReader;->close()V

    .line 36
    .line 37
    .line 38
    sget-object v1, Lsf/n;->a:Lsf/n;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :catchall_0
    move-exception v1

    .line 42
    goto :goto_0

    .line 43
    :catchall_1
    move-exception v1

    .line 44
    :try_start_3
    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 45
    :catchall_2
    move-exception v2

    .line 46
    :try_start_4
    invoke-static {v3, v1}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 47
    .line 48
    .line 49
    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 50
    :goto_0
    new-instance v2, Lsf/f;

    .line 51
    .line 52
    invoke-direct {v2, v1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 53
    .line 54
    .line 55
    move-object v1, v2

    .line 56
    :goto_1
    invoke-static {v1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    if-eqz v1, :cond_1

    .line 61
    .line 62
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    const-string v3, "[Hchat:Script] \u8bfb\u53d6\u63d2\u4ef6\u4fe1\u606f\u5931\u8d25: "

    .line 71
    .line 72
    const-string v4, " "

    .line 73
    .line 74
    invoke-static {v3, p1, v4, v2, v1}, Leh/a;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 75
    .line 76
    .line 77
    :cond_1
    :goto_2
    return-object v0
.end method

.method private final declared-synchronized refreshPluginDirObservers(Ljava/io/File;)V
    .locals 10

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-static {v0}, Ltf/l;->k0([Ljava/lang/Object;)Lng/j;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    new-instance v1, Lc0/f;

    .line 13
    .line 14
    const-class v2, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;

    .line 15
    .line 16
    invoke-static {v2}, Lgg/v;->a(Ljava/lang/Class;)Lgg/f;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-interface {v2}, Lgg/e;->a()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    const-string v5, "isPluginDirectory"

    .line 28
    .line 29
    const-string v6, "isPluginDirectory(Ljava/io/File;)Z"
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 30
    .line 31
    const/4 v8, 0x0

    .line 32
    const/16 v9, 0xd

    .line 33
    .line 34
    const/4 v2, 0x1

    .line 35
    const/4 v7, 0x0

    .line 36
    move-object v3, p0

    .line 37
    :try_start_1
    invoke-direct/range {v1 .. v9}, Lc0/f;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 38
    .line 39
    .line 40
    new-instance v2, Lng/i;

    .line 41
    .line 42
    const/4 v4, 0x1

    .line 43
    invoke-direct {v2, v0, v4, v1}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 44
    .line 45
    .line 46
    new-instance v0, Le9/h;

    .line 47
    .line 48
    const/16 v1, 0xf

    .line 49
    .line 50
    invoke-direct {v0, v1}, Le9/h;-><init>(I)V

    .line 51
    .line 52
    .line 53
    invoke-static {v2, v0}, Lng/m;->W(Lng/j;Lfg/l;)Lng/t;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-static {v0}, Lng/m;->c0(Lng/j;)Ljava/util/Set;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    goto :goto_1

    .line 62
    :catchall_0
    move-exception v0

    .line 63
    :goto_0
    move-object p1, v0

    .line 64
    goto/16 :goto_6

    .line 65
    .line 66
    :catchall_1
    move-exception v0

    .line 67
    move-object v3, p0

    .line 68
    goto :goto_0

    .line 69
    :cond_0
    move-object v3, p0

    .line 70
    sget-object v0, Ltf/v;->g:Ltf/v;

    .line 71
    .line 72
    :goto_1
    sget-object v1, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->pluginDirObservers:Ljava/util/concurrent/ConcurrentHashMap;

    .line 73
    .line 74
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    check-cast v1, Ljava/lang/Iterable;

    .line 82
    .line 83
    new-instance v2, Ljava/util/ArrayList;

    .line 84
    .line 85
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 86
    .line 87
    .line 88
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    :cond_1
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 93
    .line 94
    .line 95
    move-result v4

    .line 96
    if-eqz v4, :cond_2

    .line 97
    .line 98
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    move-object v5, v4

    .line 103
    check-cast v5, Ljava/lang/String;

    .line 104
    .line 105
    invoke-interface {v0, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v5

    .line 109
    if-nez v5, :cond_1

    .line 110
    .line 111
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_2
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    :cond_3
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    if-eqz v1, :cond_5

    .line 124
    .line 125
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    check-cast v1, Ljava/lang/String;

    .line 133
    .line 134
    sget-object v2, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->pluginDirObservers:Ljava/util/concurrent/ConcurrentHashMap;

    .line 135
    .line 136
    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    check-cast v2, Landroid/os/FileObserver;

    .line 141
    .line 142
    if-eqz v2, :cond_4

    .line 143
    .line 144
    invoke-virtual {v2}, Landroid/os/FileObserver;->stopWatching()V

    .line 145
    .line 146
    .line 147
    :cond_4
    sget-object v2, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->reloadTasks:Ljava/util/concurrent/ConcurrentHashMap;

    .line 148
    .line 149
    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    check-cast v1, Ljava/lang/Runnable;

    .line 154
    .line 155
    if-eqz v1, :cond_3

    .line 156
    .line 157
    sget-object v2, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->mainHandler:Landroid/os/Handler;

    .line 158
    .line 159
    invoke-virtual {v2, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 160
    .line 161
    .line 162
    goto :goto_3

    .line 163
    :cond_5
    invoke-virtual {p1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    if-eqz p1, :cond_9

    .line 168
    .line 169
    new-instance v0, Ljava/util/ArrayList;

    .line 170
    .line 171
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 172
    .line 173
    .line 174
    array-length v1, p1

    .line 175
    const/4 v2, 0x0

    .line 176
    :goto_4
    if-ge v2, v1, :cond_7

    .line 177
    .line 178
    aget-object v4, p1, v2

    .line 179
    .line 180
    invoke-direct {p0, v4}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->isPluginDirectory(Ljava/io/File;)Z

    .line 181
    .line 182
    .line 183
    move-result v5

    .line 184
    if-eqz v5, :cond_6

    .line 185
    .line 186
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    :cond_6
    add-int/lit8 v2, v2, 0x1

    .line 190
    .line 191
    goto :goto_4

    .line 192
    :cond_7
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 197
    .line 198
    .line 199
    move-result v0

    .line 200
    if-eqz v0, :cond_9

    .line 201
    .line 202
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    check-cast v0, Ljava/io/File;

    .line 207
    .line 208
    sget-object v1, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->pluginDirObservers:Ljava/util/concurrent/ConcurrentHashMap;

    .line 209
    .line 210
    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v2

    .line 214
    invoke-virtual {v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    move-result v2

    .line 218
    if-eqz v2, :cond_8

    .line 219
    .line 220
    goto :goto_5

    .line 221
    :cond_8
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v2

    .line 225
    new-instance v4, Leb/e0;

    .line 226
    .line 227
    const/4 v5, 0x0

    .line 228
    invoke-direct {v4, v0, v2, v5}, Leb/e0;-><init>(Ljava/io/File;Ljava/lang/String;I)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v4}, Landroid/os/FileObserver;->startWatching()V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    invoke-interface {v1, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 239
    .line 240
    .line 241
    goto :goto_5

    .line 242
    :cond_9
    monitor-exit p0

    .line 243
    return-void

    .line 244
    :goto_6
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 245
    throw p1
.end method

.method private static final refreshPluginDirObservers$lambda$0(Ljava/io/File;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final reloadPluginAsync$lambda$0(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

    .line 1
    sget-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->INSTANCE:Lh/Hchat/hooks/items/script/ScriptPluginRuntime;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->reloadPlugin-gIAlu-s(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    instance-of v0, p0, Lsf/f;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-static {p0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    :goto_0
    const-string v1, "[Hchat:Script] \u63d2\u4ef6\u91cd\u8f7d\u5931\u8d25: "

    .line 24
    .line 25
    const-string v2, " "

    .line 26
    .line 27
    invoke-static {v1, p1, v2, v0}, Lbc/e;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-static {p0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-static {p1, p0}, Lfb/v0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 36
    .line 37
    .line 38
    :cond_1
    return-void
.end method

.method private final reloadPluginFromFileChange(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/Thread;

    .line 2
    .line 3
    new-instance v1, Leb/w;

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    invoke-direct {v1, p1, p2, v2}, Leb/w;-><init>(Landroid/content/Context;Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    const-string p1, "Hchat-Script-AutoReload-"

    .line 10
    .line 11
    invoke-static {p1, p2}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-direct {v0, v1, p1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method private static final reloadPluginFromFileChange$lambda$0(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

    .line 1
    sget-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->INSTANCE:Lh/Hchat/hooks/items/script/ScriptPluginRuntime;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->reloadPlugin-gIAlu-s(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    instance-of v1, v1, Lsf/f;

    .line 8
    .line 9
    if-eqz v1, :cond_2

    .line 10
    .line 11
    invoke-virtual {v0, p0}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->listPlugins(Landroid/content/Context;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    move-object v2, v1

    .line 30
    check-cast v2, Leb/c0;

    .line 31
    .line 32
    iget-object v2, v2, Leb/c0;->a:Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    const/4 v1, 0x0

    .line 42
    :goto_0
    check-cast v1, Leb/c0;

    .line 43
    .line 44
    const-string v0, "Hchat_script_plugin_config"

    .line 45
    .line 46
    invoke-static {p0, v0}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    const-string v2, "script_plugin_item_"

    .line 58
    .line 59
    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    const/4 v2, 0x0

    .line 64
    invoke-interface {v0, p1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 69
    .line 70
    .line 71
    new-instance p1, Landroid/os/Handler;

    .line 72
    .line 73
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 78
    .line 79
    .line 80
    new-instance v0, La1/d;

    .line 81
    .line 82
    const/4 v2, 0x7

    .line 83
    invoke-direct {v0, p0, v2, v1}, La1/d;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 87
    .line 88
    .line 89
    :cond_2
    sget-object p0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->INSTANCE:Lh/Hchat/hooks/items/script/ScriptPluginRuntime;

    .line 90
    .line 91
    invoke-direct {p0}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->notifyPluginCatalogChanged()V

    .line 92
    .line 93
    .line 94
    return-void
.end method

.method private static final reloadPluginFromFileChange$lambda$0$1(Landroid/content/Context;Leb/c0;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object p1, p1, Leb/c0;->h:Ljava/lang/String;

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const-string p1, "\u672a\u77e5"

    .line 9
    .line 10
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v1, "\u52a0\u8f7d["

    .line 13
    .line 14
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string p1, "]\u5931\u8d25\uff0c\u5df2\u81ea\u52a8\u5173\u95ed"

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    const/4 v0, 0x0

    .line 30
    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method private final resolvePluginFile(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;
    .locals 2

    .line 1
    invoke-static {p2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    new-instance v0, Ljava/io/File;

    .line 8
    .line 9
    invoke-direct {v0, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/io/File;->isAbsolute()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_0
    new-instance v0, Ljava/io/File;

    .line 20
    .line 21
    invoke-direct {v0, p1, p2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-object v0

    .line 25
    :cond_1
    const-string p1, "\u8def\u5f84\u4e0d\u80fd\u4e3a\u7a7a"

    .line 26
    .line 27
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    const/4 p1, 0x0

    .line 31
    return-object p1
.end method

.method public static synthetic s(Lp8/d0;Ljava/lang/String;Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/lang/String;Lbsh/Interpreter;Ljava/lang/String;Ljava/util/function/Consumer;)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p6}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->prepareSnsPostMedia$lambda$0(Lp8/d0;Ljava/lang/String;Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/lang/String;Lbsh/Interpreter;Ljava/lang/String;Ljava/util/function/Consumer;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final safeCallbackFilePart(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const-string p1, ""

    .line 4
    .line 5
    :cond_0
    const-string v0, "[^A-Za-z0-9._-]"

    .line 6
    .line 7
    const-string v1, "_"

    .line 8
    .line 9
    invoke-static {v0, p1, v1}, Lj8/b;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    const-string p1, "unknown"

    .line 20
    .line 21
    :cond_1
    return-object p1
.end method

.method private final safeFileName(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "[^A-Za-z0-9._-]"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const-string v0, "_"

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    const-string p1, "plugin"

    .line 33
    .line 34
    :cond_0
    return-object p1
.end method

.method private final schedulePluginReload(Ljava/lang/String;)V
    .locals 4

    .line 1
    sget-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->loadedPlugins:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    sget-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->appContext:Landroid/content/Context;

    .line 11
    .line 12
    if-eqz v0, :cond_2

    .line 13
    .line 14
    new-instance v1, Leb/w;

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    invoke-direct {v1, p1, v0, v2}, Leb/w;-><init>(Ljava/lang/String;Landroid/content/Context;I)V

    .line 18
    .line 19
    .line 20
    sget-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->reloadTasks:Ljava/util/concurrent/ConcurrentHashMap;

    .line 21
    .line 22
    invoke-virtual {v0, p1, v1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, Ljava/lang/Runnable;

    .line 27
    .line 28
    if-eqz p1, :cond_1

    .line 29
    .line 30
    sget-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->mainHandler:Landroid/os/Handler;

    .line 31
    .line 32
    invoke-virtual {v0, p1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 33
    .line 34
    .line 35
    :cond_1
    sget-object p1, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->mainHandler:Landroid/os/Handler;

    .line 36
    .line 37
    const-wide/16 v2, 0x1f4

    .line 38
    .line 39
    invoke-virtual {p1, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 40
    .line 41
    .line 42
    :cond_2
    :goto_0
    return-void
.end method

.method private static final schedulePluginReload$lambda$0(Ljava/lang/String;Landroid/content/Context;)V
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->reloadTasks:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    sget-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->INSTANCE:Lh/Hchat/hooks/items/script/ScriptPluginRuntime;

    .line 7
    .line 8
    invoke-direct {v0, p1, p0}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->reloadPluginFromFileChange(Landroid/content/Context;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method private final scriptHasCallback(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 3

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p2}, Ljava/util/regex/Pattern;->quote(Ljava/lang/String;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    new-instance v1, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v2, "\\b"

    .line 14
    .line 15
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string v0, "\\s*\\("

    .line 22
    .line 23
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-static {v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->find()Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-nez v1, :cond_1

    .line 49
    .line 50
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    invoke-static {p3}, Ljava/util/regex/Pattern;->quote(Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p3

    .line 57
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    new-instance v1, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p3

    .line 75
    invoke-static {p3}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 76
    .line 77
    .line 78
    move-result-object p3

    .line 79
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    invoke-virtual {p3, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 83
    .line 84
    .line 85
    move-result-object p3

    .line 86
    invoke-virtual {p3}, Ljava/util/regex/Matcher;->find()Z

    .line 87
    .line 88
    .line 89
    move-result p3

    .line 90
    if-nez p3, :cond_1

    .line 91
    .line 92
    invoke-static {p2}, Ljava/util/regex/Pattern;->quote(Ljava/lang/String;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p2

    .line 96
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    new-instance p3, Ljava/lang/StringBuilder;

    .line 100
    .line 101
    const-string v0, "\\buseCallback\\s*\\(\\s*[\"\']"

    .line 102
    .line 103
    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    const-string p2, "[\"\']\\s*,"

    .line 110
    .line 111
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p2

    .line 118
    invoke-static {p2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 119
    .line 120
    .line 121
    move-result-object p2

    .line 122
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    invoke-virtual {p2, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    invoke-virtual {p1}, Ljava/util/regex/Matcher;->find()Z

    .line 130
    .line 131
    .line 132
    move-result p1

    .line 133
    if-eqz p1, :cond_0

    .line 134
    .line 135
    goto :goto_0

    .line 136
    :cond_0
    const/4 p1, 0x0

    .line 137
    return p1

    .line 138
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 139
    return p1
.end method

.method private static final sendProtobufPacket$lambda$0(Ljava/util/function/Consumer;ZLjava/lang/String;)V
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->INSTANCE:Lh/Hchat/hooks/items/script/ScriptPluginRuntime;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->deliverProtobufSendResult(Ljava/util/function/Consumer;ZLjava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private static final sendProtobufPacket$lambda$1(Ljava/util/function/Consumer;ZLjava/lang/String;)V
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->INSTANCE:Lh/Hchat/hooks/items/script/ScriptPluginRuntime;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->deliverProtobufSendResult(Ljava/util/function/Consumer;ZLjava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private final sha256(Ljava/io/File;)Ljava/lang/String;
    .locals 7

    .line 1
    const-string v0, "SHA-256"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Ljava/io/FileInputStream;

    .line 8
    .line 9
    invoke-direct {v1, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 10
    .line 11
    .line 12
    const/16 p1, 0x2000

    .line 13
    .line 14
    :try_start_0
    new-array p1, p1, [B

    .line 15
    .line 16
    :goto_0
    invoke-virtual {v1, p1}, Ljava/io/FileInputStream;->read([B)I

    .line 17
    .line 18
    .line 19
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    const/4 v3, 0x0

    .line 21
    if-gtz v2, :cond_2

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    new-instance v0, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 36
    .line 37
    .line 38
    const-string v1, ""

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 41
    .line 42
    .line 43
    array-length v2, p1

    .line 44
    move v4, v3

    .line 45
    :goto_1
    if-ge v3, v2, :cond_1

    .line 46
    .line 47
    aget-byte v5, p1, v3

    .line 48
    .line 49
    const/4 v6, 0x1

    .line 50
    add-int/2addr v4, v6

    .line 51
    if-le v4, v6, :cond_0

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 54
    .line 55
    .line 56
    :cond_0
    invoke-static {v5}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->sha256$lambda$1(B)Ljava/lang/CharSequence;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 61
    .line 62
    .line 63
    add-int/lit8 v3, v3, 0x1

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    return-object p1

    .line 74
    :cond_2
    :try_start_1
    invoke-virtual {v0, p1, v3, v2}, Ljava/security/MessageDigest;->update([BII)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :catchall_0
    move-exception p1

    .line 79
    :try_start_2
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 80
    :catchall_1
    move-exception v0

    .line 81
    invoke-static {v1, p1}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 82
    .line 83
    .line 84
    throw v0
.end method

.method private static final sha256$lambda$1(B)Ljava/lang/CharSequence;
    .locals 1

    .line 1
    invoke-static {p0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const/4 v0, 0x1

    .line 10
    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    const-string v0, "%02x"

    .line 15
    .line 16
    invoke-static {v0, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method private final snapshotKey(Ljava/lang/String;)Ljavax/crypto/SecretKey;
    .locals 2

    .line 1
    new-instance p1, Ljavax/crypto/spec/SecretKeySpec;

    .line 2
    .line 3
    invoke-direct {p0}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->snapshotKeyBytes()[B

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "AES"

    .line 8
    .line 9
    invoke-direct {p1, v0, v1}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method private final snapshotKeyBytes()[B
    .locals 5

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    new-array v1, v0, [B

    .line 4
    .line 5
    fill-array-data v1, :array_0

    .line 6
    .line 7
    .line 8
    new-array v2, v0, [B

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    :goto_0
    if-ge v3, v0, :cond_0

    .line 12
    .line 13
    aget-byte v4, v1, v3

    .line 14
    .line 15
    xor-int/lit8 v4, v4, 0x5a

    .line 16
    .line 17
    int-to-byte v4, v4

    .line 18
    aput-byte v4, v2, v3

    .line 19
    .line 20
    add-int/lit8 v3, v3, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return-object v2

    .line 24
    nop

    .line 25
    :array_0
    .array-data 1
        0x6at
        0x6bt
        0x68t
        0x69t
        0x6et
        0x6ft
        0x6ct
        0x6dt
        0x62t
        0x63t
        0x3bt
        0x38t
        0x39t
        0x3et
        0x3ft
        0x3ct
    .end array-data
.end method

.method private static final snsPrepareExecutor$lambda$0(Ljava/lang/Runnable;)Ljava/lang/Thread;
    .locals 2

    .line 1
    const-string v0, "Hchat-Script-SnsPrepare"

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {v0, v1, p0}, Lj8/b;->n(Ljava/lang/String;ZLjava/lang/Runnable;)Ljava/lang/Thread;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    return-object p0
.end method

.method private final declared-synchronized startPluginObservers(Landroid/content/Context;)V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p0, p1}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->ensureDirs(Landroid/content/Context;)Ljava/io/File;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    sget-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->scriptRootObserver:Landroid/os/FileObserver;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    new-instance v1, Leb/e0;

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    invoke-direct {v1, p1, v0, v2}, Leb/e0;-><init>(Ljava/io/File;Ljava/lang/String;I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Landroid/os/FileObserver;->startWatching()V

    .line 21
    .line 22
    .line 23
    sput-object v1, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->scriptRootObserver:Landroid/os/FileObserver;

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception p1

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    :goto_0
    invoke-direct {p0, p1}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->refreshPluginDirObservers(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    .line 30
    .line 31
    monitor-exit p0

    .line 32
    return-void

    .line 33
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 34
    throw p1
.end method

.method private final supportsProcess(Leb/c0;Ljava/lang/String;)Z
    .locals 0

    .line 1
    iget-object p1, p1, Leb/c0;->i:Ljava/util/Set;

    .line 2
    .line 3
    invoke-interface {p1, p2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public static synthetic t(Lh/Hchat/hooks/items/protobuf/ProtobufPacketRuntime$Packet;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->dispatchOnProtobufPacket$lambda$1(Lh/Hchat/hooks/items/protobuf/ProtobufPacketRuntime$Packet;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic u(Landroid/content/Context;Leb/c0;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->reloadPluginFromFileChange$lambda$0$1(Landroid/content/Context;Leb/c0;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final declared-synchronized unloadAllPlugins-d1pmJ48()Ljava/lang/Object;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->loadedPlugins:Ljava/util/concurrent/ConcurrentHashMap;

    .line 3
    .line 4
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->keys()Ljava/util/Enumeration;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Ljava/util/Collections;->list(Ljava/util/Enumeration;)Ljava/util/ArrayList;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-direct {p0, v1}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->unloadPlugin-IoAF18A(Ljava/lang/String;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-static {v1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :catchall_0
    move-exception v0

    .line 46
    goto :goto_1

    .line 47
    :cond_0
    sget-object v0, Lsf/n;->a:Lsf/n;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :goto_1
    :try_start_1
    new-instance v1, Lsf/f;

    .line 51
    .line 52
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 53
    .line 54
    .line 55
    move-object v0, v1

    .line 56
    :goto_2
    monitor-exit p0

    .line 57
    return-object v0

    .line 58
    :goto_3
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 59
    throw v0

    .line 60
    :catchall_1
    move-exception v0

    .line 61
    goto :goto_3
.end method

.method private final declared-synchronized unloadPlugin-IoAF18A(Ljava/lang/String;)Ljava/lang/Object;
    .locals 5

    .line 1
    const-string v0, "[Hchat:Script] \u63d2\u4ef6\u5378\u8f7d\u56de\u8c03\u5931\u8d25: "

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    invoke-direct {p0, p1}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->cancelSnsPrepareTasks(Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    sget-object v1, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->loadedPlugins:Ljava/util/concurrent/ConcurrentHashMap;

    .line 8
    .line 9
    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Leb/a0;

    .line 14
    .line 15
    if-eqz v1, :cond_2

    .line 16
    .line 17
    invoke-direct {p0}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->updateProtobufPacketListener()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 18
    .line 19
    .line 20
    :try_start_1
    iget-object v2, v1, Leb/a0;->b:Lbsh/Interpreter;

    .line 21
    .line 22
    const-string v3, "onUnload"

    .line 23
    .line 24
    invoke-direct {p0, v2, v3}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->callLifecycle(Lbsh/Interpreter;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    sget-object v2, Lsf/n;->a:Lsf/n;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception v2

    .line 31
    :try_start_2
    new-instance v3, Lsf/f;

    .line 32
    .line 33
    invoke-direct {v3, v2}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    move-object v2, v3

    .line 37
    :goto_0
    invoke-static {v2}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    if-eqz v2, :cond_0

    .line 42
    .line 43
    iget-object v1, v1, Leb/a0;->a:Leb/c0;

    .line 44
    .line 45
    iget-object v1, v1, Leb/c0;->b:Ljava/lang/String;

    .line 46
    .line 47
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    new-instance v4, Ljava/lang/StringBuilder;

    .line 52
    .line 53
    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    const-string v0, " "

    .line 60
    .line 61
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-static {v0, v2}, Lfb/v0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 72
    .line 73
    .line 74
    goto :goto_1

    .line 75
    :catchall_1
    move-exception p1

    .line 76
    goto :goto_2

    .line 77
    :cond_0
    :goto_1
    sget-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->bridge:Lh/Hchat/hooks/items/script/ScriptPluginBridge;

    .line 78
    .line 79
    if-eqz v0, :cond_1

    .line 80
    .line 81
    invoke-virtual {v0, p1}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->unhookPlugin(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    :cond_1
    invoke-direct {p0}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->notifyPluginCatalogChanged()V

    .line 85
    .line 86
    .line 87
    sget-object p1, Lsf/n;->a:Lsf/n;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 88
    .line 89
    monitor-exit p0

    .line 90
    return-object p1

    .line 91
    :cond_2
    :try_start_3
    sget-object p1, Lsf/n;->a:Lsf/n;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 92
    .line 93
    monitor-exit p0

    .line 94
    return-object p1

    .line 95
    :goto_2
    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 96
    throw p1
.end method

.method private final updateProtobufPacketListener()V
    .locals 5

    .line 1
    sget-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->protobufListenerLock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->loadedPlugins:Ljava/util/concurrent/ConcurrentHashMap;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    check-cast v1, Ljava/lang/Iterable;

    .line 14
    .line 15
    instance-of v2, v1, Ljava/util/Collection;

    .line 16
    .line 17
    const/4 v3, 0x1

    .line 18
    const/4 v4, 0x0

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    move-object v2, v1

    .line 22
    check-cast v2, Ljava/util/Collection;

    .line 23
    .line 24
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    goto :goto_2

    .line 31
    :catchall_0
    move-exception v1

    .line 32
    goto/16 :goto_5

    .line 33
    .line 34
    :cond_0
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-eqz v2, :cond_6

    .line 43
    .line 44
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    check-cast v2, Leb/a0;

    .line 49
    .line 50
    iget-boolean v2, v2, Leb/a0;->h:Z

    .line 51
    .line 52
    if-eqz v2, :cond_1

    .line 53
    .line 54
    sget-object v1, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->protobufListenerRegistered:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 55
    .line 56
    invoke-virtual {v1, v4, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 57
    .line 58
    .line 59
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    if-nez v1, :cond_2

    .line 61
    .line 62
    monitor-exit v0

    .line 63
    return-void

    .line 64
    :cond_2
    :try_start_1
    sget-object v1, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->protobufPacketListener:Lwa/i;

    .line 65
    .line 66
    if-eqz v1, :cond_3

    .line 67
    .line 68
    sget-object v2, Lwa/j;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 69
    .line 70
    invoke-virtual {v2, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->addIfAbsent(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    if-eqz v1, :cond_4

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_3
    sget-object v1, Lwa/j;->a:Lwa/g;

    .line 78
    .line 79
    :cond_4
    move v3, v4

    .line 80
    :goto_0
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 81
    .line 82
    .line 83
    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 84
    goto :goto_1

    .line 85
    :catchall_1
    move-exception v1

    .line 86
    :try_start_2
    new-instance v2, Lsf/f;

    .line 87
    .line 88
    invoke-direct {v2, v1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 89
    .line 90
    .line 91
    move-object v1, v2

    .line 92
    :goto_1
    invoke-static {v1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    if-eqz v1, :cond_5

    .line 97
    .line 98
    sget-object v2, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->protobufListenerRegistered:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 99
    .line 100
    invoke-virtual {v2, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    new-instance v3, Ljava/lang/StringBuilder;

    .line 108
    .line 109
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 110
    .line 111
    .line 112
    const-string v4, "[Hchat:Script] \u6ce8\u518c\u6570\u636e\u5305\u76d1\u542c\u5668\u5931\u8d25: "

    .line 113
    .line 114
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    invoke-static {v2, v1}, Lfb/v0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 125
    .line 126
    .line 127
    :cond_5
    monitor-exit v0

    .line 128
    return-void

    .line 129
    :cond_6
    :goto_2
    :try_start_3
    sget-object v1, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->protobufListenerRegistered:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 130
    .line 131
    invoke-virtual {v1, v3, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 132
    .line 133
    .line 134
    move-result v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 135
    if-nez v1, :cond_7

    .line 136
    .line 137
    monitor-exit v0

    .line 138
    return-void

    .line 139
    :cond_7
    :try_start_4
    sget-object v1, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->protobufPacketListener:Lwa/i;

    .line 140
    .line 141
    if-eqz v1, :cond_8

    .line 142
    .line 143
    sget-object v2, Lwa/j;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 144
    .line 145
    invoke-virtual {v2, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    if-eqz v1, :cond_9

    .line 150
    .line 151
    move v4, v3

    .line 152
    goto :goto_3

    .line 153
    :cond_8
    sget-object v1, Lwa/j;->a:Lwa/g;

    .line 154
    .line 155
    :cond_9
    :goto_3
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 156
    .line 157
    .line 158
    move-result-object v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 159
    goto :goto_4

    .line 160
    :catchall_2
    move-exception v1

    .line 161
    :try_start_5
    new-instance v2, Lsf/f;

    .line 162
    .line 163
    invoke-direct {v2, v1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 164
    .line 165
    .line 166
    move-object v1, v2

    .line 167
    :goto_4
    invoke-static {v1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    if-eqz v1, :cond_a

    .line 172
    .line 173
    sget-object v2, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->protobufListenerRegistered:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 174
    .line 175
    invoke-virtual {v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    new-instance v3, Ljava/lang/StringBuilder;

    .line 183
    .line 184
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 185
    .line 186
    .line 187
    const-string v4, "[Hchat:Script] \u6ce8\u9500\u6570\u636e\u5305\u76d1\u542c\u5668\u5931\u8d25: "

    .line 188
    .line 189
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    invoke-static {v2, v1}, Lfb/v0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 200
    .line 201
    .line 202
    :cond_a
    monitor-exit v0

    .line 203
    return-void

    .line 204
    :goto_5
    monitor-exit v0

    .line 205
    throw v1
.end method

.method public static synthetic v(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->reloadPluginAsync$lambda$0(Landroid/content/Context;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final validateNativeLibrary(Ljava/io/File;)V
    .locals 6

    .line 1
    const/16 v0, 0x14

    .line 2
    .line 3
    new-array v1, v0, [B

    .line 4
    .line 5
    new-instance v2, Ljava/io/FileInputStream;

    .line 6
    .line 7
    invoke-direct {v2, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 8
    .line 9
    .line 10
    :try_start_0
    invoke-virtual {v2, v1}, Ljava/io/FileInputStream;->read([B)I

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    invoke-interface {v2}, Ljava/io/Closeable;->close()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-ne v2, v0, :cond_8

    .line 26
    .line 27
    const/4 v0, 0x0

    .line 28
    aget-byte v2, v1, v0

    .line 29
    .line 30
    const/16 v3, 0x7f

    .line 31
    .line 32
    if-ne v2, v3, :cond_8

    .line 33
    .line 34
    const/4 v2, 0x1

    .line 35
    aget-byte v3, v1, v2

    .line 36
    .line 37
    const/16 v4, 0x45

    .line 38
    .line 39
    if-ne v3, v4, :cond_8

    .line 40
    .line 41
    const/4 v3, 0x2

    .line 42
    aget-byte v4, v1, v3

    .line 43
    .line 44
    const/16 v5, 0x4c

    .line 45
    .line 46
    if-ne v4, v5, :cond_8

    .line 47
    .line 48
    const/4 v4, 0x3

    .line 49
    aget-byte v4, v1, v4

    .line 50
    .line 51
    const/16 v5, 0x46

    .line 52
    .line 53
    if-ne v4, v5, :cond_8

    .line 54
    .line 55
    invoke-static {}, Landroid/os/Process;->is64Bit()Z

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    if-eqz v4, :cond_0

    .line 60
    .line 61
    move v4, v3

    .line 62
    goto :goto_0

    .line 63
    :cond_0
    move v4, v2

    .line 64
    :goto_0
    const/4 v5, 0x4

    .line 65
    aget-byte v5, v1, v5

    .line 66
    .line 67
    if-ne v5, v4, :cond_7

    .line 68
    .line 69
    const/4 v4, 0x5

    .line 70
    aget-byte v4, v1, v4

    .line 71
    .line 72
    if-ne v4, v2, :cond_1

    .line 73
    .line 74
    move v0, v2

    .line 75
    :cond_1
    if-nez v0, :cond_3

    .line 76
    .line 77
    if-ne v4, v3, :cond_2

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_2
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    const-string v0, "SO\u5b57\u8282\u5e8f\u65e0\u6548: "

    .line 85
    .line 86
    invoke-static {v0, p1}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-static {p1}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :cond_3
    :goto_1
    const/16 v2, 0x13

    .line 95
    .line 96
    const/16 v3, 0x12

    .line 97
    .line 98
    if-eqz v0, :cond_4

    .line 99
    .line 100
    aget-byte v0, v1, v3

    .line 101
    .line 102
    and-int/lit16 v0, v0, 0xff

    .line 103
    .line 104
    aget-byte v1, v1, v2

    .line 105
    .line 106
    and-int/lit16 v1, v1, 0xff

    .line 107
    .line 108
    shl-int/lit8 v1, v1, 0x8

    .line 109
    .line 110
    :goto_2
    or-int/2addr v0, v1

    .line 111
    goto :goto_3

    .line 112
    :cond_4
    aget-byte v0, v1, v3

    .line 113
    .line 114
    and-int/lit16 v0, v0, 0xff

    .line 115
    .line 116
    shl-int/lit8 v0, v0, 0x8

    .line 117
    .line 118
    aget-byte v1, v1, v2

    .line 119
    .line 120
    and-int/lit16 v1, v1, 0xff

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :goto_3
    invoke-static {}, Landroid/os/Process;->is64Bit()Z

    .line 124
    .line 125
    .line 126
    move-result v1

    .line 127
    if-eqz v1, :cond_5

    .line 128
    .line 129
    const/16 v1, 0xb7

    .line 130
    .line 131
    goto :goto_4

    .line 132
    :cond_5
    const/16 v1, 0x28

    .line 133
    .line 134
    :goto_4
    if-ne v0, v1, :cond_6

    .line 135
    .line 136
    return-void

    .line 137
    :cond_6
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    const-string v0, "SO\u67b6\u6784\u4e0e\u5fae\u4fe1\u8fdb\u7a0b\u4e0d\u5339\u914d: "

    .line 142
    .line 143
    invoke-static {v0, p1}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    invoke-static {p1}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    return-void

    .line 151
    :cond_7
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    const-string v0, "SO\u4f4d\u6570\u4e0e\u5fae\u4fe1\u8fdb\u7a0b\u4e0d\u5339\u914d: "

    .line 156
    .line 157
    invoke-static {v0, p1}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    invoke-static {p1}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    return-void

    .line 165
    :cond_8
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    const-string v0, "\u4e0d\u662f\u6709\u6548\u7684ELF\u6587\u4ef6: "

    .line 170
    .line 171
    invoke-static {v0, p1}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    invoke-static {p1}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    return-void

    .line 179
    :catchall_0
    move-exception p1

    .line 180
    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 181
    :catchall_1
    move-exception v0

    .line 182
    invoke-static {v2, p1}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 183
    .line 184
    .line 185
    throw v0
.end method

.method public static synthetic w(Ljava/io/File;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->refreshPluginDirObservers$lambda$0(Ljava/io/File;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final withInterpreterLock(Lbsh/Interpreter;Lfg/a;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lbsh/Interpreter;",
            "Lfg/a;",
            ")TT;"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->interpreterLock(Lbsh/Interpreter;)Ljava/util/concurrent/locks/ReentrantLock;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 6
    .line 7
    .line 8
    :try_start_0
    invoke-interface {p2}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 13
    .line 14
    .line 15
    return-object p2

    .line 16
    :catchall_0
    move-exception p2

    .line 17
    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 18
    .line 19
    .line 20
    throw p2
.end method

.method private final writePluginLoadError(Leb/c0;Ljava/lang/Throwable;)V
    .locals 6

    .line 1
    const-string v0, "] ERROR \u63d2\u4ef6\u52a0\u8f7d\u5931\u8d25\n"

    .line 2
    .line 3
    const-string v1, "["

    .line 4
    .line 5
    :try_start_0
    iget-object v2, p1, Leb/c0;->c:Ljava/io/File;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/io/File;->isDirectory()Z

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    if-nez v3, :cond_0

    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception p2

    .line 18
    goto :goto_1

    .line 19
    :cond_0
    :goto_0
    new-instance v3, Ljava/text/SimpleDateFormat;

    .line 20
    .line 21
    const-string v4, "yyyy-MM-dd HH:mm:ss.SSS"

    .line 22
    .line 23
    sget-object v5, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 24
    .line 25
    invoke-direct {v3, v4, v5}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 26
    .line 27
    .line 28
    new-instance v4, Ljava/util/Date;

    .line 29
    .line 30
    invoke-direct {v4}, Ljava/util/Date;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v3, v4}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    new-instance v4, Ljava/io/File;

    .line 38
    .line 39
    const-string v5, "log.txt"

    .line 40
    .line 41
    invoke-direct {v4, v2, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    new-instance v2, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    const-string v0, ": "

    .line 67
    .line 68
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    if-nez p2, :cond_1

    .line 76
    .line 77
    const-string p2, ""

    .line 78
    .line 79
    :cond_1
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    const/16 p2, 0xa

    .line 83
    .line 84
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    invoke-static {v4, p2}, Ldg/l;->Z(Ljava/io/File;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    sget-object p2, Lsf/n;->a:Lsf/n;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :goto_1
    new-instance v0, Lsf/f;

    .line 98
    .line 99
    invoke-direct {v0, p2}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 100
    .line 101
    .line 102
    move-object p2, v0

    .line 103
    :goto_2
    invoke-static {p2}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 104
    .line 105
    .line 106
    move-result-object p2

    .line 107
    if-eqz p2, :cond_2

    .line 108
    .line 109
    iget-object p1, p1, Leb/c0;->b:Ljava/lang/String;

    .line 110
    .line 111
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    const-string v1, "[Hchat:Script] \u5199\u5165\u63d2\u4ef6\u52a0\u8f7d\u9519\u8bef\u65e5\u5fd7\u5931\u8d25: "

    .line 116
    .line 117
    const-string v2, " "

    .line 118
    .line 119
    invoke-static {v1, p1, v2, v0, p2}, Leh/a;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 120
    .line 121
    .line 122
    :cond_2
    return-void
.end method

.method public static synthetic x(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p1, p0}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->schedulePluginReload$lambda$0(Ljava/lang/String;Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic y(Leb/a0;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->dispatchOnImageDownload$lambda$2$0(Leb/a0;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method


# virtual methods
.method public final callOpenSettings-IoAF18A(Ljava/lang/String;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->loadedPlugins:Ljava/util/concurrent/ConcurrentHashMap;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, Leb/a0;

    .line 11
    .line 12
    if-eqz p1, :cond_3

    .line 13
    .line 14
    iget-boolean v0, p1, Leb/a0;->e:Z

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 19
    .line 20
    const-string v0, "\u63d2\u4ef6\u6ca1\u6709\u8bbe\u7f6e\u5165\u53e3"

    .line 21
    .line 22
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    new-instance v0, Lsf/f;

    .line 26
    .line 27
    invoke-direct {v0, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    return-object v0

    .line 31
    :cond_0
    :try_start_0
    iget-object v0, p1, Leb/a0;->b:Lbsh/Interpreter;

    .line 32
    .line 33
    invoke-direct {p0, v0}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->interpreterLock(Lbsh/Interpreter;)Ljava/util/concurrent/locks/ReentrantLock;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    .line 40
    :try_start_1
    iget-object v1, p1, Leb/a0;->b:Lbsh/Interpreter;

    .line 41
    .line 42
    const-string v2, "openSettings();"

    .line 43
    .line 44
    invoke-virtual {v1, v2}, Lbsh/Interpreter;->eval(Ljava/lang/String;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 48
    :try_start_2
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :catchall_0
    move-exception v0

    .line 53
    goto :goto_0

    .line 54
    :catchall_1
    move-exception v1

    .line 55
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 56
    .line 57
    .line 58
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 59
    :goto_0
    new-instance v1, Lsf/f;

    .line 60
    .line 61
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 62
    .line 63
    .line 64
    :goto_1
    instance-of v0, v1, Lsf/f;

    .line 65
    .line 66
    if-nez v0, :cond_1

    .line 67
    .line 68
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 69
    .line 70
    :cond_1
    invoke-static {v1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    if-eqz v0, :cond_2

    .line 75
    .line 76
    iget-object v2, p1, Leb/a0;->a:Leb/c0;

    .line 77
    .line 78
    iget-object v2, v2, Leb/c0;->b:Ljava/lang/String;

    .line 79
    .line 80
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    const-string v4, "[Hchat:Script] \u63d2\u4ef6\u8bbe\u7f6e\u5165\u53e3\u5931\u8d25: "

    .line 85
    .line 86
    const-string v5, " "

    .line 87
    .line 88
    invoke-static {v4, v2, v5, v3, v0}, Leh/a;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 89
    .line 90
    .line 91
    sget-object v2, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->bridge:Lh/Hchat/hooks/items/script/ScriptPluginBridge;

    .line 92
    .line 93
    if-eqz v2, :cond_2

    .line 94
    .line 95
    iget-object p1, p1, Leb/a0;->a:Leb/c0;

    .line 96
    .line 97
    iget-object v3, p1, Leb/c0;->b:Ljava/lang/String;

    .line 98
    .line 99
    iget-object p1, p1, Leb/c0;->c:Ljava/io/File;

    .line 100
    .line 101
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    new-instance v4, Ljava/lang/StringBuilder;

    .line 106
    .line 107
    const-string v5, "\u8bbe\u7f6e\u5165\u53e3\u5931\u8d25: "

    .line 108
    .line 109
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    invoke-virtual {v2, v3, p1, v0}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->log(Ljava/lang/String;Ljava/io/File;Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    :cond_2
    return-object v1

    .line 123
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 124
    .line 125
    const-string v0, "\u63d2\u4ef6\u672a\u5f00\u542f"

    .line 126
    .line 127
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    new-instance v0, Lsf/f;

    .line 131
    .line 132
    invoke-direct {v0, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 133
    .line 134
    .line 135
    return-object v0
.end method

.method public final varargs callPluginFunction-0E7RQCE(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    sget-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->loadedPlugins:Ljava/util/concurrent/ConcurrentHashMap;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    move-object v1, v0

    .line 17
    check-cast v1, Leb/a0;

    .line 18
    .line 19
    if-eqz v1, :cond_4

    .line 20
    .line 21
    const-string p1, "[A-Za-z_][A-Za-z0-9_]*"

    .line 22
    .line 23
    invoke-static {p1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, p2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p1}, Ljava/util/regex/Matcher;->matches()Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-nez p1, :cond_0

    .line 39
    .line 40
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 41
    .line 42
    const-string p3, "\u975e\u6cd5\u51fd\u6570\u540d: "

    .line 43
    .line 44
    invoke-virtual {p3, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    new-instance p2, Lsf/f;

    .line 52
    .line 53
    invoke-direct {p2, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 54
    .line 55
    .line 56
    return-object p2

    .line 57
    :cond_0
    :try_start_0
    iget-object p1, v1, Leb/a0;->b:Lbsh/Interpreter;

    .line 58
    .line 59
    invoke-direct {p0, p1}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->interpreterLock(Lbsh/Interpreter;)Ljava/util/concurrent/locks/ReentrantLock;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 64
    .line 65
    .line 66
    :try_start_1
    invoke-static {p3}, Ltf/l;->A0([Ljava/lang/Object;)Llg/d;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    new-instance v2, Ljava/util/ArrayList;

    .line 71
    .line 72
    invoke-static {v0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0}, Llg/b;->iterator()Ljava/util/Iterator;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    :goto_0
    move-object v3, v0

    .line 84
    check-cast v3, Llg/c;

    .line 85
    .line 86
    iget-boolean v3, v3, Llg/c;->i:Z

    .line 87
    .line 88
    if-eqz v3, :cond_1

    .line 89
    .line 90
    move-object v3, v0

    .line 91
    check-cast v3, Llg/c;

    .line 92
    .line 93
    invoke-virtual {v3}, Llg/c;->next()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    check-cast v3, Ljava/lang/Number;

    .line 98
    .line 99
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    new-instance v4, Ljava/lang/StringBuilder;

    .line 104
    .line 105
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 106
    .line 107
    .line 108
    const-string v5, "__hchat_call_arg_"

    .line 109
    .line 110
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    goto :goto_0

    .line 124
    :catchall_0
    move-exception v0

    .line 125
    move-object p3, v0

    .line 126
    goto :goto_2

    .line 127
    :cond_1
    array-length v0, p3

    .line 128
    const/4 v3, 0x0

    .line 129
    move v4, v3

    .line 130
    :goto_1
    if-ge v3, v0, :cond_2

    .line 131
    .line 132
    aget-object v5, p3, v3

    .line 133
    .line 134
    add-int/lit8 v6, v4, 0x1

    .line 135
    .line 136
    iget-object v7, v1, Leb/a0;->b:Lbsh/Interpreter;

    .line 137
    .line 138
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v4

    .line 142
    check-cast v4, Ljava/lang/String;

    .line 143
    .line 144
    invoke-virtual {v7, v4, v5}, Lbsh/Interpreter;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    add-int/lit8 v3, v3, 0x1

    .line 148
    .line 149
    move v4, v6

    .line 150
    goto :goto_1

    .line 151
    :cond_2
    iget-object p3, v1, Leb/a0;->b:Lbsh/Interpreter;

    .line 152
    .line 153
    const-string v3, ","

    .line 154
    .line 155
    const/4 v6, 0x0

    .line 156
    const/16 v7, 0x3e

    .line 157
    .line 158
    const/4 v4, 0x0

    .line 159
    const/4 v5, 0x0

    .line 160
    invoke-static/range {v2 .. v7}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    new-instance v2, Ljava/lang/StringBuilder;

    .line 165
    .line 166
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    const-string v3, "("

    .line 173
    .line 174
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    const-string v0, ");"

    .line 181
    .line 182
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    invoke-virtual {p3, v0}, Lbsh/Interpreter;->eval(Ljava/lang/String;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object p3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 193
    :try_start_2
    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 194
    .line 195
    .line 196
    goto :goto_4

    .line 197
    :catchall_1
    move-exception v0

    .line 198
    move-object p1, v0

    .line 199
    goto :goto_3

    .line 200
    :goto_2
    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 201
    .line 202
    .line 203
    throw p3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 204
    :goto_3
    new-instance p3, Lsf/f;

    .line 205
    .line 206
    invoke-direct {p3, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 207
    .line 208
    .line 209
    :goto_4
    invoke-static {p3}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 210
    .line 211
    .line 212
    move-result-object p1

    .line 213
    if-eqz p1, :cond_3

    .line 214
    .line 215
    iget-object v0, v1, Leb/a0;->a:Leb/c0;

    .line 216
    .line 217
    iget-object v0, v0, Leb/c0;->b:Ljava/lang/String;

    .line 218
    .line 219
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v2

    .line 223
    const-string v3, "[Hchat:Script] \u8c03\u7528\u63d2\u4ef6\u51fd\u6570\u5931\u8d25: "

    .line 224
    .line 225
    const-string v4, "#"

    .line 226
    .line 227
    const-string v5, " "

    .line 228
    .line 229
    invoke-static {v3, v0, v4, p2, v5}, Lbc/e;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    invoke-static {v0, p1}, Lfb/v0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 241
    .line 242
    .line 243
    sget-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->bridge:Lh/Hchat/hooks/items/script/ScriptPluginBridge;

    .line 244
    .line 245
    if-eqz v0, :cond_3

    .line 246
    .line 247
    iget-object v1, v1, Leb/a0;->a:Leb/c0;

    .line 248
    .line 249
    iget-object v2, v1, Leb/c0;->b:Ljava/lang/String;

    .line 250
    .line 251
    iget-object v1, v1, Leb/c0;->c:Ljava/io/File;

    .line 252
    .line 253
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object p1

    .line 257
    const-string v3, "\u8c03\u7528\u63d2\u4ef6\u51fd\u6570\u5931\u8d25: "

    .line 258
    .line 259
    invoke-static {v3, p2, v5, p1}, Lbc/e;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object p1

    .line 263
    invoke-virtual {v0, v2, v1, p1}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->log(Ljava/lang/String;Ljava/io/File;Ljava/lang/Object;)V

    .line 264
    .line 265
    .line 266
    :cond_3
    return-object p3

    .line 267
    :cond_4
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 268
    .line 269
    const-string p3, "\u63d2\u4ef6\u672a\u5f00\u542f: "

    .line 270
    .line 271
    invoke-virtual {p3, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object p1

    .line 275
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    new-instance p1, Lsf/f;

    .line 279
    .line 280
    invoke-direct {p1, p2}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 281
    .line 282
    .line 283
    return-object p1
.end method

.method public final canOpenSettings(Leb/c0;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "main"

    .line 5
    .line 6
    invoke-direct {p0, p1, v0}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->supportsProcess(Leb/c0;Ljava/lang/String;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    return p1

    .line 14
    :cond_0
    iget-object v0, p1, Leb/c0;->a:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->hasOpenSettings(Ljava/lang/String;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    const/4 p1, 0x1

    .line 23
    return p1

    .line 24
    :cond_1
    :try_start_0
    iget-object p1, p1, Leb/c0;->d:Ljava/io/File;

    .line 25
    .line 26
    sget-object v0, Log/a;->a:Ljava/nio/charset/Charset;

    .line 27
    .line 28
    invoke-static {p1, v0}, Ldg/l;->h0(Ljava/io/File;Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-direct {p0, p1}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->detectCallbacks(Ljava/lang/String;)Leb/y;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iget-boolean p1, p1, Leb/y;->c:Z

    .line 37
    .line 38
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 39
    .line 40
    .line 41
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    goto :goto_0

    .line 43
    :catchall_0
    move-exception p1

    .line 44
    new-instance v0, Lsf/f;

    .line 45
    .line 46
    invoke-direct {v0, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 47
    .line 48
    .line 49
    move-object p1, v0

    .line 50
    :goto_0
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 51
    .line 52
    instance-of v1, p1, Lsf/f;

    .line 53
    .line 54
    if-eqz v1, :cond_2

    .line 55
    .line 56
    move-object p1, v0

    .line 57
    :cond_2
    check-cast p1, Ljava/lang/Boolean;

    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    return p1
.end method

.method public final compileSnapshot(Ljava/lang/String;Ljava/io/File;Lbsh/Interpreter;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-direct {p0, p2, p4}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->resolvePluginFile(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    invoke-virtual {p2}, Ljava/io/File;->isFile()Z

    .line 18
    .line 19
    .line 20
    move-result p4

    .line 21
    if-eqz p4, :cond_0

    .line 22
    .line 23
    new-instance p4, Ljava/io/File;

    .line 24
    .line 25
    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const-string v1, ".bshs"

    .line 30
    .line 31
    invoke-static {v0, v1}, Lbc/e;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-direct {p4, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-direct {p0, p3}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->interpreterLock(Lbsh/Interpreter;)Ljava/util/concurrent/locks/ReentrantLock;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 43
    .line 44
    .line 45
    :try_start_0
    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    invoke-virtual {p4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    sget-object v2, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->INSTANCE:Lh/Hchat/hooks/items/script/ScriptPluginRuntime;

    .line 54
    .line 55
    invoke-direct {v2, p1}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->snapshotKey(Ljava/lang/String;)Ljavax/crypto/SecretKey;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-virtual {p3, p2, v1, p1}, Lbsh/Interpreter;->compileSnapshot(Ljava/lang/String;Ljava/lang/String;Ljavax/crypto/SecretKey;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    return-object p1

    .line 73
    :catchall_0
    move-exception p1

    .line 74
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 75
    .line 76
    .line 77
    throw p1

    .line 78
    :cond_0
    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    const-string p2, "\u6e90\u811a\u672c\u4e0d\u5b58\u5728: "

    .line 83
    .line 84
    invoke-static {p2, p1}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-static {p1}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    const/4 p1, 0x0

    .line 92
    return-object p1
.end method

.method public final compileSnapshot(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 93
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->loadedPlugins:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leb/a0;

    if-eqz v0, :cond_0

    .line 94
    iget-object v1, v0, Leb/a0;->a:Leb/c0;

    .line 95
    iget-object v1, v1, Leb/c0;->c:Ljava/io/File;

    .line 96
    iget-object v0, v0, Leb/a0;->b:Lbsh/Interpreter;

    .line 97
    invoke-virtual {p0, p1, v1, v0, p2}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->compileSnapshot(Ljava/lang/String;Ljava/io/File;Lbsh/Interpreter;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 98
    :cond_0
    const-string p1, "\u63d2\u4ef6\u672a\u5f00\u542f"

    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public final dispatchOnClickSendBtn(Ljava/lang/String;)Leb/d0;
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-string v2, "slow:"

    .line 4
    .line 5
    sget-object v0, Ltf/t;->g:Ltf/t;

    .line 6
    .line 7
    const-string v3, "ms"

    .line 8
    .line 9
    const-string v4, "\u53d1\u9001\u6309\u94ae\u56de\u8c03\u8017\u65f6: "

    .line 10
    .line 11
    const-string v5, " "

    .line 12
    .line 13
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    sget-object v6, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->loadedPlugins:Ljava/util/concurrent/ConcurrentHashMap;

    .line 17
    .line 18
    invoke-virtual {v6}, Ljava/util/concurrent/ConcurrentHashMap;->isEmpty()Z

    .line 19
    .line 20
    .line 21
    move-result v7

    .line 22
    const/4 v8, 0x0

    .line 23
    if-eqz v7, :cond_0

    .line 24
    .line 25
    new-instance v2, Leb/d0;

    .line 26
    .line 27
    invoke-direct {v2, v0, v8}, Leb/d0;-><init>(Ljava/util/List;Z)V

    .line 28
    .line 29
    .line 30
    return-object v2

    .line 31
    :cond_0
    new-instance v7, Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v6}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 37
    .line 38
    .line 39
    move-result-object v6

    .line 40
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    check-cast v6, Ljava/lang/Iterable;

    .line 44
    .line 45
    new-instance v9, Ldg/n;

    .line 46
    .line 47
    const/4 v10, 0x6

    .line 48
    invoke-direct {v9, v6, v10}, Ldg/n;-><init>(Ljava/lang/Object;I)V

    .line 49
    .line 50
    .line 51
    new-instance v6, Le9/h;

    .line 52
    .line 53
    const/16 v10, 0x11

    .line 54
    .line 55
    invoke-direct {v6, v10}, Le9/h;-><init>(I)V

    .line 56
    .line 57
    .line 58
    new-instance v10, Lng/i;

    .line 59
    .line 60
    const/4 v11, 0x1

    .line 61
    invoke-direct {v10, v9, v11, v6}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 62
    .line 63
    .line 64
    new-instance v6, La9/h;

    .line 65
    .line 66
    const/16 v9, 0xb

    .line 67
    .line 68
    invoke-direct {v6, v9}, La9/h;-><init>(I)V

    .line 69
    .line 70
    .line 71
    new-instance v9, Ljava/util/ArrayList;

    .line 72
    .line 73
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 74
    .line 75
    .line 76
    invoke-static {v10, v9}, Lng/m;->a0(Lng/j;Ljava/util/AbstractCollection;)V

    .line 77
    .line 78
    .line 79
    invoke-static {v9, v6}, Ltf/q;->g1(Ljava/util/List;Ljava/util/Comparator;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 87
    .line 88
    .line 89
    move-result v9

    .line 90
    if-nez v9, :cond_1

    .line 91
    .line 92
    move-object v6, v0

    .line 93
    goto :goto_1

    .line 94
    :cond_1
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v9

    .line 98
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 99
    .line 100
    .line 101
    move-result v10

    .line 102
    if-nez v10, :cond_2

    .line 103
    .line 104
    invoke-static {v9}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    goto :goto_1

    .line 109
    :cond_2
    new-instance v10, Ljava/util/ArrayList;

    .line 110
    .line 111
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v10, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 118
    .line 119
    .line 120
    move-result v9

    .line 121
    if-eqz v9, :cond_3

    .line 122
    .line 123
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v9

    .line 127
    invoke-virtual {v10, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    goto :goto_0

    .line 131
    :cond_3
    move-object v6, v10

    .line 132
    :goto_1
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    .line 133
    .line 134
    .line 135
    move-result v9

    .line 136
    if-eqz v9, :cond_4

    .line 137
    .line 138
    new-instance v2, Leb/d0;

    .line 139
    .line 140
    invoke-direct {v2, v0, v8}, Leb/d0;-><init>(Ljava/util/List;Z)V

    .line 141
    .line 142
    .line 143
    return-object v2

    .line 144
    :cond_4
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 145
    .line 146
    .line 147
    move-result-object v6

    .line 148
    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    if-eqz v0, :cond_d

    .line 153
    .line 154
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    move-object v9, v0

    .line 162
    check-cast v9, Leb/a0;

    .line 163
    .line 164
    iget-object v0, v9, Leb/a0;->b:Lbsh/Interpreter;

    .line 165
    .line 166
    invoke-direct {v1, v0}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->interpreterLock(Lbsh/Interpreter;)Ljava/util/concurrent/locks/ReentrantLock;

    .line 167
    .line 168
    .line 169
    move-result-object v10

    .line 170
    invoke-virtual {v10}, Ljava/util/concurrent/locks/ReentrantLock;->tryLock()Z

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    if-nez v0, :cond_5

    .line 175
    .line 176
    invoke-direct {v1, v9}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->logBusySendButtonPlugin(Leb/a0;)V

    .line 177
    .line 178
    .line 179
    goto :goto_2

    .line 180
    :cond_5
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 181
    .line 182
    .line 183
    move-result-wide v12

    .line 184
    :try_start_0
    iget-object v0, v9, Leb/a0;->b:Lbsh/Interpreter;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 185
    .line 186
    const-wide/16 v16, 0x32

    .line 187
    .line 188
    :try_start_1
    const-string v14, "__hchat_send_text"
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 189
    .line 190
    move-object/from16 v15, p1

    .line 191
    .line 192
    :try_start_2
    invoke-virtual {v0, v14, v15}, Lbsh/Interpreter;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    iget-object v0, v9, Leb/a0;->b:Lbsh/Interpreter;

    .line 196
    .line 197
    const-string v14, "onClickSendBtn(__hchat_send_text);"

    .line 198
    .line 199
    invoke-virtual {v0, v14}, Lbsh/Interpreter;->eval(Ljava/lang/String;)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    sget-object v14, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 204
    .line 205
    invoke-static {v0, v14}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    move-result v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 209
    if-eqz v0, :cond_6

    .line 210
    .line 211
    :try_start_3
    iget-object v0, v9, Leb/a0;->a:Leb/c0;

    .line 212
    .line 213
    iget-object v0, v0, Leb/c0;->b:Ljava/lang/String;

    .line 214
    .line 215
    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 216
    .line 217
    .line 218
    move v8, v11

    .line 219
    goto :goto_3

    .line 220
    :catchall_0
    move-exception v0

    .line 221
    move v8, v11

    .line 222
    goto :goto_4

    .line 223
    :cond_6
    :goto_3
    invoke-virtual {v10}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 224
    .line 225
    .line 226
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 227
    .line 228
    .line 229
    move-result-wide v18

    .line 230
    sub-long v12, v18, v12

    .line 231
    .line 232
    cmp-long v0, v12, v16

    .line 233
    .line 234
    if-ltz v0, :cond_7

    .line 235
    .line 236
    iget-object v0, v9, Leb/a0;->a:Leb/c0;

    .line 237
    .line 238
    iget-object v0, v0, Leb/c0;->a:Ljava/lang/String;

    .line 239
    .line 240
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    iget-object v9, v9, Leb/a0;->a:Leb/c0;

    .line 245
    .line 246
    iget-object v9, v9, Leb/c0;->b:Ljava/lang/String;

    .line 247
    .line 248
    invoke-static {v4, v9, v5, v12, v13}, Leh/a;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Ljava/lang/StringBuilder;

    .line 249
    .line 250
    .line 251
    move-result-object v9

    .line 252
    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 253
    .line 254
    .line 255
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v9

    .line 259
    invoke-direct {v1, v0, v9}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->logSendButtonDiagnostic(Ljava/lang/String;Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    :cond_7
    move-object/from16 v18, v6

    .line 263
    .line 264
    goto/16 :goto_7

    .line 265
    .line 266
    :catchall_1
    move-exception v0

    .line 267
    goto :goto_4

    .line 268
    :catchall_2
    move-exception v0

    .line 269
    move-object/from16 v15, p1

    .line 270
    .line 271
    goto :goto_4

    .line 272
    :catchall_3
    move-exception v0

    .line 273
    move-object/from16 v15, p1

    .line 274
    .line 275
    const-wide/16 v16, 0x32

    .line 276
    .line 277
    :goto_4
    :try_start_4
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v14

    .line 281
    if-nez v14, :cond_8

    .line 282
    .line 283
    const-string v14, ""

    .line 284
    .line 285
    :cond_8
    move-object/from16 v18, v6

    .line 286
    .line 287
    goto :goto_5

    .line 288
    :catchall_4
    move-exception v0

    .line 289
    move-object/from16 v21, v10

    .line 290
    .line 291
    goto/16 :goto_8

    .line 292
    .line 293
    :goto_5
    const-string v6, "Command not found"

    .line 294
    .line 295
    invoke-static {v14, v6, v11}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 296
    .line 297
    .line 298
    move-result v6

    .line 299
    if-nez v6, :cond_9

    .line 300
    .line 301
    const-string v6, "undefined"

    .line 302
    .line 303
    invoke-static {v14, v6, v11}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 304
    .line 305
    .line 306
    move-result v6

    .line 307
    if-nez v6, :cond_9

    .line 308
    .line 309
    const-string v6, "not found"

    .line 310
    .line 311
    invoke-static {v14, v6, v11}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 312
    .line 313
    .line 314
    move-result v6

    .line 315
    if-nez v6, :cond_9

    .line 316
    .line 317
    iget-object v6, v9, Leb/a0;->a:Leb/c0;

    .line 318
    .line 319
    iget-object v6, v6, Leb/c0;->b:Ljava/lang/String;

    .line 320
    .line 321
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 322
    .line 323
    .line 324
    move-result-object v14

    .line 325
    new-instance v11, Ljava/lang/StringBuilder;

    .line 326
    .line 327
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 328
    .line 329
    .line 330
    move/from16 v20, v8

    .line 331
    .line 332
    const-string v8, "[Hchat:Script] \u53d1\u9001\u6309\u94ae\u56de\u8c03\u5931\u8d25: "

    .line 333
    .line 334
    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 335
    .line 336
    .line 337
    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 338
    .line 339
    .line 340
    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 341
    .line 342
    .line 343
    invoke-virtual {v11, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 344
    .line 345
    .line 346
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object v6

    .line 350
    invoke-static {v6, v0}, Lfb/v0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 351
    .line 352
    .line 353
    sget-object v6, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->bridge:Lh/Hchat/hooks/items/script/ScriptPluginBridge;

    .line 354
    .line 355
    if-eqz v6, :cond_a

    .line 356
    .line 357
    iget-object v8, v9, Leb/a0;->a:Leb/c0;

    .line 358
    .line 359
    iget-object v11, v8, Leb/c0;->b:Ljava/lang/String;

    .line 360
    .line 361
    iget-object v8, v8, Leb/c0;->c:Ljava/io/File;

    .line 362
    .line 363
    new-instance v14, Ljava/lang/StringBuilder;

    .line 364
    .line 365
    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 366
    .line 367
    .line 368
    move-object/from16 v21, v10

    .line 369
    .line 370
    :try_start_5
    const-string v10, "\u53d1\u9001\u6309\u94ae\u56de\u8c03\u5931\u8d25: "

    .line 371
    .line 372
    invoke-virtual {v14, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 373
    .line 374
    .line 375
    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 376
    .line 377
    .line 378
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 379
    .line 380
    .line 381
    move-result-object v0

    .line 382
    invoke-virtual {v6, v11, v8, v0}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->log(Ljava/lang/String;Ljava/io/File;Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 383
    .line 384
    .line 385
    goto :goto_6

    .line 386
    :catchall_5
    move-exception v0

    .line 387
    goto :goto_8

    .line 388
    :cond_9
    move/from16 v20, v8

    .line 389
    .line 390
    :cond_a
    move-object/from16 v21, v10

    .line 391
    .line 392
    :goto_6
    invoke-virtual/range {v21 .. v21}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 393
    .line 394
    .line 395
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 396
    .line 397
    .line 398
    move-result-wide v10

    .line 399
    sub-long/2addr v10, v12

    .line 400
    cmp-long v0, v10, v16

    .line 401
    .line 402
    if-ltz v0, :cond_b

    .line 403
    .line 404
    iget-object v0, v9, Leb/a0;->a:Leb/c0;

    .line 405
    .line 406
    iget-object v0, v0, Leb/c0;->a:Ljava/lang/String;

    .line 407
    .line 408
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 409
    .line 410
    .line 411
    move-result-object v0

    .line 412
    iget-object v6, v9, Leb/a0;->a:Leb/c0;

    .line 413
    .line 414
    iget-object v6, v6, Leb/c0;->b:Ljava/lang/String;

    .line 415
    .line 416
    invoke-static {v4, v6, v5, v10, v11}, Leh/a;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Ljava/lang/StringBuilder;

    .line 417
    .line 418
    .line 419
    move-result-object v6

    .line 420
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 421
    .line 422
    .line 423
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 424
    .line 425
    .line 426
    move-result-object v6

    .line 427
    invoke-direct {v1, v0, v6}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->logSendButtonDiagnostic(Ljava/lang/String;Ljava/lang/String;)V

    .line 428
    .line 429
    .line 430
    :cond_b
    move/from16 v8, v20

    .line 431
    .line 432
    :goto_7
    move-object/from16 v6, v18

    .line 433
    .line 434
    const/4 v11, 0x1

    .line 435
    goto/16 :goto_2

    .line 436
    .line 437
    :goto_8
    invoke-virtual/range {v21 .. v21}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 438
    .line 439
    .line 440
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 441
    .line 442
    .line 443
    move-result-wide v6

    .line 444
    sub-long/2addr v6, v12

    .line 445
    cmp-long v8, v6, v16

    .line 446
    .line 447
    if-ltz v8, :cond_c

    .line 448
    .line 449
    iget-object v8, v9, Leb/a0;->a:Leb/c0;

    .line 450
    .line 451
    iget-object v8, v8, Leb/c0;->a:Ljava/lang/String;

    .line 452
    .line 453
    invoke-virtual {v2, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 454
    .line 455
    .line 456
    move-result-object v2

    .line 457
    iget-object v8, v9, Leb/a0;->a:Leb/c0;

    .line 458
    .line 459
    iget-object v8, v8, Leb/c0;->b:Ljava/lang/String;

    .line 460
    .line 461
    invoke-static {v4, v8, v5, v6, v7}, Leh/a;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Ljava/lang/StringBuilder;

    .line 462
    .line 463
    .line 464
    move-result-object v4

    .line 465
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 466
    .line 467
    .line 468
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 469
    .line 470
    .line 471
    move-result-object v3

    .line 472
    invoke-direct {v1, v2, v3}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->logSendButtonDiagnostic(Ljava/lang/String;Ljava/lang/String;)V

    .line 473
    .line 474
    .line 475
    :cond_c
    throw v0

    .line 476
    :cond_d
    new-instance v0, Leb/d0;

    .line 477
    .line 478
    invoke-direct {v0, v7, v8}, Leb/d0;-><init>(Ljava/util/List;Z)V

    .line 479
    .line 480
    .line 481
    return-object v0
.end method

.method public final dispatchOnHandleMsg(Lh/Hchat/hooks/items/script/ScriptMessageBean;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->loadedPlugins:Ljava/util/concurrent/ConcurrentHashMap;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    goto/16 :goto_4

    .line 13
    .line 14
    :cond_0
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    check-cast v0, Ljava/lang/Iterable;

    .line 22
    .line 23
    new-instance v1, Ldg/n;

    .line 24
    .line 25
    const/4 v2, 0x6

    .line 26
    invoke-direct {v1, v0, v2}, Ldg/n;-><init>(Ljava/lang/Object;I)V

    .line 27
    .line 28
    .line 29
    new-instance v0, Le9/h;

    .line 30
    .line 31
    const/16 v2, 0xb

    .line 32
    .line 33
    invoke-direct {v0, v2}, Le9/h;-><init>(I)V

    .line 34
    .line 35
    .line 36
    new-instance v2, Lng/i;

    .line 37
    .line 38
    const/4 v3, 0x1

    .line 39
    invoke-direct {v2, v1, v3, v0}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 40
    .line 41
    .line 42
    new-instance v0, La9/h;

    .line 43
    .line 44
    const/16 v1, 0xc

    .line 45
    .line 46
    invoke-direct {v0, v1}, La9/h;-><init>(I)V

    .line 47
    .line 48
    .line 49
    new-instance v1, Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-static {v2, v1}, Lng/m;->a0(Lng/j;Ljava/util/AbstractCollection;)V

    .line 55
    .line 56
    .line 57
    invoke-static {v1, v0}, Ltf/q;->g1(Ljava/util/List;Ljava/util/Comparator;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    if-nez v1, :cond_1

    .line 69
    .line 70
    sget-object v0, Ltf/t;->g:Ltf/t;

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    if-nez v2, :cond_2

    .line 82
    .line 83
    invoke-static {v1}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    goto :goto_1

    .line 88
    :cond_2
    new-instance v2, Ljava/util/ArrayList;

    .line 89
    .line 90
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    if-eqz v1, :cond_3

    .line 101
    .line 102
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_3
    move-object v0, v2

    .line 111
    :goto_1
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    if-eqz v1, :cond_4

    .line 116
    .line 117
    goto :goto_4

    .line 118
    :cond_4
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    :cond_5
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    if-eqz v1, :cond_6

    .line 127
    .line 128
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    check-cast v1, Leb/a0;

    .line 136
    .line 137
    :try_start_0
    iget-object v2, v1, Leb/a0;->b:Lbsh/Interpreter;

    .line 138
    .line 139
    invoke-direct {p0, v2}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->interpreterLock(Lbsh/Interpreter;)Ljava/util/concurrent/locks/ReentrantLock;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 144
    .line 145
    .line 146
    :try_start_1
    iget-object v3, v1, Leb/a0;->b:Lbsh/Interpreter;

    .line 147
    .line 148
    const-string v4, "__hchat_msg_info"

    .line 149
    .line 150
    invoke-virtual {v3, v4, p1}, Lbsh/Interpreter;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    iget-object v3, v1, Leb/a0;->b:Lbsh/Interpreter;

    .line 154
    .line 155
    const-string v4, "onHandleMsg(__hchat_msg_info);"

    .line 156
    .line 157
    invoke-virtual {v3, v4}, Lbsh/Interpreter;->eval(Ljava/lang/String;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 158
    .line 159
    .line 160
    :try_start_2
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 161
    .line 162
    .line 163
    goto :goto_2

    .line 164
    :catchall_0
    move-exception v2

    .line 165
    goto :goto_3

    .line 166
    :catchall_1
    move-exception v3

    .line 167
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 168
    .line 169
    .line 170
    throw v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 171
    :goto_3
    const-string v3, "onHandleMsg"

    .line 172
    .line 173
    invoke-direct {p0, v2, v3}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->isMissingCallbackError(Ljava/lang/Throwable;Ljava/lang/String;)Z

    .line 174
    .line 175
    .line 176
    move-result v3

    .line 177
    if-nez v3, :cond_5

    .line 178
    .line 179
    iget-object v3, v1, Leb/a0;->a:Leb/c0;

    .line 180
    .line 181
    iget-object v3, v3, Leb/c0;->b:Ljava/lang/String;

    .line 182
    .line 183
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v4

    .line 187
    const-string v5, "[Hchat:Script] \u6d88\u606f\u76d1\u542c\u56de\u8c03\u5931\u8d25: "

    .line 188
    .line 189
    const-string v6, " "

    .line 190
    .line 191
    invoke-static {v5, v3, v6, v4, v2}, Leh/a;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 192
    .line 193
    .line 194
    sget-object v3, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->bridge:Lh/Hchat/hooks/items/script/ScriptPluginBridge;

    .line 195
    .line 196
    if-eqz v3, :cond_5

    .line 197
    .line 198
    iget-object v1, v1, Leb/a0;->a:Leb/c0;

    .line 199
    .line 200
    iget-object v4, v1, Leb/c0;->b:Ljava/lang/String;

    .line 201
    .line 202
    iget-object v1, v1, Leb/c0;->c:Ljava/io/File;

    .line 203
    .line 204
    new-instance v5, Ljava/lang/StringBuilder;

    .line 205
    .line 206
    const-string v6, "\u6d88\u606f\u76d1\u542c\u56de\u8c03\u5931\u8d25: "

    .line 207
    .line 208
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v2

    .line 218
    invoke-virtual {v3, v4, v1, v2}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->log(Ljava/lang/String;Ljava/io/File;Ljava/lang/Object;)V

    .line 219
    .line 220
    .line 221
    goto :goto_2

    .line 222
    :cond_6
    :goto_4
    return-void
.end method

.method public final dispatchOnImageDownload(Lh/Hchat/hooks/items/script/ScriptMessageBean;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->loadedPlugins:Ljava/util/concurrent/ConcurrentHashMap;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    check-cast v0, Ljava/lang/Iterable;

    .line 14
    .line 15
    instance-of v1, v0, Ljava/util/Collection;

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    move-object v1, v0

    .line 20
    check-cast v1, Ljava/util/Collection;

    .line 21
    .line 22
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_4

    .line 38
    .line 39
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, Leb/a0;

    .line 44
    .line 45
    iget-boolean v1, v1, Leb/a0;->i:Z

    .line 46
    .line 47
    if-eqz v1, :cond_1

    .line 48
    .line 49
    invoke-virtual {p1}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->isImage()Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-nez v0, :cond_2

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_2
    :try_start_0
    invoke-virtual {p1}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->getImageMsg()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    goto :goto_0

    .line 61
    :catchall_0
    move-exception v0

    .line 62
    new-instance v1, Lsf/f;

    .line 63
    .line 64
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 65
    .line 66
    .line 67
    move-object v0, v1

    .line 68
    :goto_0
    nop

    .line 69
    instance-of v1, v0, Lsf/f;

    .line 70
    .line 71
    if-eqz v1, :cond_3

    .line 72
    .line 73
    const/4 v0, 0x0

    .line 74
    :cond_3
    if-eqz v0, :cond_4

    .line 75
    .line 76
    sget-object v1, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->bridge:Lh/Hchat/hooks/items/script/ScriptPluginBridge;

    .line 77
    .line 78
    if-eqz v1, :cond_4

    .line 79
    .line 80
    :try_start_1
    sget-object v2, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->imageDownloadCallbackExecutor:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 81
    .line 82
    new-instance v3, Lac/l;

    .line 83
    .line 84
    const/16 v4, 0xd

    .line 85
    .line 86
    invoke-direct {v3, v1, p1, v0, v4}, Lac/l;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2, v3}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_1 .. :try_end_1} :catch_0

    .line 90
    .line 91
    .line 92
    goto :goto_1

    .line 93
    :catch_0
    invoke-direct {p0}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->logDroppedImageDownload()V

    .line 94
    .line 95
    .line 96
    :cond_4
    :goto_1
    return-void
.end method

.method public final dispatchOnMemberChange(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    sget-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->loadedPlugins:Ljava/util/concurrent/ConcurrentHashMap;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    goto/16 :goto_4

    .line 22
    .line 23
    :cond_0
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    check-cast v0, Ljava/lang/Iterable;

    .line 31
    .line 32
    new-instance v1, Ldg/n;

    .line 33
    .line 34
    const/4 v2, 0x6

    .line 35
    invoke-direct {v1, v0, v2}, Ldg/n;-><init>(Ljava/lang/Object;I)V

    .line 36
    .line 37
    .line 38
    new-instance v0, Le9/h;

    .line 39
    .line 40
    const/16 v2, 0x10

    .line 41
    .line 42
    invoke-direct {v0, v2}, Le9/h;-><init>(I)V

    .line 43
    .line 44
    .line 45
    new-instance v2, Lng/i;

    .line 46
    .line 47
    const/4 v3, 0x1

    .line 48
    invoke-direct {v2, v1, v3, v0}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 49
    .line 50
    .line 51
    new-instance v0, La9/h;

    .line 52
    .line 53
    const/16 v1, 0xe

    .line 54
    .line 55
    invoke-direct {v0, v1}, La9/h;-><init>(I)V

    .line 56
    .line 57
    .line 58
    new-instance v1, Ljava/util/ArrayList;

    .line 59
    .line 60
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 61
    .line 62
    .line 63
    invoke-static {v2, v1}, Lng/m;->a0(Lng/j;Ljava/util/AbstractCollection;)V

    .line 64
    .line 65
    .line 66
    invoke-static {v1, v0}, Ltf/q;->g1(Ljava/util/List;Ljava/util/Comparator;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    if-nez v1, :cond_1

    .line 78
    .line 79
    sget-object v0, Ltf/t;->g:Ltf/t;

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    if-nez v2, :cond_2

    .line 91
    .line 92
    invoke-static {v1}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    goto :goto_1

    .line 97
    :cond_2
    new-instance v2, Ljava/util/ArrayList;

    .line 98
    .line 99
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    if-eqz v1, :cond_3

    .line 110
    .line 111
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_3
    move-object v0, v2

    .line 120
    :goto_1
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    if-eqz v1, :cond_4

    .line 125
    .line 126
    goto/16 :goto_4

    .line 127
    .line 128
    :cond_4
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    :cond_5
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 133
    .line 134
    .line 135
    move-result v1

    .line 136
    if-eqz v1, :cond_7

    .line 137
    .line 138
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    check-cast v1, Leb/a0;

    .line 146
    .line 147
    :try_start_0
    iget-object v2, v1, Leb/a0;->b:Lbsh/Interpreter;

    .line 148
    .line 149
    invoke-direct {p0, v2}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->interpreterLock(Lbsh/Interpreter;)Ljava/util/concurrent/locks/ReentrantLock;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 154
    .line 155
    .line 156
    :try_start_1
    iget-object v4, v1, Leb/a0;->b:Lbsh/Interpreter;

    .line 157
    .line 158
    const-string v5, "__hchat_member_change_type"

    .line 159
    .line 160
    invoke-virtual {v4, v5, p1}, Lbsh/Interpreter;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    iget-object v4, v1, Leb/a0;->b:Lbsh/Interpreter;

    .line 164
    .line 165
    const-string v5, "__hchat_member_change_group"

    .line 166
    .line 167
    invoke-virtual {v4, v5, p2}, Lbsh/Interpreter;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    iget-object v4, v1, Leb/a0;->b:Lbsh/Interpreter;

    .line 171
    .line 172
    const-string v5, "__hchat_member_change_user"

    .line 173
    .line 174
    invoke-virtual {v4, v5, p3}, Lbsh/Interpreter;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    iget-object v4, v1, Leb/a0;->b:Lbsh/Interpreter;

    .line 178
    .line 179
    const-string v5, "__hchat_member_change_name"

    .line 180
    .line 181
    invoke-virtual {v4, v5, p4}, Lbsh/Interpreter;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    iget-object v4, v1, Leb/a0;->b:Lbsh/Interpreter;

    .line 185
    .line 186
    const-string v5, "onMemberChange(__hchat_member_change_type, __hchat_member_change_group, __hchat_member_change_user, __hchat_member_change_name);"

    .line 187
    .line 188
    invoke-virtual {v4, v5}, Lbsh/Interpreter;->eval(Ljava/lang/String;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 189
    .line 190
    .line 191
    :try_start_2
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 192
    .line 193
    .line 194
    goto :goto_2

    .line 195
    :catchall_0
    move-exception v2

    .line 196
    goto :goto_3

    .line 197
    :catchall_1
    move-exception v4

    .line 198
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 199
    .line 200
    .line 201
    throw v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 202
    :goto_3
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v4

    .line 206
    if-nez v4, :cond_6

    .line 207
    .line 208
    const-string v4, ""

    .line 209
    .line 210
    :cond_6
    const-string v5, "Command not found"

    .line 211
    .line 212
    invoke-static {v4, v5, v3}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 213
    .line 214
    .line 215
    move-result v5

    .line 216
    if-nez v5, :cond_5

    .line 217
    .line 218
    const-string v5, "undefined"

    .line 219
    .line 220
    invoke-static {v4, v5, v3}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 221
    .line 222
    .line 223
    move-result v5

    .line 224
    if-nez v5, :cond_5

    .line 225
    .line 226
    const-string v5, "not found"

    .line 227
    .line 228
    invoke-static {v4, v5, v3}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 229
    .line 230
    .line 231
    move-result v4

    .line 232
    if-nez v4, :cond_5

    .line 233
    .line 234
    iget-object v4, v1, Leb/a0;->a:Leb/c0;

    .line 235
    .line 236
    iget-object v4, v4, Leb/c0;->b:Ljava/lang/String;

    .line 237
    .line 238
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v5

    .line 242
    const-string v6, "[Hchat:Script] \u6210\u5458\u53d8\u52a8\u56de\u8c03\u5931\u8d25: "

    .line 243
    .line 244
    const-string v7, " "

    .line 245
    .line 246
    invoke-static {v6, v4, v7, v5, v2}, Leh/a;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 247
    .line 248
    .line 249
    sget-object v4, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->bridge:Lh/Hchat/hooks/items/script/ScriptPluginBridge;

    .line 250
    .line 251
    if-eqz v4, :cond_5

    .line 252
    .line 253
    iget-object v1, v1, Leb/a0;->a:Leb/c0;

    .line 254
    .line 255
    iget-object v5, v1, Leb/c0;->b:Ljava/lang/String;

    .line 256
    .line 257
    iget-object v1, v1, Leb/c0;->c:Ljava/io/File;

    .line 258
    .line 259
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v2

    .line 263
    new-instance v6, Ljava/lang/StringBuilder;

    .line 264
    .line 265
    const-string v7, "\u6210\u5458\u53d8\u52a8\u56de\u8c03\u5931\u8d25: "

    .line 266
    .line 267
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 271
    .line 272
    .line 273
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v2

    .line 277
    invoke-virtual {v4, v5, v1, v2}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->log(Ljava/lang/String;Ljava/io/File;Ljava/lang/Object;)V

    .line 278
    .line 279
    .line 280
    goto/16 :goto_2

    .line 281
    .line 282
    :cond_7
    :goto_4
    return-void
.end method

.method public final dispatchOnNewFriend(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    sget-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->loadedPlugins:Ljava/util/concurrent/ConcurrentHashMap;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    goto/16 :goto_4

    .line 16
    .line 17
    :cond_0
    invoke-static {p1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-static {p2}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-nez v1, :cond_1

    .line 38
    .line 39
    goto/16 :goto_4

    .line 40
    .line 41
    :cond_1
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-nez v1, :cond_2

    .line 46
    .line 47
    goto/16 :goto_4

    .line 48
    .line 49
    :cond_2
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    check-cast v0, Ljava/lang/Iterable;

    .line 57
    .line 58
    new-instance v1, Ldg/n;

    .line 59
    .line 60
    const/4 v2, 0x6

    .line 61
    invoke-direct {v1, v0, v2}, Ldg/n;-><init>(Ljava/lang/Object;I)V

    .line 62
    .line 63
    .line 64
    new-instance v0, Le9/h;

    .line 65
    .line 66
    const/16 v2, 0xc

    .line 67
    .line 68
    invoke-direct {v0, v2}, Le9/h;-><init>(I)V

    .line 69
    .line 70
    .line 71
    new-instance v2, Lng/i;

    .line 72
    .line 73
    const/4 v3, 0x1

    .line 74
    invoke-direct {v2, v1, v3, v0}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 75
    .line 76
    .line 77
    new-instance v0, La9/h;

    .line 78
    .line 79
    const/16 v1, 0xf

    .line 80
    .line 81
    invoke-direct {v0, v1}, La9/h;-><init>(I)V

    .line 82
    .line 83
    .line 84
    new-instance v1, Ljava/util/ArrayList;

    .line 85
    .line 86
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 87
    .line 88
    .line 89
    invoke-static {v2, v1}, Lng/m;->a0(Lng/j;Ljava/util/AbstractCollection;)V

    .line 90
    .line 91
    .line 92
    invoke-static {v1, v0}, Ltf/q;->g1(Ljava/util/List;Ljava/util/Comparator;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    if-nez v1, :cond_3

    .line 104
    .line 105
    sget-object v0, Ltf/t;->g:Ltf/t;

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 113
    .line 114
    .line 115
    move-result v2

    .line 116
    if-nez v2, :cond_4

    .line 117
    .line 118
    invoke-static {v1}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    goto :goto_1

    .line 123
    :cond_4
    new-instance v2, Ljava/util/ArrayList;

    .line 124
    .line 125
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    if-eqz v1, :cond_5

    .line 136
    .line 137
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    goto :goto_0

    .line 145
    :cond_5
    move-object v0, v2

    .line 146
    :goto_1
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 147
    .line 148
    .line 149
    move-result v1

    .line 150
    if-eqz v1, :cond_6

    .line 151
    .line 152
    goto/16 :goto_4

    .line 153
    .line 154
    :cond_6
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    :cond_7
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 159
    .line 160
    .line 161
    move-result v1

    .line 162
    if-eqz v1, :cond_9

    .line 163
    .line 164
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 169
    .line 170
    .line 171
    check-cast v1, Leb/a0;

    .line 172
    .line 173
    :try_start_0
    iget-object v2, v1, Leb/a0;->b:Lbsh/Interpreter;

    .line 174
    .line 175
    invoke-direct {p0, v2}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->interpreterLock(Lbsh/Interpreter;)Ljava/util/concurrent/locks/ReentrantLock;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 180
    .line 181
    .line 182
    :try_start_1
    iget-object v4, v1, Leb/a0;->b:Lbsh/Interpreter;

    .line 183
    .line 184
    const-string v5, "__hchat_new_friend_wxid"

    .line 185
    .line 186
    invoke-virtual {v4, v5, p1}, Lbsh/Interpreter;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    iget-object v4, v1, Leb/a0;->b:Lbsh/Interpreter;

    .line 190
    .line 191
    const-string v5, "__hchat_new_friend_ticket"

    .line 192
    .line 193
    invoke-virtual {v4, v5, p2}, Lbsh/Interpreter;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    iget-object v4, v1, Leb/a0;->b:Lbsh/Interpreter;

    .line 197
    .line 198
    const-string v5, "__hchat_new_friend_scene"

    .line 199
    .line 200
    invoke-virtual {v4, v5, p3}, Lbsh/Interpreter;->set(Ljava/lang/String;I)V

    .line 201
    .line 202
    .line 203
    iget-object v4, v1, Leb/a0;->b:Lbsh/Interpreter;

    .line 204
    .line 205
    const-string v5, "onNewFriend(__hchat_new_friend_wxid, __hchat_new_friend_ticket, __hchat_new_friend_scene);"

    .line 206
    .line 207
    invoke-virtual {v4, v5}, Lbsh/Interpreter;->eval(Ljava/lang/String;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 208
    .line 209
    .line 210
    :try_start_2
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 211
    .line 212
    .line 213
    goto :goto_2

    .line 214
    :catchall_0
    move-exception v2

    .line 215
    goto :goto_3

    .line 216
    :catchall_1
    move-exception v4

    .line 217
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 218
    .line 219
    .line 220
    throw v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 221
    :goto_3
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v4

    .line 225
    if-nez v4, :cond_8

    .line 226
    .line 227
    const-string v4, ""

    .line 228
    .line 229
    :cond_8
    const-string v5, "Command not found"

    .line 230
    .line 231
    invoke-static {v4, v5, v3}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 232
    .line 233
    .line 234
    move-result v5

    .line 235
    if-nez v5, :cond_7

    .line 236
    .line 237
    const-string v5, "undefined"

    .line 238
    .line 239
    invoke-static {v4, v5, v3}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 240
    .line 241
    .line 242
    move-result v5

    .line 243
    if-nez v5, :cond_7

    .line 244
    .line 245
    const-string v5, "not found"

    .line 246
    .line 247
    invoke-static {v4, v5, v3}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 248
    .line 249
    .line 250
    move-result v4

    .line 251
    if-nez v4, :cond_7

    .line 252
    .line 253
    iget-object v4, v1, Leb/a0;->a:Leb/c0;

    .line 254
    .line 255
    iget-object v4, v4, Leb/c0;->b:Ljava/lang/String;

    .line 256
    .line 257
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v5

    .line 261
    const-string v6, "[Hchat:Script] \u597d\u53cb\u7533\u8bf7\u56de\u8c03\u5931\u8d25: "

    .line 262
    .line 263
    const-string v7, " "

    .line 264
    .line 265
    invoke-static {v6, v4, v7, v5, v2}, Leh/a;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 266
    .line 267
    .line 268
    sget-object v4, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->bridge:Lh/Hchat/hooks/items/script/ScriptPluginBridge;

    .line 269
    .line 270
    if-eqz v4, :cond_7

    .line 271
    .line 272
    iget-object v1, v1, Leb/a0;->a:Leb/c0;

    .line 273
    .line 274
    iget-object v5, v1, Leb/c0;->b:Ljava/lang/String;

    .line 275
    .line 276
    iget-object v1, v1, Leb/c0;->c:Ljava/io/File;

    .line 277
    .line 278
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v2

    .line 282
    new-instance v6, Ljava/lang/StringBuilder;

    .line 283
    .line 284
    const-string v7, "\u597d\u53cb\u7533\u8bf7\u56de\u8c03\u5931\u8d25: "

    .line 285
    .line 286
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 287
    .line 288
    .line 289
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 290
    .line 291
    .line 292
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v2

    .line 296
    invoke-virtual {v4, v5, v1, v2}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->log(Ljava/lang/String;Ljava/io/File;Ljava/lang/Object;)V

    .line 297
    .line 298
    .line 299
    goto/16 :goto_2

    .line 300
    .line 301
    :cond_9
    :goto_4
    return-void
.end method

.method public final dispatchOnProtobufPacket(Lh/Hchat/hooks/items/protobuf/ProtobufPacketRuntime$Packet;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->loadedPlugins:Ljava/util/concurrent/ConcurrentHashMap;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    check-cast v0, Ljava/lang/Iterable;

    .line 14
    .line 15
    instance-of v1, v0, Ljava/util/Collection;

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    move-object v1, v0

    .line 20
    check-cast v1, Ljava/util/Collection;

    .line 21
    .line 22
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_2

    .line 38
    .line 39
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, Leb/a0;

    .line 44
    .line 45
    iget-boolean v1, v1, Leb/a0;->h:Z

    .line 46
    .line 47
    if-eqz v1, :cond_1

    .line 48
    .line 49
    :try_start_0
    sget-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->protobufCallbackExecutor:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 50
    .line 51
    new-instance v1, La1/a;

    .line 52
    .line 53
    const/16 v2, 0x8

    .line 54
    .line 55
    invoke-direct {v1, p1, v2}, La1/a;-><init>(Ljava/lang/Object;I)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :catch_0
    invoke-direct {p0}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->logDroppedProtobufPacket()V

    .line 63
    .line 64
    .line 65
    :cond_2
    :goto_0
    return-void
.end method

.method public final ensureDirs(Landroid/content/Context;)Ljava/io/File;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->scriptDir(Landroid/content/Context;)Ljava/io/File;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p1}, Ljava/io/File;->isDirectory()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/io/File;->mkdirs()Z

    .line 15
    .line 16
    .line 17
    :cond_0
    return-object p1
.end method

.method public final evalCode(Ljava/lang/String;Lbsh/Interpreter;Ljava/lang/String;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0, p2}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->interpreterLock(Lbsh/Interpreter;)Ljava/util/concurrent/locks/ReentrantLock;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 15
    .line 16
    .line 17
    :try_start_0
    invoke-virtual {p2, p3}, Lbsh/Interpreter;->eval(Ljava/lang/String;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p3

    .line 21
    sget-object v1, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->INSTANCE:Lh/Hchat/hooks/items/script/ScriptPluginRuntime;

    .line 22
    .line 23
    invoke-virtual {v1, p1, p2}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->refreshCallbacks(Ljava/lang/String;Lbsh/Interpreter;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 27
    .line 28
    .line 29
    return-object p3

    .line 30
    :catchall_0
    move-exception p1

    .line 31
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 32
    .line 33
    .line 34
    throw p1
.end method

.method public final evalSnapshot(Ljava/lang/String;Lbsh/Interpreter;Ljava/io/InputStream;)Ljava/lang/Object;
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    invoke-direct {p0, p2}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->interpreterLock(Lbsh/Interpreter;)Ljava/util/concurrent/locks/ReentrantLock;

    move-result-object v0

    .line 79
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 80
    :try_start_0
    sget-object v1, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->INSTANCE:Lh/Hchat/hooks/items/script/ScriptPluginRuntime;

    invoke-direct {v1, p1}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->snapshotKey(Ljava/lang/String;)Ljavax/crypto/SecretKey;

    move-result-object v1

    invoke-virtual {p2, p3, v1}, Lbsh/Interpreter;->evalSnapshot(Ljava/io/InputStream;Ljavax/crypto/SecretKey;)Ljava/lang/Object;

    move-result-object p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 81
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 82
    invoke-virtual {p0, p1, p2}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->refreshCallbacks(Ljava/lang/String;Lbsh/Interpreter;)V

    return-object p3

    :catchall_0
    move-exception p1

    .line 83
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw p1
.end method

.method public final evalSnapshot(Ljava/lang/String;Lbsh/Interpreter;[B)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    new-instance v0, Ljava/io/ByteArrayInputStream;

    invoke-direct {v0, p3}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-virtual {p0, p1, p2, v0}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->evalSnapshot(Ljava/lang/String;Lbsh/Interpreter;Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final evalSnapshot(Ljava/lang/String;Ljava/io/File;Lbsh/Interpreter;Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-direct {p0, p2, p4}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->resolvePluginFile(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    invoke-virtual {p2}, Ljava/io/File;->isFile()Z

    .line 18
    .line 19
    .line 20
    move-result p4

    .line 21
    if-eqz p4, :cond_0

    .line 22
    .line 23
    invoke-direct {p0, p3}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->interpreterLock(Lbsh/Interpreter;)Ljava/util/concurrent/locks/ReentrantLock;

    .line 24
    .line 25
    .line 26
    move-result-object p4

    .line 27
    invoke-virtual {p4}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 28
    .line 29
    .line 30
    :try_start_0
    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    sget-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->INSTANCE:Lh/Hchat/hooks/items/script/ScriptPluginRuntime;

    .line 35
    .line 36
    invoke-direct {v0, p1}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->snapshotKey(Ljava/lang/String;)Ljavax/crypto/SecretKey;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {p3, p2, v0}, Lbsh/Interpreter;->evalSnapshot(Ljava/lang/String;Ljavax/crypto/SecretKey;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    invoke-virtual {p4}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, p1, p3}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->refreshCallbacks(Ljava/lang/String;Lbsh/Interpreter;)V

    .line 48
    .line 49
    .line 50
    return-object p2

    .line 51
    :catchall_0
    move-exception p1

    .line 52
    invoke-virtual {p4}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 53
    .line 54
    .line 55
    throw p1

    .line 56
    :cond_0
    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    const-string p2, "\u5feb\u7167\u6587\u4ef6\u4e0d\u5b58\u5728: "

    .line 61
    .line 62
    invoke-static {p2, p1}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-static {p1}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    const/4 p1, 0x0

    .line 70
    return-object p1
.end method

.method public final evalSnapshot(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    .locals 2

    .line 71
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->loadedPlugins:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leb/a0;

    if-eqz v0, :cond_0

    .line 72
    iget-object v1, v0, Leb/a0;->a:Leb/c0;

    .line 73
    iget-object v1, v1, Leb/c0;->c:Ljava/io/File;

    .line 74
    iget-object v0, v0, Leb/a0;->b:Lbsh/Interpreter;

    .line 75
    invoke-virtual {p0, p1, v1, v0, p2}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->evalSnapshot(Ljava/lang/String;Ljava/io/File;Lbsh/Interpreter;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 76
    :cond_0
    const-string p1, "\u63d2\u4ef6\u672a\u5f00\u542f"

    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public final hasImageDownloadCallback()Z
    .locals 3

    .line 1
    sget-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->loadedPlugins:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    check-cast v0, Ljava/lang/Iterable;

    .line 11
    .line 12
    instance-of v1, v0, Ljava/util/Collection;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    move-object v1, v0

    .line 18
    check-cast v1, Ljava/util/Collection;

    .line 19
    .line 20
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    return v2

    .line 27
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_2

    .line 36
    .line 37
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    check-cast v1, Leb/a0;

    .line 42
    .line 43
    iget-boolean v1, v1, Leb/a0;->i:Z

    .line 44
    .line 45
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-eqz v1, :cond_1

    .line 54
    .line 55
    const/4 v0, 0x1

    .line 56
    return v0

    .line 57
    :cond_2
    return v2
.end method

.method public final hasOpenSettings(Ljava/lang/String;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->loadedPlugins:Ljava/util/concurrent/ConcurrentHashMap;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, Leb/a0;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    iget-boolean p1, p1, Leb/a0;->e:Z

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    if-ne p1, v1, :cond_0

    .line 19
    .line 20
    return v1

    .line 21
    :cond_0
    return v0
.end method

.method public final install(Lr8/g;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Lr8/g;->a:Landroid/content/Context;

    .line 5
    .line 6
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-object v0, p1, Lr8/g;->a:Landroid/content/Context;

    .line 14
    .line 15
    :goto_0
    sput-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->appContext:Landroid/content/Context;

    .line 16
    .line 17
    const-string v1, "main"

    .line 18
    .line 19
    sput-object v1, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->runtimeProcess:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    sput-object v1, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->runtimeProcessName:Ljava/lang/String;

    .line 29
    .line 30
    sget-object v1, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->Companion:Leb/q;

    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    new-instance v1, Lh/Hchat/hooks/items/script/ScriptPluginBridge;

    .line 36
    .line 37
    iget-object v2, p1, Lr8/g;->a:Landroid/content/Context;

    .line 38
    .line 39
    iget-object v3, p1, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 40
    .line 41
    sget-object v4, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->INSTANCE:Lh/Hchat/hooks/items/script/ScriptPluginRuntime;

    .line 42
    .line 43
    invoke-virtual {v4, v2}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->scriptDir(Landroid/content/Context;)Ljava/io/File;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    new-instance v5, Lh/Hchat/hooks/items/script/ScriptDexKitBridge;

    .line 48
    .line 49
    iget-object v6, p1, Lr8/g;->d:Lorg/luckypray/dexkit/DexKitBridge;

    .line 50
    .line 51
    iget-object p1, p1, Lr8/g;->h:Lh/Hchat/dexkit/DexBridgeHolder;

    .line 52
    .line 53
    invoke-direct {v5, v6, p1, v3}, Lh/Hchat/hooks/items/script/ScriptDexKitBridge;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lh/Hchat/dexkit/DexBridgeHolder;Ljava/lang/ClassLoader;)V

    .line 54
    .line 55
    .line 56
    invoke-direct {v1, v2, v3, v4, v5}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;-><init>(Landroid/content/Context;Ljava/lang/ClassLoader;Ljava/io/File;Lh/Hchat/hooks/items/script/ScriptDexKitBridge;)V

    .line 57
    .line 58
    .line 59
    sput-object v1, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->bridge:Lh/Hchat/hooks/items/script/ScriptPluginBridge;

    .line 60
    .line 61
    invoke-virtual {p0, v0}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->ensureDirs(Landroid/content/Context;)Ljava/io/File;

    .line 62
    .line 63
    .line 64
    invoke-direct {p0, v0}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->startPluginObservers(Landroid/content/Context;)V

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method public final isPluginEnabled(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    const-string v0, "Hchat_script_plugin_config"

    .line 8
    .line 9
    invoke-static {p1, v0}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const-string v0, "script_plugin_item_"

    .line 14
    .line 15
    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    const/4 v0, 0x0

    .line 20
    invoke-interface {p1, p2, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    return p1
.end method

.method public final listPlugins(Landroid/content/Context;)Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/List<",
            "Leb/c0;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->scriptDir(Landroid/content/Context;)Ljava/io/File;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p1}, Ljava/io/File;->isDirectory()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    sget-object v1, Ltf/t;->g:Ltf/t;

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    goto/16 :goto_1

    .line 17
    .line 18
    :cond_0
    invoke-virtual {p1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    if-eqz p1, :cond_3

    .line 23
    .line 24
    invoke-static {p1}, Ltf/l;->k0([Ljava/lang/Object;)Lng/j;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    new-instance v2, Lc0/f;

    .line 29
    .line 30
    const-class v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;

    .line 31
    .line 32
    invoke-static {v0}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    const/4 v9, 0x0

    .line 37
    const/16 v10, 0xc

    .line 38
    .line 39
    const/4 v3, 0x1

    .line 40
    const-string v6, "isPluginDirectory"

    .line 41
    .line 42
    const-string v7, "isPluginDirectory(Ljava/io/File;)Z"

    .line 43
    .line 44
    const/4 v8, 0x0

    .line 45
    move-object v4, p0

    .line 46
    invoke-direct/range {v2 .. v10}, Lc0/f;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 47
    .line 48
    .line 49
    new-instance v0, Lng/i;

    .line 50
    .line 51
    invoke-direct {v0, p1, v3, v2}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 52
    .line 53
    .line 54
    new-instance p1, Le9/h;

    .line 55
    .line 56
    const/16 v2, 0xd

    .line 57
    .line 58
    invoke-direct {p1, v2}, Le9/h;-><init>(I)V

    .line 59
    .line 60
    .line 61
    invoke-static {v0, p1}, Lng/m;->X(Lng/j;Lfg/l;)Lng/i;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    new-instance v0, La9/h;

    .line 66
    .line 67
    const/16 v2, 0x11

    .line 68
    .line 69
    invoke-direct {v0, v2}, La9/h;-><init>(I)V

    .line 70
    .line 71
    .line 72
    new-instance v2, Ljava/util/ArrayList;

    .line 73
    .line 74
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 75
    .line 76
    .line 77
    invoke-static {p1, v2}, Lng/m;->a0(Lng/j;Ljava/util/AbstractCollection;)V

    .line 78
    .line 79
    .line 80
    invoke-static {v2, v0}, Ltf/q;->g1(Ljava/util/List;Ljava/util/Comparator;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-nez v0, :cond_1

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    if-nez v1, :cond_2

    .line 103
    .line 104
    invoke-static {v0}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    goto :goto_1

    .line 109
    :cond_2
    new-instance v1, Ljava/util/ArrayList;

    .line 110
    .line 111
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    if-eqz v0, :cond_3

    .line 122
    .line 123
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    goto :goto_0

    .line 131
    :cond_3
    :goto_1
    return-object v1
.end method

.method public final loadDex(Ljava/lang/String;Ljava/io/File;Lbsh/Interpreter;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/ClassLoader;
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, p2, p5}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->resolvePluginFile(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    invoke-virtual {p2}, Ljava/io/File;->isFile()Z

    .line 21
    .line 22
    .line 23
    move-result p5

    .line 24
    if-eqz p5, :cond_4

    .line 25
    .line 26
    sget-object p5, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->appContext:Landroid/content/Context;

    .line 27
    .line 28
    if-eqz p5, :cond_3

    .line 29
    .line 30
    const-string v0, "hchat_plugin_dex"

    .line 31
    .line 32
    invoke-direct {p0, p5, v0}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->processScopedCacheRoot(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    .line 33
    .line 34
    .line 35
    move-result-object p5

    .line 36
    new-instance v0, Ljava/io/File;

    .line 37
    .line 38
    invoke-direct {p0, p1}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->safeFileName(Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-direct {v0, p5, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 46
    .line 47
    .line 48
    new-instance p1, Ljava/io/File;

    .line 49
    .line 50
    const-string p5, "opt"

    .line 51
    .line 52
    invoke-direct {p1, v0, p5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1}, Ljava/io/File;->mkdirs()Z

    .line 56
    .line 57
    .line 58
    invoke-direct {p0, p2}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->sha256(Ljava/io/File;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p5

    .line 62
    const/16 v1, 0x10

    .line 63
    .line 64
    invoke-static {v1, p5}, Log/m;->P0(ILjava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p5

    .line 68
    invoke-static {p2}, Ldg/l;->e0(Ljava/io/File;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-static {p2}, Ldg/l;->c0(Ljava/io/File;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    if-eqz v3, :cond_0

    .line 81
    .line 82
    const-string v2, "dex"

    .line 83
    .line 84
    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    .line 85
    .line 86
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    const-string v1, "_"

    .line 93
    .line 94
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v3, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    const-string p5, "."

    .line 101
    .line 102
    invoke-virtual {v3, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p5

    .line 112
    new-instance v1, Ljava/io/File;

    .line 113
    .line 114
    invoke-direct {v1, v0, p5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v1}, Ljava/io/File;->isFile()Z

    .line 118
    .line 119
    .line 120
    move-result p5

    .line 121
    if-eqz p5, :cond_1

    .line 122
    .line 123
    invoke-virtual {v1}, Ljava/io/File;->length()J

    .line 124
    .line 125
    .line 126
    move-result-wide v2

    .line 127
    invoke-virtual {p2}, Ljava/io/File;->length()J

    .line 128
    .line 129
    .line 130
    move-result-wide v4

    .line 131
    cmp-long p5, v2, v4

    .line 132
    .line 133
    if-eqz p5, :cond_2

    .line 134
    .line 135
    :cond_1
    invoke-static {p2, v1}, Ldg/l;->a0(Ljava/io/File;Ljava/io/File;)V

    .line 136
    .line 137
    .line 138
    :cond_2
    const/4 p2, 0x0

    .line 139
    invoke-virtual {v1, p2, p2}, Ljava/io/File;->setWritable(ZZ)Z

    .line 140
    .line 141
    .line 142
    new-instance p2, Ldalvik/system/DexClassLoader;

    .line 143
    .line 144
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object p5

    .line 148
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    const/4 v0, 0x0

    .line 153
    invoke-direct {p2, p5, p1, v0, p4}, Ldalvik/system/DexClassLoader;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/ClassLoader;)V

    .line 154
    .line 155
    .line 156
    invoke-direct {p0, p3}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->interpreterLock(Lbsh/Interpreter;)Ljava/util/concurrent/locks/ReentrantLock;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 161
    .line 162
    .line 163
    :try_start_0
    invoke-virtual {p3, p2}, Lbsh/Interpreter;->addClassLoader(Ljava/lang/ClassLoader;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 164
    .line 165
    .line 166
    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 167
    .line 168
    .line 169
    return-object p2

    .line 170
    :catchall_0
    move-exception p2

    .line 171
    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 172
    .line 173
    .line 174
    throw p2

    .line 175
    :cond_3
    const-string p1, "\u5bbf\u4e3bContext\u4e0d\u53ef\u7528"

    .line 176
    .line 177
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    :goto_0
    const/4 p1, 0x0

    .line 181
    return-object p1

    .line 182
    :cond_4
    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    const-string p2, "Dex\u6587\u4ef6\u4e0d\u5b58\u5728: "

    .line 187
    .line 188
    invoke-static {p2, p1}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    invoke-static {p1}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    goto :goto_0
.end method

.method public final loadEnabledPluginsWhenReady(Landroid/content/Context;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    move-object p1, v0

    .line 11
    :cond_0
    const-string v0, "Hchat_script_plugin_config"

    .line 12
    .line 13
    invoke-static {p1, v0}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v1, "script_plugin_enable"

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    sget-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->initialLoadStarted:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 28
    .line 29
    const/4 v1, 0x1

    .line 30
    invoke-virtual {v0, v2, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-nez v0, :cond_2

    .line 35
    .line 36
    :goto_0
    return-void

    .line 37
    :cond_2
    new-instance v0, Ljava/lang/Thread;

    .line 38
    .line 39
    new-instance v2, Lc9/p1;

    .line 40
    .line 41
    const/4 v3, 0x1

    .line 42
    invoke-direct {v2, p1, v3}, Lc9/p1;-><init>(Landroid/content/Context;I)V

    .line 43
    .line 44
    .line 45
    const-string p1, "Hchat-Script-InitialLoad"

    .line 46
    .line 47
    invoke-direct {v0, v2, p1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 54
    .line 55
    .line 56
    return-void
.end method

.method public final loadJava(Ljava/lang/String;Ljava/io/File;Lbsh/Interpreter;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-direct {p0, p2, p4}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->resolvePluginFile(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    invoke-direct {p0, p3}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->interpreterLock(Lbsh/Interpreter;)Ljava/util/concurrent/locks/ReentrantLock;

    .line 18
    .line 19
    .line 20
    move-result-object p4

    .line 21
    invoke-virtual {p4}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 22
    .line 23
    .line 24
    :try_start_0
    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    invoke-virtual {p3, p2}, Lbsh/Interpreter;->source(Ljava/lang/String;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    sget-object p2, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->INSTANCE:Lh/Hchat/hooks/items/script/ScriptPluginRuntime;

    .line 32
    .line 33
    invoke-virtual {p2, p1, p3}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->refreshCallbacks(Ljava/lang/String;Lbsh/Interpreter;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    .line 35
    .line 36
    invoke-virtual {p4}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :catchall_0
    move-exception p1

    .line 41
    invoke-virtual {p4}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 42
    .line 43
    .line 44
    throw p1
.end method

.method public final loadSo(Ljava/lang/String;Ljava/io/File;Ljava/lang/ClassLoader;Ljava/lang/String;)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-direct {p0, p2, p4}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->resolvePluginFile(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    invoke-virtual {p2}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    invoke-virtual {p2}, Ljava/io/File;->isFile()Z

    .line 22
    .line 23
    .line 24
    move-result p4

    .line 25
    if-eqz p4, :cond_a

    .line 26
    .line 27
    invoke-static {p2}, Ldg/l;->c0(Ljava/io/File;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p4

    .line 31
    const-string v0, "so"

    .line 32
    .line 33
    invoke-virtual {p4, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 34
    .line 35
    .line 36
    move-result p4

    .line 37
    if-eqz p4, :cond_9

    .line 38
    .line 39
    invoke-direct {p0, p2}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->validateNativeLibrary(Ljava/io/File;)V

    .line 40
    .line 41
    .line 42
    sget-object p4, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->appContext:Landroid/content/Context;

    .line 43
    .line 44
    if-eqz p4, :cond_8

    .line 45
    .line 46
    invoke-direct {p0, p2}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->sha256(Ljava/io/File;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    const-string v1, "hchat_plugin_native"

    .line 51
    .line 52
    invoke-direct {p0, p4, v1}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->processScopedCacheRoot(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    .line 53
    .line 54
    .line 55
    move-result-object p4

    .line 56
    new-instance v1, Ljava/io/File;

    .line 57
    .line 58
    invoke-direct {p0, p1}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->safeFileName(Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-direct {v1, p4, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/io/File;->isDirectory()Z

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    if-nez p1, :cond_1

    .line 70
    .line 71
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    if-eqz p1, :cond_0

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_0
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    const-string p2, "\u65e0\u6cd5\u521b\u5efaNative\u7f13\u5b58\u76ee\u5f55: "

    .line 83
    .line 84
    invoke-static {p2, p1}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-static {p1}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :cond_1
    :goto_0
    sget-object p1, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->nativeLoadLock:Ljava/lang/Object;

    .line 93
    .line 94
    monitor-enter p1

    .line 95
    :try_start_0
    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p4

    .line 99
    sget-object v2, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->loadedNativeLibraries:Ljava/util/ArrayList;

    .line 100
    .line 101
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 106
    .line 107
    .line 108
    move-result v3

    .line 109
    if-eqz v3, :cond_4

    .line 110
    .line 111
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    move-object v4, v3

    .line 116
    check-cast v4, Leb/z;

    .line 117
    .line 118
    iget-object v5, v4, Leb/z;->a:Ljava/lang/String;

    .line 119
    .line 120
    invoke-virtual {v5, p4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v5

    .line 124
    if-eqz v5, :cond_3

    .line 125
    .line 126
    iget-object v4, v4, Leb/z;->c:Ljava/lang/ClassLoader;

    .line 127
    .line 128
    if-ne v4, p3, :cond_3

    .line 129
    .line 130
    const/4 v4, 0x1

    .line 131
    goto :goto_1

    .line 132
    :catchall_0
    move-exception p2

    .line 133
    goto/16 :goto_3

    .line 134
    .line 135
    :cond_3
    const/4 v4, 0x0

    .line 136
    :goto_1
    if-eqz v4, :cond_2

    .line 137
    .line 138
    goto :goto_2

    .line 139
    :cond_4
    const/4 v3, 0x0

    .line 140
    :goto_2
    check-cast v3, Leb/z;

    .line 141
    .line 142
    if-eqz v3, :cond_6

    .line 143
    .line 144
    iget-object p3, v3, Leb/z;->b:Ljava/lang/String;

    .line 145
    .line 146
    invoke-static {p3, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 150
    if-eqz p3, :cond_5

    .line 151
    .line 152
    monitor-exit p1

    .line 153
    return-void

    .line 154
    :cond_5
    :try_start_1
    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object p2

    .line 158
    new-instance p3, Ljava/lang/StringBuilder;

    .line 159
    .line 160
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 161
    .line 162
    .line 163
    const-string p4, "SO\u5185\u5bb9\u5df2\u66f4\u65b0\uff0c\u4f46JNI ClassLoader\u672a\u53d8\u5316\uff1b\u8bf7\u91cd\u65b0\u52a0\u8f7d\u63d2\u4ef6\u5e76\u4f20\u5165\u65b0JNI\u7c7b\u7684ClassLoader\uff0c\u5bbf\u4e3bClassLoader\u65e0\u6cd5\u70ed\u66f4\u65b0: "

    .line 164
    .line 165
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object p2

    .line 175
    new-instance p3, Ljava/lang/IllegalArgumentException;

    .line 176
    .line 177
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object p2

    .line 181
    invoke-direct {p3, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    throw p3

    .line 185
    :cond_6
    sget-object v2, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->nativeLoadSequence:Ljava/util/concurrent/atomic/AtomicLong;

    .line 186
    .line 187
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicLong;->incrementAndGet()J

    .line 188
    .line 189
    .line 190
    move-result-wide v2

    .line 191
    const/16 v4, 0x24

    .line 192
    .line 193
    invoke-static {v4}, La/a;->w(I)V

    .line 194
    .line 195
    .line 196
    invoke-static {v2, v3, v4}, Ljava/lang/Long;->toString(JI)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    invoke-static {p3}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 204
    .line 205
    .line 206
    move-result v3

    .line 207
    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v3

    .line 211
    new-instance v4, Ljava/io/File;

    .line 212
    .line 213
    sget-object v5, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->INSTANCE:Lh/Hchat/hooks/items/script/ScriptPluginRuntime;

    .line 214
    .line 215
    invoke-static {p2}, Ldg/l;->e0(Ljava/io/File;)Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v6

    .line 219
    invoke-direct {v5, v6}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->safeFileName(Ljava/lang/String;)Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v6

    .line 223
    new-instance v7, Ljava/lang/StringBuilder;

    .line 224
    .line 225
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    const-string v6, "_"

    .line 232
    .line 233
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 237
    .line 238
    .line 239
    const-string v6, "_"

    .line 240
    .line 241
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 242
    .line 243
    .line 244
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    const-string v3, "_"

    .line 248
    .line 249
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 253
    .line 254
    .line 255
    const-string v2, ".so"

    .line 256
    .line 257
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 258
    .line 259
    .line 260
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v2

    .line 264
    invoke-direct {v4, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    invoke-direct {v5, p2, v4, v0}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->copyNativeLibrary(Ljava/io/File;Ljava/io/File;Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object p2

    .line 274
    const/16 v1, 0x124

    .line 275
    .line 276
    invoke-static {p2, v1}, Landroid/system/Os;->chmod(Ljava/lang/String;I)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v4}, Ljava/io/File;->canWrite()Z

    .line 280
    .line 281
    .line 282
    move-result p2

    .line 283
    if-nez p2, :cond_7

    .line 284
    .line 285
    invoke-direct {v5, v4, p3}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->loadNativeLibrary(Ljava/io/File;Ljava/lang/ClassLoader;)V

    .line 286
    .line 287
    .line 288
    sget-object p2, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->loadedNativeLibraries:Ljava/util/ArrayList;

    .line 289
    .line 290
    new-instance v1, Leb/z;

    .line 291
    .line 292
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 293
    .line 294
    .line 295
    invoke-direct {v1, p4, p3, v0}, Leb/z;-><init>(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)V

    .line 296
    .line 297
    .line 298
    invoke-interface {p2, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 299
    .line 300
    .line 301
    monitor-exit p1

    .line 302
    return-void

    .line 303
    :cond_7
    :try_start_2
    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object p2

    .line 307
    new-instance p3, Ljava/lang/StringBuilder;

    .line 308
    .line 309
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 310
    .line 311
    .line 312
    const-string p4, "Native\u7f13\u5b58\u65e0\u6cd5\u8bbe\u4e3a\u53ea\u8bfb: "

    .line 313
    .line 314
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 315
    .line 316
    .line 317
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 318
    .line 319
    .line 320
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object p2

    .line 324
    new-instance p3, Ljava/lang/IllegalArgumentException;

    .line 325
    .line 326
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move-result-object p2

    .line 330
    invoke-direct {p3, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 331
    .line 332
    .line 333
    throw p3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 334
    :goto_3
    monitor-exit p1

    .line 335
    throw p2

    .line 336
    :cond_8
    const-string p1, "\u5bbf\u4e3bContext\u4e0d\u53ef\u7528"

    .line 337
    .line 338
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 339
    .line 340
    .line 341
    return-void

    .line 342
    :cond_9
    invoke-virtual {p2}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 343
    .line 344
    .line 345
    move-result-object p1

    .line 346
    const-string p2, "SO\u6587\u4ef6\u6269\u5c55\u540d\u5fc5\u987b\u662f .so: "

    .line 347
    .line 348
    invoke-static {p2, p1}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 349
    .line 350
    .line 351
    move-result-object p1

    .line 352
    invoke-static {p1}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 353
    .line 354
    .line 355
    return-void

    .line 356
    :cond_a
    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 357
    .line 358
    .line 359
    move-result-object p1

    .line 360
    const-string p2, "SO\u6587\u4ef6\u4e0d\u5b58\u5728: "

    .line 361
    .line 362
    invoke-static {p2, p1}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object p1

    .line 366
    invoke-static {p1}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 367
    .line 368
    .line 369
    return-void
.end method

.method public final prepareSnsPostMedia(Ljava/lang/String;Lbsh/Interpreter;Ljava/lang/String;Ljava/util/function/Consumer;)Z
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lbsh/Interpreter;",
            "Ljava/lang/String;",
            "Ljava/util/function/Consumer<",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    if-nez p3, :cond_0

    .line 8
    .line 9
    const-string p3, ""

    .line 10
    .line 11
    :cond_0
    invoke-static {p3}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 12
    .line 13
    .line 14
    move-result-object p3

    .line 15
    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 20
    .line 21
    .line 22
    move-result p3

    .line 23
    const/4 v9, 0x0

    .line 24
    if-nez p3, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    if-nez p4, :cond_2

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    invoke-static {}, Lbc/e;->q()Lp8/d0;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    if-eqz v1, :cond_3

    .line 35
    .line 36
    sget-object p3, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->snsPrepareSequence:Ljava/util/concurrent/atomic/AtomicLong;

    .line 37
    .line 38
    invoke-virtual {p3}, Ljava/util/concurrent/atomic/AtomicLong;->incrementAndGet()J

    .line 39
    .line 40
    .line 41
    move-result-wide v3

    .line 42
    new-instance p3, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string v0, ":"

    .line 51
    .line 52
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p3, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    new-instance v3, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 69
    .line 70
    invoke-direct {v3, v9}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 71
    .line 72
    .line 73
    sget-object p3, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->snsPrepareCancellations:Ljava/util/concurrent/ConcurrentHashMap;

    .line 74
    .line 75
    invoke-interface {p3, v6, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    :try_start_0
    sget-object p3, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->snsPrepareExecutor:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 79
    .line 80
    new-instance v0, Lca/j;

    .line 81
    .line 82
    const/4 v8, 0x2

    .line 83
    move-object v4, p1

    .line 84
    move-object v5, p2

    .line 85
    move-object v7, p4

    .line 86
    invoke-direct/range {v0 .. v8}, Lca/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/io/Serializable;Ljava/io/Serializable;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p3, v0}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 90
    .line 91
    .line 92
    const/4 p1, 0x1

    .line 93
    return p1

    .line 94
    :catch_0
    sget-object p1, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->snsPrepareCancellations:Ljava/util/concurrent/ConcurrentHashMap;

    .line 95
    .line 96
    invoke-virtual {p1, v6, v3}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    :cond_3
    :goto_0
    return v9
.end method

.method public final refreshCallbacks(Ljava/lang/String;Lbsh/Interpreter;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    sget-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->loadedPlugins:Ljava/util/concurrent/ConcurrentHashMap;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Leb/a0;

    .line 14
    .line 15
    if-eqz p1, :cond_e

    .line 16
    .line 17
    invoke-direct {p0, p2}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->interpreterLock(Lbsh/Interpreter;)Ljava/util/concurrent/locks/ReentrantLock;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 22
    .line 23
    .line 24
    :try_start_0
    sget-object v1, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->INSTANCE:Lh/Hchat/hooks/items/script/ScriptPluginRuntime;

    .line 25
    .line 26
    invoke-direct {v1, p2}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->detectCallbacks(Lbsh/Interpreter;)Leb/y;

    .line 27
    .line 28
    .line 29
    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 31
    .line 32
    .line 33
    iget-boolean v0, p1, Leb/a0;->c:Z

    .line 34
    .line 35
    const/4 v1, 0x1

    .line 36
    const/4 v2, 0x0

    .line 37
    if-nez v0, :cond_1

    .line 38
    .line 39
    iget-boolean v0, p2, Leb/y;->a:Z

    .line 40
    .line 41
    if-eqz v0, :cond_0

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    move v0, v2

    .line 45
    goto :goto_1

    .line 46
    :cond_1
    :goto_0
    move v0, v1

    .line 47
    :goto_1
    iput-boolean v0, p1, Leb/a0;->c:Z

    .line 48
    .line 49
    iget-boolean v0, p1, Leb/a0;->d:Z

    .line 50
    .line 51
    if-nez v0, :cond_3

    .line 52
    .line 53
    iget-boolean v0, p2, Leb/y;->b:Z

    .line 54
    .line 55
    if-eqz v0, :cond_2

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_2
    move v0, v2

    .line 59
    goto :goto_3

    .line 60
    :cond_3
    :goto_2
    move v0, v1

    .line 61
    :goto_3
    iput-boolean v0, p1, Leb/a0;->d:Z

    .line 62
    .line 63
    iget-boolean v0, p1, Leb/a0;->e:Z

    .line 64
    .line 65
    if-nez v0, :cond_5

    .line 66
    .line 67
    iget-boolean v0, p2, Leb/y;->c:Z

    .line 68
    .line 69
    if-eqz v0, :cond_4

    .line 70
    .line 71
    goto :goto_4

    .line 72
    :cond_4
    move v0, v2

    .line 73
    goto :goto_5

    .line 74
    :cond_5
    :goto_4
    move v0, v1

    .line 75
    :goto_5
    iput-boolean v0, p1, Leb/a0;->e:Z

    .line 76
    .line 77
    iget-boolean v0, p1, Leb/a0;->f:Z

    .line 78
    .line 79
    if-nez v0, :cond_7

    .line 80
    .line 81
    iget-boolean v0, p2, Leb/y;->d:Z

    .line 82
    .line 83
    if-eqz v0, :cond_6

    .line 84
    .line 85
    goto :goto_6

    .line 86
    :cond_6
    move v0, v2

    .line 87
    goto :goto_7

    .line 88
    :cond_7
    :goto_6
    move v0, v1

    .line 89
    :goto_7
    iput-boolean v0, p1, Leb/a0;->f:Z

    .line 90
    .line 91
    iget-boolean v0, p1, Leb/a0;->g:Z

    .line 92
    .line 93
    if-nez v0, :cond_9

    .line 94
    .line 95
    iget-boolean v0, p2, Leb/y;->e:Z

    .line 96
    .line 97
    if-eqz v0, :cond_8

    .line 98
    .line 99
    goto :goto_8

    .line 100
    :cond_8
    move v0, v2

    .line 101
    goto :goto_9

    .line 102
    :cond_9
    :goto_8
    move v0, v1

    .line 103
    :goto_9
    iput-boolean v0, p1, Leb/a0;->g:Z

    .line 104
    .line 105
    iget-boolean v0, p1, Leb/a0;->h:Z

    .line 106
    .line 107
    if-nez v0, :cond_b

    .line 108
    .line 109
    iget-boolean v0, p2, Leb/y;->f:Z

    .line 110
    .line 111
    if-eqz v0, :cond_a

    .line 112
    .line 113
    goto :goto_a

    .line 114
    :cond_a
    move v0, v2

    .line 115
    goto :goto_b

    .line 116
    :cond_b
    :goto_a
    move v0, v1

    .line 117
    :goto_b
    iput-boolean v0, p1, Leb/a0;->h:Z

    .line 118
    .line 119
    iget-boolean v0, p1, Leb/a0;->i:Z

    .line 120
    .line 121
    if-nez v0, :cond_d

    .line 122
    .line 123
    iget-boolean p2, p2, Leb/y;->g:Z

    .line 124
    .line 125
    if-eqz p2, :cond_c

    .line 126
    .line 127
    goto :goto_c

    .line 128
    :cond_c
    move v1, v2

    .line 129
    :cond_d
    :goto_c
    iput-boolean v1, p1, Leb/a0;->i:Z

    .line 130
    .line 131
    invoke-direct {p0}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->updateProtobufPacketListener()V

    .line 132
    .line 133
    .line 134
    return-void

    .line 135
    :catchall_0
    move-exception p1

    .line 136
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 137
    .line 138
    .line 139
    throw p1

    .line 140
    :cond_e
    return-void
.end method

.method public final declared-synchronized refreshPluginObserver(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    sget-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->pluginDirObservers:Ljava/util/concurrent/ConcurrentHashMap;

    .line 9
    .line 10
    invoke-virtual {v0, p2}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Landroid/os/FileObserver;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/os/FileObserver;->stopWatching()V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception p1

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    :goto_0
    sget-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->reloadTasks:Ljava/util/concurrent/ConcurrentHashMap;

    .line 25
    .line 26
    invoke-virtual {v0, p2}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    check-cast p2, Ljava/lang/Runnable;

    .line 31
    .line 32
    if-eqz p2, :cond_1

    .line 33
    .line 34
    sget-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->mainHandler:Landroid/os/Handler;

    .line 35
    .line 36
    invoke-virtual {v0, p2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 37
    .line 38
    .line 39
    :cond_1
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    if-eqz p2, :cond_2

    .line 44
    .line 45
    move-object p1, p2

    .line 46
    :cond_2
    invoke-direct {p0, p1}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->startPluginObservers(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    .line 49
    monitor-exit p0

    .line 50
    return-void

    .line 51
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 52
    throw p1
.end method

.method public final declared-synchronized reloadPlugin-gIAlu-s(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Object;
    .locals 7

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    move-object v2, v0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move-object v2, p1

    .line 17
    :goto_0
    sput-object v2, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->appContext:Landroid/content/Context;

    .line 18
    .line 19
    const-string p1, "Hchat_script_plugin_config"

    .line 20
    .line 21
    invoke-static {v2, p1}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    const-string v0, "script_plugin_enable"

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    const-string v0, "script_plugin_item_"

    .line 35
    .line 36
    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-nez p1, :cond_2

    .line 45
    .line 46
    :cond_1
    move-object v1, p0

    .line 47
    goto/16 :goto_3

    .line 48
    .line 49
    :cond_2
    invoke-virtual {p0, v2}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->listPlugins(Landroid/content/Context;)Ljava/util/List;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 61
    if-eqz v0, :cond_4

    .line 62
    .line 63
    :try_start_1
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    move-object v1, v0

    .line 68
    check-cast v1, Leb/c0;

    .line 69
    .line 70
    iget-object v1, v1, Leb/c0;->a:Ljava/lang/String;

    .line 71
    .line 72
    invoke-virtual {v1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 76
    if-eqz v1, :cond_3

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :catchall_0
    move-exception v0

    .line 80
    move-object p1, v0

    .line 81
    move-object v1, p0

    .line 82
    goto :goto_4

    .line 83
    :cond_4
    const/4 v0, 0x0

    .line 84
    :goto_1
    :try_start_2
    move-object v4, v0

    .line 85
    check-cast v4, Leb/c0;

    .line 86
    .line 87
    if-eqz v4, :cond_7

    .line 88
    .line 89
    iget-object p1, v4, Leb/c0;->i:Ljava/util/Set;

    .line 90
    .line 91
    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    .line 92
    .line 93
    .line 94
    move-result p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 95
    if-eqz p1, :cond_5

    .line 96
    .line 97
    :try_start_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 98
    .line 99
    const-string p2, "\u63d2\u4ef6 process \u914d\u7f6e\u65e0\u6548"

    .line 100
    .line 101
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    new-instance p2, Lsf/f;

    .line 105
    .line 106
    invoke-direct {p2, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 107
    .line 108
    .line 109
    monitor-exit p0

    .line 110
    return-object p2

    .line 111
    :cond_5
    :try_start_4
    sget-object p1, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->runtimeProcess:Ljava/lang/String;

    .line 112
    .line 113
    invoke-direct {p0, v4, p1}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->supportsProcess(Leb/c0;Ljava/lang/String;)Z

    .line 114
    .line 115
    .line 116
    move-result p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 117
    if-nez p1, :cond_6

    .line 118
    .line 119
    :try_start_5
    sget-object p1, Lsf/n;->a:Lsf/n;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 120
    .line 121
    monitor-exit p0

    .line 122
    return-object p1

    .line 123
    :cond_6
    :try_start_6
    invoke-direct {p0, v2}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->currentBridge(Landroid/content/Context;)Lh/Hchat/hooks/items/script/ScriptPluginBridge;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    sget-object p1, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->runtimeProcess:Ljava/lang/String;

    .line 128
    .line 129
    const-string p2, "main"

    .line 130
    .line 131
    invoke-static {p1, p2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v6
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 135
    const/4 v5, 0x1

    .line 136
    move-object v1, p0

    .line 137
    :try_start_7
    invoke-direct/range {v1 .. v6}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->loadPlugin-yxL6bBk(Landroid/content/Context;Lh/Hchat/hooks/items/script/ScriptPluginBridge;Leb/c0;ZZ)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 141
    monitor-exit p0

    .line 142
    return-object p1

    .line 143
    :catchall_1
    move-exception v0

    .line 144
    :goto_2
    move-object p1, v0

    .line 145
    goto :goto_4

    .line 146
    :catchall_2
    move-exception v0

    .line 147
    move-object v1, p0

    .line 148
    goto :goto_2

    .line 149
    :cond_7
    move-object v1, p0

    .line 150
    :try_start_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 151
    .line 152
    new-instance v0, Ljava/lang/StringBuilder;

    .line 153
    .line 154
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 155
    .line 156
    .line 157
    const-string v2, "\u672a\u627e\u5230\u63d2\u4ef6: "

    .line 158
    .line 159
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object p2

    .line 169
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    new-instance p2, Lsf/f;

    .line 173
    .line 174
    invoke-direct {p2, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 175
    .line 176
    .line 177
    monitor-exit p0

    .line 178
    return-object p2

    .line 179
    :goto_3
    :try_start_9
    sget-object p1, Lsf/n;->a:Lsf/n;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 180
    .line 181
    monitor-exit p0

    .line 182
    return-object p1

    .line 183
    :goto_4
    :try_start_a
    monitor-exit p0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 184
    throw p1
.end method

.method public final reloadPluginAsync(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v0, Ljava/lang/Thread;

    .line 8
    .line 9
    new-instance v1, Leb/w;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-direct {v1, p1, p2, v2}, Leb/w;-><init>(Landroid/content/Context;Ljava/lang/String;I)V

    .line 13
    .line 14
    .line 15
    const-string p1, "Hchat-Script-Reload-"

    .line 16
    .line 17
    invoke-virtual {p1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-direct {v0, v1, p1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final scriptDir(Landroid/content/Context;)Ljava/io/File;
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    move-object p1, v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getExternalMediaDirs()[Ljava/io/File;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    if-eqz v1, :cond_3

    .line 17
    .line 18
    array-length v2, v1

    .line 19
    const/4 v3, 0x0

    .line 20
    move v4, v3

    .line 21
    :goto_0
    if-ge v4, v2, :cond_3

    .line 22
    .line 23
    aget-object v5, v1, v4

    .line 24
    .line 25
    if-eqz v5, :cond_1

    .line 26
    .line 27
    const/4 v6, 0x1

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    move v6, v3

    .line 30
    :goto_1
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 31
    .line 32
    .line 33
    move-result-object v6

    .line 34
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 35
    .line 36
    .line 37
    move-result v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    if-eqz v6, :cond_2

    .line 39
    .line 40
    move-object v0, v5

    .line 41
    goto :goto_2

    .line 42
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :catchall_0
    :cond_3
    :goto_2
    if-eqz v0, :cond_4

    .line 46
    .line 47
    goto :goto_3

    .line 48
    :cond_4
    new-instance v0, Ljava/io/File;

    .line 49
    .line 50
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    const-string v1, "/storage/emulated/0/Android/media/"

    .line 55
    .line 56
    invoke-static {v1, p1}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    :goto_3
    new-instance p1, Ljava/io/File;

    .line 64
    .line 65
    const-string v1, "Hchat/\u811a\u672c\u63d2\u4ef6"

    .line 66
    .line 67
    invoke-direct {p1, v0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    return-object p1
.end method

.method public final sendProtobufPacket(Ljava/lang/String;IIILjava/lang/String;Ljava/util/function/Consumer;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "III",
            "Ljava/lang/String;",
            "Ljava/util/function/Consumer<",
            "Lh/Hchat/hooks/items/script/ScriptPluginRuntime$SendResult;",
            ">;)Z"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object v0, p6

    .line 23
    new-instance p6, Leb/t;

    const/4 v1, 0x0

    invoke-direct {p6, v0, v1}, Leb/t;-><init>(Ljava/util/function/Consumer;I)V

    invoke-static/range {p1 .. p6}, Lwa/j;->a(Ljava/lang/String;IIILjava/lang/String;Lwa/h;)Z

    move-result p1

    return p1
.end method

.method public final sendProtobufPacket(Ljava/lang/String;ILjava/lang/String;Ljava/util/function/Consumer;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            "Ljava/util/function/Consumer<",
            "Lh/Hchat/hooks/items/script/ScriptPluginRuntime$SendResult;",
            ">;)Z"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v5, Leb/t;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    invoke-direct {v5, p4, v0}, Leb/t;-><init>(Ljava/util/function/Consumer;I)V

    .line 11
    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x0

    .line 15
    move-object v0, p1

    .line 16
    move v1, p2

    .line 17
    move-object v4, p3

    .line 18
    invoke-static/range {v0 .. v5}, Lwa/j;->a(Ljava/lang/String;IIILjava/lang/String;Lwa/h;)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    return p1
.end method

.method public final declared-synchronized setGlobalEnabled-gIAlu-s(Landroid/content/Context;Z)Ljava/lang/Object;
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    move-object p1, v0

    .line 12
    :cond_0
    sput-object p1, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->appContext:Landroid/content/Context;

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->ensureDirs(Landroid/content/Context;)Ljava/io/File;

    .line 15
    .line 16
    .line 17
    invoke-direct {p0, p1}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->startPluginObservers(Landroid/content/Context;)V

    .line 18
    .line 19
    .line 20
    if-eqz p2, :cond_1

    .line 21
    .line 22
    invoke-direct {p0}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->isScriptApiReady()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 29
    .line 30
    const-string p2, "\u5fae\u4fe1\u8054\u7cfb\u4eba\u6570\u636e\u5e93\u5c1a\u672a\u5c31\u7eea\uff0c\u8bf7\u7a0d\u540e\u91cd\u8bd5"

    .line 31
    .line 32
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    new-instance p2, Lsf/f;

    .line 36
    .line 37
    invoke-direct {p2, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    .line 40
    monitor-exit p0

    .line 41
    return-object p2

    .line 42
    :catchall_0
    move-exception p1

    .line 43
    goto :goto_2

    .line 44
    :cond_1
    :try_start_1
    const-string v0, "Hchat_script_plugin_config"

    .line 45
    .line 46
    invoke-static {p1, v0}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    if-eqz p2, :cond_2

    .line 51
    .line 52
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    const-string v2, "script_plugin_enable"

    .line 57
    .line 58
    const/4 v3, 0x1

    .line 59
    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 64
    .line 65
    .line 66
    invoke-direct {p0, p1}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->currentBridge(Landroid/content/Context;)Lh/Hchat/hooks/items/script/ScriptPluginBridge;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-direct {p0, p1, v1}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->loadEnabledPlugins-gIAlu-s(Landroid/content/Context;Lh/Hchat/hooks/items/script/ScriptPluginBridge;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    goto :goto_0

    .line 75
    :cond_2
    invoke-direct {p0}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->unloadAllPlugins-d1pmJ48()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    :goto_0
    instance-of v1, p1, Lsf/f;

    .line 80
    .line 81
    if-nez v1, :cond_3

    .line 82
    .line 83
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    const-string v1, "script_plugin_enable"

    .line 88
    .line 89
    invoke-interface {v0, v1, p2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 90
    .line 91
    .line 92
    move-result-object p2

    .line 93
    invoke-interface {p2}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 94
    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_3
    if-eqz p2, :cond_4

    .line 98
    .line 99
    invoke-direct {p0}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->unloadAllPlugins-d1pmJ48()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 103
    .line 104
    .line 105
    move-result-object p2

    .line 106
    const-string v0, "script_plugin_enable"

    .line 107
    .line 108
    const/4 v1, 0x0

    .line 109
    invoke-interface {p2, v0, v1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 110
    .line 111
    .line 112
    move-result-object p2

    .line 113
    invoke-interface {p2}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 114
    .line 115
    .line 116
    :cond_4
    :goto_1
    monitor-exit p0

    .line 117
    return-object p1

    .line 118
    :goto_2
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 119
    throw p1
.end method

.method public final declared-synchronized setPluginEnabled-0E7RQCE(Landroid/content/Context;Ljava/lang/String;Z)Ljava/lang/Object;
    .locals 9

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    move-object v2, v0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move-object v2, p1

    .line 17
    :goto_0
    sput-object v2, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->appContext:Landroid/content/Context;

    .line 18
    .line 19
    invoke-virtual {p0, v2}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->ensureDirs(Landroid/content/Context;)Ljava/io/File;

    .line 20
    .line 21
    .line 22
    invoke-direct {p0, v2}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->startPluginObservers(Landroid/content/Context;)V

    .line 23
    .line 24
    .line 25
    const-string p1, "Hchat_script_plugin_config"

    .line 26
    .line 27
    invoke-static {v2, p1}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 28
    .line 29
    .line 30
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 31
    const/4 v0, 0x0

    .line 32
    if-eqz p3, :cond_3

    .line 33
    .line 34
    :try_start_1
    invoke-virtual {p0, v2}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->listPlugins(Landroid/content/Context;)Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-eqz v3, :cond_2

    .line 47
    .line 48
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    move-object v4, v3

    .line 53
    check-cast v4, Leb/c0;

    .line 54
    .line 55
    iget-object v4, v4, Leb/c0;->a:Ljava/lang/String;

    .line 56
    .line 57
    invoke-virtual {v4, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    if-eqz v4, :cond_1

    .line 62
    .line 63
    move-object v0, v3

    .line 64
    goto :goto_1

    .line 65
    :catchall_0
    move-exception v0

    .line 66
    move-object p1, v0

    .line 67
    move-object v1, p0

    .line 68
    goto/16 :goto_6

    .line 69
    .line 70
    :cond_2
    :goto_1
    check-cast v0, Leb/c0;

    .line 71
    .line 72
    if-eqz v0, :cond_4

    .line 73
    .line 74
    :cond_3
    move-object v4, v0

    .line 75
    goto :goto_2

    .line 76
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 77
    .line 78
    new-instance p3, Ljava/lang/StringBuilder;

    .line 79
    .line 80
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 81
    .line 82
    .line 83
    const-string v0, "\u672a\u627e\u5230\u63d2\u4ef6: "

    .line 84
    .line 85
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p2

    .line 95
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    new-instance p2, Lsf/f;

    .line 99
    .line 100
    invoke-direct {p2, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 101
    .line 102
    .line 103
    monitor-exit p0

    .line 104
    return-object p2

    .line 105
    :goto_2
    const/4 v0, 0x0

    .line 106
    if-eqz p3, :cond_5

    .line 107
    .line 108
    :try_start_2
    const-string v1, "script_plugin_enable"

    .line 109
    .line 110
    invoke-interface {p1, v1, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    if-eqz v1, :cond_5

    .line 115
    .line 116
    if-eqz v4, :cond_5

    .line 117
    .line 118
    sget-object v1, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->INSTANCE:Lh/Hchat/hooks/items/script/ScriptPluginRuntime;

    .line 119
    .line 120
    const-string v3, "main"

    .line 121
    .line 122
    invoke-direct {v1, v4, v3}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->supportsProcess(Leb/c0;Ljava/lang/String;)Z

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    const/4 v3, 0x1

    .line 127
    if-ne v1, v3, :cond_5

    .line 128
    .line 129
    invoke-direct {p0}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->isScriptApiReady()Z

    .line 130
    .line 131
    .line 132
    move-result v1

    .line 133
    if-nez v1, :cond_5

    .line 134
    .line 135
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 136
    .line 137
    const-string p2, "\u5fae\u4fe1\u8054\u7cfb\u4eba\u6570\u636e\u5e93\u5c1a\u672a\u5c31\u7eea\uff0c\u8bf7\u7a0d\u540e\u91cd\u8bd5"

    .line 138
    .line 139
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    new-instance p2, Lsf/f;

    .line 143
    .line 144
    invoke-direct {p2, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 145
    .line 146
    .line 147
    monitor-exit p0

    .line 148
    return-object p2

    .line 149
    :cond_5
    if-eqz p3, :cond_a

    .line 150
    .line 151
    if-eqz v4, :cond_9

    .line 152
    .line 153
    :try_start_3
    iget-object v1, v4, Leb/c0;->i:Ljava/util/Set;

    .line 154
    .line 155
    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    .line 156
    .line 157
    .line 158
    move-result v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 159
    if-eqz v1, :cond_6

    .line 160
    .line 161
    :try_start_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 162
    .line 163
    const-string v1, "\u63d2\u4ef6 process \u914d\u7f6e\u65e0\u6548"

    .line 164
    .line 165
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    new-instance v1, Lsf/f;

    .line 169
    .line 170
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 171
    .line 172
    .line 173
    :goto_3
    move-object v0, v1

    .line 174
    move-object v1, p0

    .line 175
    goto :goto_5

    .line 176
    :cond_6
    :try_start_5
    const-string v1, "script_plugin_enable"

    .line 177
    .line 178
    invoke-interface {p1, v1, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 179
    .line 180
    .line 181
    move-result v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 182
    if-nez v0, :cond_7

    .line 183
    .line 184
    :try_start_6
    sget-object v1, Lsf/n;->a:Lsf/n;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 185
    .line 186
    goto :goto_3

    .line 187
    :cond_7
    :try_start_7
    const-string v0, "main"

    .line 188
    .line 189
    invoke-direct {p0, v4, v0}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->supportsProcess(Leb/c0;Ljava/lang/String;)Z

    .line 190
    .line 191
    .line 192
    move-result v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 193
    if-nez v0, :cond_8

    .line 194
    .line 195
    :try_start_8
    sget-object v1, Lsf/n;->a:Lsf/n;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 196
    .line 197
    goto :goto_3

    .line 198
    :cond_8
    :try_start_9
    invoke-direct {p0, v2}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->currentBridge(Landroid/content/Context;)Lh/Hchat/hooks/items/script/ScriptPluginBridge;

    .line 199
    .line 200
    .line 201
    move-result-object v3
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 202
    const/16 v7, 0x10

    .line 203
    .line 204
    const/4 v8, 0x0

    .line 205
    const/4 v5, 0x1

    .line 206
    const/4 v6, 0x0

    .line 207
    move-object v1, p0

    .line 208
    :try_start_a
    invoke-static/range {v1 .. v8}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->loadPlugin-yxL6bBk$default(Lh/Hchat/hooks/items/script/ScriptPluginRuntime;Landroid/content/Context;Lh/Hchat/hooks/items/script/ScriptPluginBridge;Leb/c0;ZZILjava/lang/Object;)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    goto :goto_5

    .line 213
    :catchall_1
    move-exception v0

    .line 214
    :goto_4
    move-object p1, v0

    .line 215
    goto :goto_6

    .line 216
    :catchall_2
    move-exception v0

    .line 217
    move-object v1, p0

    .line 218
    goto :goto_4

    .line 219
    :cond_9
    move-object v1, p0

    .line 220
    const-string p1, "Required value was null."

    .line 221
    .line 222
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 223
    .line 224
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    throw p2

    .line 228
    :cond_a
    move-object v1, p0

    .line 229
    sget-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->reloadTasks:Ljava/util/concurrent/ConcurrentHashMap;

    .line 230
    .line 231
    invoke-virtual {v0, p2}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    check-cast v0, Ljava/lang/Runnable;

    .line 236
    .line 237
    if-eqz v0, :cond_b

    .line 238
    .line 239
    sget-object v2, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->mainHandler:Landroid/os/Handler;

    .line 240
    .line 241
    invoke-virtual {v2, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 242
    .line 243
    .line 244
    :cond_b
    invoke-direct {p0, p2}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->unloadPlugin-IoAF18A(Ljava/lang/String;)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    :goto_5
    instance-of v2, v0, Lsf/f;

    .line 249
    .line 250
    if-nez v2, :cond_c

    .line 251
    .line 252
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 253
    .line 254
    .line 255
    move-result-object p1

    .line 256
    const-string v2, "script_plugin_item_"

    .line 257
    .line 258
    invoke-virtual {v2, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object p2

    .line 262
    invoke-interface {p1, p2, p3}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 263
    .line 264
    .line 265
    move-result-object p1

    .line 266
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 267
    .line 268
    .line 269
    :cond_c
    invoke-direct {p0}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->notifyPluginCatalogChanged()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 270
    .line 271
    .line 272
    monitor-exit p0

    .line 273
    return-object v0

    .line 274
    :goto_6
    :try_start_b
    monitor-exit p0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    .line 275
    throw p1
.end method

.method public final subscribePluginCatalog(Landroid/content/Context;Lfg/a;)Leb/b0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lfg/a;",
            ")",
            "Leb/b0;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    move-object p1, v0

    .line 14
    :cond_0
    sput-object p1, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->appContext:Landroid/content/Context;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->ensureDirs(Landroid/content/Context;)Ljava/io/File;

    .line 17
    .line 18
    .line 19
    invoke-direct {p0, p1}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->startPluginObservers(Landroid/content/Context;)V

    .line 20
    .line 21
    .line 22
    sget-object p1, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->pluginCatalogListeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 23
    .line 24
    invoke-virtual {p1, p2}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    new-instance p1, Leb/b0;

    .line 28
    .line 29
    invoke-direct {p1, p2}, Leb/b0;-><init>(Lfg/a;)V

    .line 30
    .line 31
    .line 32
    return-object p1
.end method

.method public final useCallback(Ljava/lang/String;Lbsh/Interpreter;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    if-eqz p3, :cond_0

    .line 9
    .line 10
    invoke-static {p3}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 11
    .line 12
    .line 13
    move-result-object p3

    .line 14
    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p3

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move-object p3, v0

    .line 20
    :goto_0
    const-string v1, ""

    .line 21
    .line 22
    if-nez p3, :cond_1

    .line 23
    .line 24
    move-object p3, v1

    .line 25
    :cond_1
    if-eqz p4, :cond_2

    .line 26
    .line 27
    invoke-static {p4}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 28
    .line 29
    .line 30
    move-result-object p4

    .line 31
    invoke-virtual {p4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    :cond_2
    if-nez v0, :cond_3

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_3
    move-object v1, v0

    .line 39
    :goto_1
    invoke-direct {p0, p3, v1}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->callbackWrapper(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p3

    .line 43
    invoke-direct {p0, p2}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->interpreterLock(Lbsh/Interpreter;)Ljava/util/concurrent/locks/ReentrantLock;

    .line 44
    .line 45
    .line 46
    move-result-object p4

    .line 47
    invoke-virtual {p4}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 48
    .line 49
    .line 50
    :try_start_0
    invoke-virtual {p2, p3}, Lbsh/Interpreter;->eval(Ljava/lang/String;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    sget-object p3, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->INSTANCE:Lh/Hchat/hooks/items/script/ScriptPluginRuntime;

    .line 54
    .line 55
    invoke-virtual {p3, p1, p2}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->refreshCallbacks(Ljava/lang/String;Lbsh/Interpreter;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    .line 57
    .line 58
    invoke-virtual {p4}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :catchall_0
    move-exception p1

    .line 63
    invoke-virtual {p4}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 64
    .line 65
    .line 66
    throw p1
.end method
